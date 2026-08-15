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
    protected double calcularComision() {
        return penalizacionRetiroAnticipado;
    }

    protected double calcularComision(int mesesTranscurridos) {
        if (mesesTranscurridos >= plazoMeses) {
            return 0;
        } else {
            return penalizacionRetiroAnticipado;
        }
    }

    @Override
    protected String describir() {
        // TODO Auto-generated method stub
        return super.describir();
    }

    @Override
    protected void realizarRetiro(double monto) {
        // TODO Auto-generated method stub
        super.realizarRetiro(monto);
    }

}
