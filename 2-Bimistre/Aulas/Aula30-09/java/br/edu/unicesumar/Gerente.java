package br.edu.unicesumar;

public class Gerente extends Funcionario{
    private String departamento;

    public Gerente(String nome, String cpf, double salario, String departamento) {
        super(nome, cpf, salario);
        this.departamento = departamento;
    }
    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    public String getDepartamento() {
        return departamento;
    }

    @Override
    public double getBonus(){
        return getSalario()*0.15;
    }
}
