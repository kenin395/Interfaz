package org.example;

/*
 * Autor: Kenin Cusme
 * Fecha: 26/10/2025
 * Descripción: Clase principal (Main) para demostrar la funcionalidad de la jerarquía de vehículos.
 * Muestra el uso de la herencia (Vehiculo) y las interfaces (Motor, Vela).
 */
public class Main {
    public static void main(String[] args) {
        // Creación y demostración de Terrestre
        Terrestre camioneta = new Terrestre(100, 250);
        System.out.println("camioneta");
        camioneta.imprimir();
        camioneta.acelerar(50);
        System.out.println("Nueva Velocidad actual = " + camioneta.velocidadActual);

        // Creación y demostración de Acuatico
        Acuatico motoAcuatica = new Acuatico(50, 110);
        System.out.println("Moto Acuática");
        motoAcuatica.imprimir();
        System.out.println("Revoluciones del motor = " + motoAcuatica.calcularRevolucionMotor(1200, 2));
        motoAcuatica.recomedarVelocidad(20);
    }
}