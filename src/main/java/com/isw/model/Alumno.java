package com.isw.model;

/**
 * Esta clase representa un alumno dentro del sistema.
 *
 * @author Ángel Ruíz García - 00000248171
 */
public class Alumno {
    private String id;
    private String nombre;
    private int semestre;
    private String programa;

    public Alumno(String id, String nombre, int semestre, String programa) {
        this.id = id;
        this.nombre = nombre;
        this.semestre = semestre;
        this.programa = programa;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSemestre() {
        return semestre;
    }

    public String getPrograma() {
        return programa;
    }

    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", nombre=" + nombre + ", semestre=" + semestre + ", programa=" + programa + '}';
    }
    
}
