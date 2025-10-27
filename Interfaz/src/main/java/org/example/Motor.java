package org.example;

/*
 * Autor: Kenin Cusme
 * Fecha: 26/10/2025
 * Descripción: Interfaz Motor.
 * Define el método para calcular las revoluciones de un motor, implementado
 * por vehículos con propulsión mecánica.
 */
public interface Motor {
    /*
     * Método abstracto que calcula las revoluciones del motor.
     * @param fuerza Parámetro que define la fuerza del motor.
     * @param radio Parámetro que define el radio del motor.
     * @return El cálculo de las revoluciones.
     */
    int calcularRevolucionMotor(int fuerza, int radio);
}