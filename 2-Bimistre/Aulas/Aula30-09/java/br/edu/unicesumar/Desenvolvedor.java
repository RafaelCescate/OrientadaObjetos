package br.edu.unicesumar;

public class Desenvolvedor extends Funcionario{
    private String lingaguemPrincipal;

    public Desenvolvedor(String nome, String cpf, double salario, String lingaguemPrincipal) {
        super(nome, cpf, salario);
        this.lingaguemPrincipal = lingaguemPrincipal;
    }

    public String getLingaguemPrincipal() {
        return lingaguemPrincipal;
    }

    @Override
    public double getBonus(){
        return getSalario()*0.10;
    }
}
