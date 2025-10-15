package com.isw.controller;

import com.isw.model.Alumno;
import com.isw.model.Inscripcion;
import com.isw.model.InscripcionException;
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

    /**
     * Obtiene una lista de talleres.
     *
     * @return Lista de talleres
     */
    public List<Taller> obtenerTalleres() {
        return sistema.obtenerTalleres();
    }

    /**
     * Obtiene al alumno usando el ID ingresado.
     *
     * @param id ID ingresado
     * @return Alumno encontrado
     */
    public Alumno buscarAlumno(String id) {
        return sistema.buscarAlumno(id);
    }

    /**
     * Regresa la inscripcion creada.
     *
     * @param idAlumno ID del alumno
     * @param idTaller ID del taller
     * @return Inscripcion nueva
     * @throws InscripcionException Si la inscripcion presenta un error
     */
    public Inscripcion inscribir(String idAlumno, int idTaller) throws InscripcionException {
        return sistema.inscribir(idAlumno, idTaller);
    }

    public SistemaInscripcion getSistema() {
        return sistema;
    }
}
