package br.edu.unicesumar;

public class Usuario {
    private String nome;
    private String senha;

    public void setSenha(String senha) {
        if (senha.length()>=8){
            this.senha = senha;
        }else{
            System.out.printf("\nErro: senha contém menos de 8 caracteres");
        }
    }
}
