package org.example.dao;

import org.example.Operacion;
import org.example.model.Estudiante;

import java.util.ArrayList;

public class EstudianteDAO implements Operacion {
    private ArrayList<Estudiante> listado = new ArrayList<>();

    /**
     * Agrega un estudiante a la lista.
     * @param object Estudiante a agregar.
     */
    @Override
    public void create(Object object) {
        try {
            Estudiante estudiante = (Estudiante) object;
            listado.add(estudiante);
        } catch (ClassCastException e) {
            System.out.println("Error: El objeto no es un estudiante. " + e.getMessage());
        }
    }

    @Override
    public ArrayList<Object> read() {
        return new ArrayList<>(listado);
    }

    public ArrayList<Estudiante> showList() {
        return listado;
    }

    @Override
    public void update(Object object) {
        Estudiante est = (Estudiante) object;

        for (Estudiante estudiante : listado) {
            if (estudiante.getCif().equals(est.getCif())) {
                estudiante.setNombres(est.getNombres());
                estudiante.setApellidos(est.getApellidos());
                estudiante.setEmail(est.getEmail());
                estudiante.setTelefono(est.getTelefono());
                return; // Salimos al actualizar
            }
        }
    }

    @Override
    public void delete(String id) {
        for (Estudiante estudiante : listado) {
            if (estudiante.getCif().equals(id)) {
                listado.remove(estudiante);
                return; // Salimos al eliminar
            }
        }
    }

    @Override
    public Object search(String value) {
        for (Estudiante estudiante : listado) {
            if (estudiante.getCif().equals(value) || estudiante.getNombres().equals(value)) {
                return estudiante; // Retornamos el estudiante encontrado
            }
        }
        return null; // No encontrado
    }
}





