package com.jesu.alchemy.model;

import java.util.List;

public class Receta {
    private final String nombre;
    private final String categoria;
    private final List<Ingrediente> ingredientes;

    public Receta(String nombre, String categoria, List<Ingrediente> ingredientes) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.ingredientes = ingredientes;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }
}
