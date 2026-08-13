package br.edu.unicesumar;

public class Produto {
    private String nome;
    private double preco;

    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco) {
        if (preco>=0){
            this.preco = preco;
        }
    }
}