package br.edu.unicesumar;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    public double getNota1() {
        return nota1;
    }
    public double getNota2() {
        return nota2;
    }
    public void setNota1(double nota) {
        nota1 = nota;
        setNotaX();
    }
    public void setNota2(double nota) {
        nota2 = nota;
        setNotaX();
    }
    private void setNotaX(){
        if (nota1>10){
            nota1=10;
        } else if(nota1<0){
            nota1=0;
        }
        if (nota2>10){
            nota2=10;
        }else if(nota2<0){
            nota2=0;
        }
    }
}