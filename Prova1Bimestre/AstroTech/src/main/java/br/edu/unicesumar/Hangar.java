package br.edu.unicesumar;

public class Hangar {
    private String nome;
    private int capacidadeMaxima;
    private NaveEspacial naveEspacial[];

    public Hangar(String nome, int capacidadeMaxima){
        this.nome=nome;
        this.capacidadeMaxima=capacidadeMaxima;
    }

    public void adicionarNave(NaveEspacial naveEspacial){
        if (capacidadeMaxima>this.naveEspacial.length){
            naveEspacial.setHangar(nome);
            this.naveEspacial[this.naveEspacial.length]=naveEspacial;
        }else {
            System.out.printf("\nCapacidade Maxima excedida\n");
        }
    }
}