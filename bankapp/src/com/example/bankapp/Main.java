package com.example.bankapp;

public class Main {
    public static void main(String[] args) {

        CuentaBancaria cuenta1 = new CuentaAhorros("AH-001", "Ana Gomez", 100000, 0.5, 50000);
        CuentaBancaria cuenta2 = new CuentaCorriente("CC-002", "Distribuidora XYZ", 800000, 5000, 30000);
        CuentaBancaria cuenta3 = new CuentaInversion("IN-003", "Carlos Ruiz", 200000, 8, 12, 50000);

        System.out.println(cuenta1.describir());
        System.out.println(cuenta2.describir());
        System.out.println(cuenta3.describir());

        cuenta1.calcularComision();
    }
}
