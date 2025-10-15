package com.isw.observer;

/**
 * Interfaz que define las operaciones básicas que debe implementar un sujeto
 * observable dentro del patrón Observer.
 *
 * @author Ángel Ruíz García - 00000248171
 */
public interface Observable {

    /**
     * Registra un nuevo observador en la lista de suscriptores del sujeto.
     *
     * @param o Objeto que implementa la interfaz y que recibe notificaciones
     */
    void addObserver(Observer o);

    /**
     * Elimina un observador previamente registrado para dejar de recibir
     * notificaciones de este sujeto.
     *
     * @param o Objeto observador que se desea eliminar
     */
    void removeObserver(Observer o);

    /**
     * Notifica a todos los observadores registrados sobre un cambio ocurrido en
     * el estado del sujeto.
     *
     * @param mensaje Descripción del cambio que será enviada a los observadores
     */
    void notifyObservers(String mensaje);
}
