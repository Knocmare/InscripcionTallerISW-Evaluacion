package com.isw.controller;

import com.isw.model.Alumno;
import com.isw.model.Inscripcion;
import com.isw.model.SistemaInscripcion;
import com.isw.model.Taller;
import java.util.List;

/**
 * Esta clase es el controlador que maneja la lógica de inscripción.
 * Controlador: coordina las llamadas entre la vista y el modelo.
 *
 * @author Ángel Ruíz García - 00000248171
 */
public class TallerController {

    private SistemaInscripcion sistema;

    public TallerController() {
        sistema = new SistemaInscripcion();
    }

    public List<Taller> obtenerTalleres() {
        return sistema.obtenerTalleres();
    }

    public Alumno buscarAlumno(String id) {
        return sistema.buscarAlumno(id);
    }

    public Inscripcion inscribir(String idAlumno, int idTaller) {
        return sistema.inscribir(idAlumno, idTaller);
    }
}
