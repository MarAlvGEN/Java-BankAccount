package com.example.bankapp;

public class CuentaInversion extends CuentaBancaria {
    protected double tasaAnual;
    protected int plazoMeses;
    protected double penalizacionRetiroAnticipado;

    public CuentaInversion(String numeroDeCuenta, String titular, double saldo, double tasaAnual, int plazoMeses,
            double penalizacionRetiroAnticipado) {
        super(numeroDeCuenta, titular, saldo);
        this.tasaAnual = tasaAnual;
        this.plazoMeses = plazoMeses;
        this.penalizacionRetiroAnticipado = penalizacionRetiroAnticipado;
    }

    @Override
    protected String describir() {
        return super.describir() + " | Plazo: " + plazoMeses + " meses - Tasa Anual: " + tasaAnual + "%";
    }

    @Override
    protected double calcularComision() {
        return this.penalizacionRetiroAnticipado;
    }

    @Override
    protected void realizarRetiro(double monto) {
        setSaldo(getSaldo() - monto - calcularComision());
    }

    protected double calcularComision(int mesesTranscurridos) {
        if (mesesTranscurridos >= plazoMeses) {
            return 0;
        } else {
            return calcularComision();
        }
    }
}
