package br.edu.unicesumar;

public class Foguete extends NaveEspacial{
    private double capacidadeCarga;

    public Foguete(double capacidadeCarga, String nome, double pesoToneladas, int anoFabricacao){
        super(nome, pesoToneladas, anoFabricacao);
        this.capacidadeCarga=capacidadeCarga;
    }
}
