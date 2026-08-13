package br.edu.unicesumar;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        if (salario>-1){
            this.salario=salario;
        }
    }
}