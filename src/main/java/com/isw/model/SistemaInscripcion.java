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
    private List<Inscripcion> inscripciones = new ArrayList<>();

    public SistemaInscripcion() {
        // Datos de ejemplo
        talleres.add(new Taller(1, "Desarrollo Web", "Aprende HTML, CSS y JS",
                LocalDate.of(2025, 3, 12), "10:00 - 12:00", new Instructor("Mtro. Ruiz"), 2));
        talleres.add(new Taller(2, "Bases de Datos", "Introducción a SQL y modelado",
                LocalDate.of(2025, 3, 13), "09:00 - 11:00", new Instructor("Mtra. Gómez"), 1));
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

    public Inscripcion inscribir(String idAlumno, int idTaller) throws InscripcionException {
        Alumno alumno = buscarAlumno(idAlumno);
        Taller taller = buscarTaller(idTaller);

        if (alumno == null) {
            throw new InscripcionException("El alumno no existe.");
        }
        if (taller == null) {
            throw new InscripcionException("El taller no existe.");
        }

        // Verificar si ya está inscrito
        boolean yaInscrito = inscripciones.stream()
                .anyMatch(inscripcion -> inscripcion != null
                && inscripcion.getAlumno().getId().equalsIgnoreCase(idAlumno)
                && inscripcion.getTaller().getId() == idTaller);

        if (yaInscrito) {
            throw new InscripcionException("El alumno ya está inscrito en este taller.");
        }

        // Verificar cupo
        if (!taller.hayCupo()) {
            throw new InscripcionException("No hay cupo disponible en este taller.");
        }

        // Crear inscripción nueva
        taller.inscribirAlumno();
        Inscripcion ins = new Inscripcion(alumno, taller);
        inscripciones.add(ins);
        return ins;
    }
}
