package com.isw.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase simula una base de datos y contiene la lógica de búsqueda e
 * inscripción.
 *
 * @author Ángel Ruíz García - 00000248171
 */
public class SistemaInscripcion {

    private List<Taller> talleres = new ArrayList<>();
    private List<Alumno> alumnos = new ArrayList<>();

    public SistemaInscripcion() {
        // Datos de ejemplo
        talleres.add(new Taller(1, "Desarrollo Web", "Aprende HTML, CSS y JS",
                LocalDate.of(2025, 3, 12), "10:00 - 12:00", new Instructor("Mtro. Ruiz"), 25));
        talleres.add(new Taller(2, "Bases de Datos", "Introducción a SQL y modelado",
                LocalDate.of(2025, 3, 13), "09:00 - 11:00", new Instructor("Mtra. Gómez"), 20));
        alumnos.add(new Alumno("00000235678", "Carlos Pérez", 5, "Ingeniería de Software"));
        alumnos.add(new Alumno("00000263591", "Ana López", 4, "Sistemas Computacionales"));
    }

    public List<Taller> obtenerTalleres() {
        return talleres;
    }

    public Alumno buscarAlumno(String id) {
        return alumnos.stream().filter(a -> a.getId().equalsIgnoreCase(id)).findFirst().orElse(null);
    }

    public Taller buscarTaller(int id) {
        return talleres.stream().filter(t -> t.getId() == id).findFirst().orElse(null);
    }

    public Inscripcion inscribir(String idAlumno, int idTaller) {
        Alumno a = buscarAlumno(idAlumno);
        Taller t = buscarTaller(idTaller);
        if (a != null && t != null && t.hayCupo()) {
            t.inscribirAlumno();
            return new Inscripcion(a, t);
        }
        return null;
    }
}
