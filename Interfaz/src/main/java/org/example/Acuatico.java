package org.example;

/*
 * Autor: Kenin Cusme
 * Fecha: 26/10/2025
 * Descripción: Clase concreta Acuatico que hereda de Vehiculo e implementa Motor y Vela.
 * Representa un vehículo que se desplaza en el agua, usando motor o vela.
 */
public class Acuatico extends Vehiculo implements Motor, Vela {

    /*
     * Constructor de la clase Acuatico
     * @param velocidadActual Parámetro que define la velocidad actual de
     * un vehículo acuático
     * @param velocidadMaxima Parámetro que define la velocidad
     * máxima permitida para un vehículo acupático
     */
    public Acuatico(int velocidadActual, int velocidadMaxima) {
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

    /*
     * Implementación del método abstracto calcularRevolucionMotor de la interfaz Motor.
     */
    @Override
    public int calcularRevolucionMotor(int fuerza, int radio) {
        return (fuerza * radio);
    }

    /*
     * Implementación del método abstracto recomendarVelocidad de la interfaz Vela.
     */
    @Override
    public void recomedarVelocidad(int velocidadViento) {
        if (velocidadViento > 50 || velocidadViento <= 0) {
            System.out.println("Velocidad de viento no apropiada para recomendar.");
        } else {
            // Lógica simple de recomendación (asumida)
            System.out.println("Velocidad recomendada para el viento de " + velocidadViento + ": " + (velocidadViento * 2));
        }
    }
}