package com.isw.model;

/**
 * Excepción personalizada para errores en el proceso de inscripción.
 *
 * @author Ángel Ruíz García - 00000248171
 */
public class InscripcionException extends Exception {

    /**
     * Constructor que establece un mensaje en la excepcion
     *
     * @param mensaje Mensaje de error de la excepción
     */
    public InscripcionException(String mensaje) {
        super(mensaje);
    }
}
