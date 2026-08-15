package com.example.bankapp;

public class CuentaAhorros extends CuentaBancaria {
    protected double tasaInteresMensual;
    protected double saldoMinimo;

    public CuentaAhorros(String numeroDeCuenta, String titular, double saldo, double tasaInteresMensual,
            double saldoMinimo) {

        super(numeroDeCuenta, titular, saldo);
        this.tasaInteresMensual = tasaInteresMensual;
        this.saldoMinimo = saldoMinimo;
    }

    @Override
    protected double calcularComision() {
        if (getSaldo() >= saldoMinimo) {
            return 0;
        } else {
            return 12000;
        }
    }

    @Override
    protected String describir() {
        return super.describir() + " | Tasa Mensual: [" + tasaInteresMensual + "] \n";
    }

    protected void realizarRetiro(double monto, boolean esUrgente) {
        super.realizarRetiro(monto);
    }

    protected double calcularInteresDelMes() {
        return getSaldo() * tasaInteresMensual / 100;
    }
}
