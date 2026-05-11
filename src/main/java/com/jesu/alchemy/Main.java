package com.jesu.alchemy;

import com.jesu.alchemy.model.Receta;
import com.jesu.alchemy.service.AlquimiaService;
import com.jesu.alchemy.service.MochilaStorage;

import java.util.*;

public class Main {

    private static final Map<String, Integer> mochila = new LinkedHashMap<>();
    private static final AlquimiaService servicio = new AlquimiaService();

    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║     CALCULADORA DE ALQUIMIA          ║");
        System.out.println("╚══════════════════════════════════════╝");
        mochila.putAll(MochilaStorage.cargar());
        verRecetasDisponibles();
    }

    private static void verRecetasDisponibles() {
        if (mochila.isEmpty()) {
            System.out.println("\nAgrega materiales primero.");
            return;
        }

        List<Receta> disponibles = servicio.recetasDisponibles(mochila);
        List<Receta> porCompletar = servicio.recetasPorCompletar(mochila);

        if (disponibles.isEmpty()) {
            System.out.println("\nCon tus materiales actuales no puedes crear ninguna receta.");
            if (!porCompletar.isEmpty())
                System.out.printf("Pero estás cerca de crear %d receta(s).%n", porCompletar.size());
            mostrarIngredientesFaltantes(porCompletar);
            return;
        }

        Map<String, List<Receta>> porCategoria = new LinkedHashMap<>();
        disponibles.forEach(r -> porCategoria
                .computeIfAbsent(r.getCategoria(), k -> new ArrayList<>()).add(r));

        System.out.printf("%n✓ Puedes crear %d receta(s):%n", disponibles.size());
        porCategoria.forEach((cat, recetas) -> {
            System.out.println("\n  ── " + cat + " ──");
            recetas.forEach(r -> {
                System.out.println("  → " + r.getNombre());
                r.getIngredientes().forEach(ing ->
                        System.out.printf("      %s x%d%n", ing.getNombre(), ing.getCantidad())
                );
            });
        });

        if (!porCompletar.isEmpty())
            System.out.printf("\nAdemás estás cerca de crear %d receta(s).%n", porCompletar.size());
        mostrarIngredientesFaltantes(porCompletar);
    }

    private static void mostrarIngredientesFaltantes(List<Receta> recetas) {
        recetas.forEach(receta -> {
            System.out.println("  → " + receta.getNombre());
            receta.getIngredientes().forEach(ing -> {
                int cantidadEnMochila = mochila.getOrDefault(ing.getNombre().toLowerCase(), 0);
                int faltante = ing.getCantidad() - cantidadEnMochila;
                if (faltante > 0)
                    System.out.printf("      %s x%d%n", ing.getNombre(), faltante);
                else
                    System.out.printf("      %s x%d (obtenido)%n", ing.getNombre(), ing.getCantidad());
            });
        });
    }
}