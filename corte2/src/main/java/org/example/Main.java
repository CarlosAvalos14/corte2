package org.example;

import org.example.model.Estudiante;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sesión 24/9/2024");

        Estudiante andres = new Estudiante("22020330", "Andres");
        Estudiante nelson = new Estudiante("220340330", "Nelson");
        Estudiante karen = new Estudiante("220450670", "Karen");

        // Almacenarlos en una lista
        ArrayList<Estudiante> listado = new ArrayList<>();
        listado.add(andres);
        listado.add(nelson);
        listado.add(karen);

        // Imprimir la lista de estudiantes
        for (Estudiante estudiante : listado) {
            System.out.println(estudiante);
        }
    }
}
