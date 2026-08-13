package br.edu.unicesumar;

public class Pessoa {
    private String nome;
    private int idade;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        //exc2
        if (idade>0) {
            this.idade = idade;
        }else {
            System.out.printf("\nErro: idade menor ou igual a 0 (zero)");
        }
    }
}