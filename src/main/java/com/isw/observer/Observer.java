package com.isw.observer;

/**
 * Interfaz que define el contrato para los observadores.
 *
 * @author Ángel Ruíz García - 00000248171
 */
public interface Observer {

    /**
     * Se invoca automáticamente por el sujeto observado cuando ocurre un cambio
     * relevante en su estado.
     *
     * @param mensaje Descripción del cambio ocurrido
     */
    void update(String mensaje);
}
