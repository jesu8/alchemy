package com.jesu.alchemy.service;


import com.jesu.alchemy.data.RecetasData;
import com.jesu.alchemy.model.Receta;

import java.util.List;
import java.util.Map;

public class AlquimiaService {

    public List<Receta> recetasDisponibles(Map<String, Integer> mochila) {
        return RecetasData.TODAS.stream()
                .filter(receta -> receta.getIngredientes().stream()
                        .allMatch(ing -> mochila.getOrDefault(ing.getNombre().toLowerCase(), 0) >= ing.getCantidad()))
                .toList();
    }

    public List<Receta> recetasPorCompletar(Map<String, Integer> mochila) {
        return RecetasData.TODAS.stream()
                .filter(receta ->
                        receta.getIngredientes().stream().anyMatch(ing -> mochila.getOrDefault(ing.getNombre().toLowerCase(), 0) > 0) &&
                                receta.getIngredientes().stream().anyMatch(ing -> mochila.getOrDefault(ing.getNombre().toLowerCase(), 0) < ing.getCantidad())
                )
                .toList();
    }
}
