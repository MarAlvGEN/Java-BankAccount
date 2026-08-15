package com.example.bankapp;

public class CuentaBancaria {
    private String numeroDeCuenta;
    private String titular;
    private double saldo;

    public CuentaBancaria(String numeroDeCuenta, String titular, double saldo) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    protected String describir() {
        return "Cuenta: " + numeroDeCuenta + " | Titular: " + titular + " | Saldo: $" + saldo;
    }

    protected double calcularComision() {
        return 0;
    }

    protected void realizarRetiro(double monto) {
        setSaldo(saldo - monto);
    }

}
