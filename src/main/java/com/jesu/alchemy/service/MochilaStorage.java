package com.jesu.alchemy.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;

public class MochilaStorage {
    private static final String ARCHIVO = "mochila.json";
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final Type TIPO = new TypeToken<LinkedHashMap<String, Integer>>() {
    }.getType();

    public static Map<String, Integer> cargar() {
        try (InputStream input = MochilaStorage.class.getClassLoader().getResourceAsStream(ARCHIVO)) {
            if (input == null) return new LinkedHashMap<>();
            Map<String, Integer> datosOriginales = GSON.fromJson(
                    new InputStreamReader(input, StandardCharsets.UTF_8), TIPO);
            Map<String, Integer> mochila = new LinkedHashMap<>();
            if (datosOriginales != null) {
                datosOriginales.forEach((nombre, cantidad) -> mochila.put(nombre.toLowerCase(), cantidad));
            }
            return mochila;
        } catch (IOException e) {
            System.err.println("No se pudo leer mochila.json: " + e.getMessage());
            return new LinkedHashMap<>();
        }
    }
}