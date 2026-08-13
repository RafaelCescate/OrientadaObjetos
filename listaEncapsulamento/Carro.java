package br.edu.unicesumar;

public class Carro {
    private String marca;
    private String modelo;
    private int velocidadeAtual;

    public void acelerar(int incremento){
        if((velocidadeAtual+incremento)<=180){
            velocidadeAtual=velocidadeAtual+incremento;
        }else{
            System.out.printf("\nVelocidade Máxima");
        }
    }
    public void frear(int decremento){
        if((velocidadeAtual-decremento)>=0){
            velocidadeAtual=velocidadeAtual-decremento;
        }else{
            System.out.printf("\nVelocidade Mínima");
        }
    }
}
