package br.edu.unicesumar;

import java.util.ArrayList;

public class AgenciaEspacial {
    private String nome;
    private String sigla;
    private CentroControle centroControle;
    private Hangar hangar[];

    public AgenciaEspacial(String nome, String sigla, String nomeDiretor){
        this.nome=nome;
        this.sigla=sigla;
        CentroControle centro = new CentroControle(nomeDiretor);
    }

    public void adicionarHangar(Hangar hangar){
        this.hangar[this.hangar.length]=hangar;
    }
}