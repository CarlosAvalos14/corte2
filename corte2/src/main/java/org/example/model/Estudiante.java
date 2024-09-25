package org.example.model;

import java.util.Objects;

public class Estudiante {

    private String cif;
    private String nombres;
    private String apellidos;
    private String email;
    private String telefono;

    public Estudiante() {
    }

    public Estudiante(String cif, String nombres, String apellidos, String email, String telefono) {
        this.cif = cif;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.telefono = telefono;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    @Override
    public String toString() {
        return "Estudiante{" +
                "nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                ", cif='" + cif + '\'' +
                '}';

}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estudiante that = (Estudiante) o;
        return Objects.equals(cif, that.cif) && Objects.equals(nombres, that.nombres) && Objects.equals(apellidos, that.apellidos) && Objects.equals(email, that.email) && Objects.equals(telefono, that.telefono);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cif, nombres, apellidos, email, telefono);
    }







}
