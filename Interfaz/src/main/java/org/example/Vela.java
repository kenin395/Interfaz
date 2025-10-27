package org.example;

/*
 * Autor: Kenin Cusme
 * Fecha: 26/10/2025
 * Descripción: Interfaz Vela.
 * Modela el comportamiento de propulsión mediante la acción del viento,
 * destinado a ser implementado por vehículos acuáticos.
 */
public interface Vela {
    /*
     * Método abstracto que recomienda una determinada velocidad del cehpiculo de
     * acuerdo a la velocidad del viento
     * @param velocidadViento Parámetro que define la velocidad del
     * viento que influenciará en la velocidad actual del vehículo
     */
    void recomedarVelocidad(int velocidadViento);
}