package com.isw.model;

/**
 * Esta clase representa la inscripción de un alumno a un taller.
 *
 * @author Ángel Ruíz García - 00000248171
 */
public class Inscripcion {
    private Alumno alumno;
    private Taller taller;

    public Inscripcion(Alumno alumno, Taller taller) {
        this.alumno = alumno;
        this.taller = taller;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public Taller getTaller() {
        return taller;
    }

    @Override
    public String toString() {
        return "Inscripcion{" + "alumno=" + alumno + ", taller=" + taller + '}';
    }
}
