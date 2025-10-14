package com.isw.model;

import java.time.LocalDateTime;

/**
 * Esta clase representa el ticket de inscripción.
 *
 * @author Ángel Ruíz García - 00000248171
 */
public class Inscripcion {
    private Alumno alumno;
    private Taller taller;
    private LocalDateTime fecha;

    public Inscripcion(Alumno alumno, Taller taller) {
        this.alumno = alumno;
        this.taller = taller;
        this.fecha = LocalDateTime.now();
    }

    public String generarTicket() {
        return "=== TICKET DE INSCRIPCIÓN ===\n"
                + "Folio: " + fecha.hashCode() + "\n"
                + "Fecha: " + fecha + "\n\n"
                + alumno.mostrarDatos() + "\n\n"
                + "Taller: " + taller.getNombre() + "\n"
                + "Instructor: " + taller.getInstructor().getNombre();
    }
}
