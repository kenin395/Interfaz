package org.example;

/*
 * Autor: Kenin Cusme
 * Fecha: 26/10/2025
 * Descripción: Clase concreta Terrestre que hereda de Vehiculo e implementa Motor.
 * Representa un vehículo que se desplaza en tierra.
 */
public class Terrestre extends Vehiculo implements Motor {

    /**
     * Constructor de la clase Terrestre
     * @param velocidadActual Parámetro que define la velocidad actual de un vehículo terrestre
     * @param velocidadMaxima Parámetro que define la velocidad máxima permitida para un
     * vehículo terrestre
     */
    public Terrestre(int velocidadActual, int velocidadMaxima) {
        // Invoca al constructor de la clase padre
        super(velocidadActual, velocidadMaxima);
    }

    /*
     * Implementación del método abstracto acelerar heredado de Vehiculo.
     */
    @Override
    public void acelerar(int velocidad) {
        int vel = velocidadActual + velocidad;
        if (vel > velocidadMaxima) {
            System.out.println("Supera la velocidad máxima permitida");
        } else {
            velocidadActual = vel;
        }
    }

    /*
     * Implementación del método abstracto frenar heredado de Vehiculo.
     */
    @Override
    public void frenar(int velocidad) {
        int vel = velocidadActual - velocidad;
        if (vel < 0) {
            System.out.println("La velocidad no puede ser negativa");
        } else {
            velocidadActual = vel;
        }
    }

    /**
     * Implementación del método abstracto calcularRevolucionesMotor de la interfaz Motor.
     */
    @Override
    public int calcularRevolucionMotor(int fuerza, int radio) {
        return (fuerza * radio);
    }
}