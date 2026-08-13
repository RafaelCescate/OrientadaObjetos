package br.edu.unicesumar;

public class ContaBancaria {
    private String titular;
    private double saldo;
    private int numeroConta;

    public void depositar(double valor){
        if (valor>0){
            saldo=saldo+valor;
        }
    }
    public void sacar(double valor){
        if (saldo>=valor){
            saldo=saldo-valor;
        }
    }
}