package com.isw.model;

import java.time.LocalDate;

/**
 * Esta clase representa un taller de Semana de ISW dentro del sistema.
 *
 * @author Ángel Ruíz García - 00000248171
 */
public class Taller {
    private int id;
    private String nombre;
    private Instructor instructor;
    private LocalDate fecha;
    private String horario;

    public Taller(int id, String nombre, Instructor instructor, LocalDate fecha, String horario) {
        this.id = id;
        this.nombre = nombre;
        this.instructor = instructor;
        this.fecha = fecha;
        this.horario = horario;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getHorario() {
        return horario;
    }

    @Override
    public String toString() {
        return "Taller{" + "id=" + id + ", nombre=" + nombre + ", instructor=" + instructor + ", fecha=" + fecha + ", horario=" + horario + '}';
    }
    
}
