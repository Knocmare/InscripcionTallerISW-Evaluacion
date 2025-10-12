package com.isw.model;

/**
 * Esta clase representa un instructor dentro del sistema.
 *
 * @author Ángel Ruíz García - 00000248171
 */
public class Instructor {
    private String nombre;

    public Instructor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Instructor{" + "nombre=" + nombre + '}';
    }
    
}
