package br.edu.unicesumar;

public class Termostato {
    private int temperaturaAtual;
    private int temperaturaDesejada;

    public int getTemperaturaDesejada() {
        return temperaturaDesejada;
    }
    public void setTemperaturaDesejada(int temperaturaDesejada) {
        if (temperaturaDesejada>=15 && temperaturaDesejada<=30){
            this.temperaturaDesejada = temperaturaDesejada;
        }
    }
}
