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
    protected String describir() {
        return super.describir() + " | Comisión por transacción: " + comisionPorTransaccion;
    }

    @Override
    protected double calcularComision() {
        return comisionPorTransaccion;
    }

    @Override
    protected void realizarRetiro(double monto) {
        double saldoResultante = getSaldo() - monto - calcularComision();

        if (saldoResultante < -limiteSobregiro) {
            System.out.println("El retiro no es posible");
        } else {
            setSaldo(saldoResultante);
        }
    }
}
