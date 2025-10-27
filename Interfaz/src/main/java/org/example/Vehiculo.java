package org.example;

/*
 * Autor: Kenin Cusme
 * Fecha: 26/10/2025
 * Descripción: Clase abstracta Vehiculo.
 * Sirve como plantilla para todas las clases de vehículos (Terrestre, Acuatico, etc.).
 * Contiene atributos comunes como velocidadActual y velocidadMaxima, y métodos abstractos
 * que deben ser implementados por sus subclases concretas.
 */
public abstract class Vehiculo {
    int velocidadActual;
    int velocidadMaxima;

    public Vehiculo(int velocidadActual, int velocidadMaxima) {
        this.velocidadActual = velocidadActual;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void imprimir() {
        System.out.println("Velocidad Actual: " + velocidadActual);
        System.out.println("Velocidad Maxima: " + velocidadMaxima);
    }

    /*
     * Método abstracto que permite incrementar la velocidad de un
     * vehículo
     * @param velocidad Parámetro que define el incremento de la
     * velocidad de un vehículo
     */
    public abstract void acelerar(int velocidad);

    /*
     * Método abstarccto que permite decrementar la velocidad de un vehículo
     * @param velocidad Parámetro que define el decremento de la velocidad de un vehículo
     */
    public abstract void frenar(int velocidad);
}