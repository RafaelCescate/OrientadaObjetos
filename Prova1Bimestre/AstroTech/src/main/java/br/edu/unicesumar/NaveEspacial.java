package br.edu.unicesumar;

public class NaveEspacial {
    protected String nome;
    protected double pesoToneladas;
    protected int anoFabricacao;
    protected String hangar;

    public NaveEspacial(String nome, double pesoToneladas, int anoFabricacao){
        if (pesoToneladas<0.0){
            pesoToneladas=0.0;
        }
        this.nome=nome;
        this.pesoToneladas=pesoToneladas;
        this.anoFabricacao=anoFabricacao;
    }

    public void setHangar(String hangar){
        this.hangar=hangar;
    }
}
