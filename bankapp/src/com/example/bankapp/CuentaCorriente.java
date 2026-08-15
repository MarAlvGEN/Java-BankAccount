package com.example.bankapp;

public class CuentaCorriente extends CuentaBancaria {

    protected double comisionPorTransaccion;
    protected double limiteSobregiro;

    public CuentaCorriente(String numeroDeCuenta, String titular, double saldo, double comisionPorTransaccion,
            double limiteSobregiro) {
        super(numeroDeCuenta, titular, saldo);
        this.comisionPorTransaccion = comisionPorTransaccion;
        this.limiteSobregiro = limiteSobregiro;
    }

    @Override
    protected double calcularComision() {
        // TODO Auto-generated method stub
        return super.calcularComision();
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
