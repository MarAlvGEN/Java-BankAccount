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
    protected String describir() {
        return super.describir() + " | Tasa mensual: " + tasaInteresMensual + "%";
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
    protected void realizarRetiro(double monto) {
        realizarRetiro(monto, false);
    }

    protected void realizarRetiro(double monto, boolean esUrgente) {
        double saldoResultante = getSaldo() - monto;

        if (esUrgente && (saldoResultante < this.saldoMinimo)) {
            setSaldo(saldoResultante - 12000);
        } else {
            setSaldo(saldoResultante);
        }
    }

    protected double calcularInteresDelMes() {
        return getSaldo() * tasaInteresMensual / 100;
    }
}
