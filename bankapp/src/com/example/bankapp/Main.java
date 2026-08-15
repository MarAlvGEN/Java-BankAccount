package com.example.bankapp;

public class Main {
    public static void main(String[] args) {

        CuentaBancaria cuenta1 = new CuentaAhorros("AH-001", "Ana Gomez", 1000000, 0.5, 500000);
        CuentaBancaria cuenta2 = new CuentaCorriente("CC-002", "Distribuidora XYZ", 800000, 5000, 300000);
        CuentaBancaria cuenta3 = new CuentaInversion("IN-003", "Carlos Ruiz", 2000000, 8, 12, 50000);

        System.out.println(cuenta1.describir());
        System.out.println(cuenta2.describir());
        System.out.println(cuenta3.describir());

        System.out.println("------");

        System.out.println(cuenta1.calcularComision());
        System.out.println(cuenta2.calcularComision());
        System.out.println(cuenta3.calcularComision());

        System.out.println("------");

        cuenta1.realizarRetiro(500000);
        cuenta2.realizarRetiro(500000);
        cuenta3.realizarRetiro(500000);

        System.out.println("------");

        System.out.println(cuenta1.getSaldo());
        System.out.println(cuenta2.getSaldo());
        System.out.println(cuenta3.getSaldo());

        /*
         * ¿Por qué fue necesario usar CuentaBancaria como tipo de variable en lugar del
         * tipo específico? ¿Qué ventaja concreta te dio?
         *
         * Para aplicar Polimorfismo y así definir comportamientos comunes. Si más
         * adeltante quisiera agregar otro tipo de cuenta solo tendria que crear otra
         * clase, cambiar comportamientos especificos.
         */
    }
}
