package br.edu.unicesumar;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }

    public double getBonus(){
        return this.salario*0.05;
    }
    public void calcularSalario(){
        System.out.printf("Salario do Mês : %f\n", this.salario + getBonus());
    }
}
