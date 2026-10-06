package br.edu.unicesumar;

public class Sonda extends NaveEspacial{
    private String tipoSensor;

    public Sonda(String tipoSensor, String nome, double pesoToneladas, int anoFabricacao){
        super(nome, pesoToneladas, anoFabricacao);
        this.tipoSensor=tipoSensor;
    }
    public void nomeHangar(){
        System.out.printf("\n\nSonda: %s esta no Hangar: %s\n\n", nome,hangar);
    }
}
