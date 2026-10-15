package br.edu.unicesumar;

public abstract class Conta {
    protected String titular;
    protected double saldo;

    public abstract void calcularTaxas();
}
