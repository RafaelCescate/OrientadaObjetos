package br.edu.unicesumar;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Funcionario rafa = new Funcionario("Rafael","123123123-12", 9800);
        Desenvolvedor ana = new Desenvolvedor("Ana", "123123123-13", 9800, "JAVA");
        Gerente helo = new Gerente("Heloysa","123123123-10", 9800, "Financeiro");

        System.out.printf("Bonus: %f\n", rafa.getBonus());
        System.out.printf("Bonus: %f\n", ana.getBonus());
        System.out.printf("Bonus: %f\n", helo.getBonus());


        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(rafa);
        funcionarios.add(ana);
        funcionarios.add(helo);

        for (Funcionario fun : funcionarios) {
            fun.calcularSalario();
        }
    }
}