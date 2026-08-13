package br.edu.unicesumar;

public class Livro {
    private String titulo;
    private String autor;
    private  boolean disponivel;

    public void emprestar(){
        disponivel=false;
    }
    public void devolver(){
        disponivel=true;
    }
    public boolean getDisponivel(){
        return disponivel;
    }
}
