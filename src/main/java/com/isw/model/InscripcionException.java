package com.isw.model;

/**
 * Excepción personalizada para errores en el proceso de inscripción.
 * 
 * @author Ángel Ruíz García - 00000248171
 */
public class InscripcionException extends Exception {

    public InscripcionException(String mensaje) {
        super(mensaje);
    }
}