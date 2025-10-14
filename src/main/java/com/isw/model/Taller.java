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
    private String descripcion;
    private LocalDate fecha;
    private String horario;
    private Instructor instructor;
    private int cupo;
    private int inscritos;

    public Taller(int id, String nombre, String descripcion, LocalDate fecha, String horario, Instructor instructor, int cupo) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.horario = horario;
        this.instructor = instructor;
        this.cupo = cupo;
        this.inscritos = 0;
    }

    public boolean hayCupo() {
        return inscritos < cupo;
    }

    public void inscribirAlumno() {
        if (hayCupo()) {
            inscritos++;
        }
    }

    public String detalles() {
        return nombre + "\\nInstructor: " + instructor.getNombre()
                + "\\nFecha: " + fecha
                + "\\nHorario: " + horario
                + "\\nCupo disponible: " + (cupo - inscritos)
                + "\\n\\n" + descripcion;
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
}
