package com.example.myapplication;

public class Usuario {
    private String nombre;
    private String apellido;

    public Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return  nombre + " " + apellido ;
    }
}
