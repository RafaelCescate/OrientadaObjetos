package br.edu.unicesumar;

public class Main {
    public static void main(String[] args) {
        //exc1 & exc2 (linha 18 da classe Pessoa)
        System.out.printf("\n\nexc1 & exc2");
        Pessoa lya = new Pessoa();
        lya.setNome("Kamilya Eali");
        lya.setIdade(20);
        lya.setIdade(-20);
        System.out.printf("\nPessoa\n");
        System.out.printf("Nome: %s\nIdade: %d", lya.getNome(), lya.getIdade());

        //exc3
        ContaBancaria lasgole = new ContaBancaria();
        lasgole.depositar(0);
        lasgole.depositar(10);
        lasgole.sacar(11);
        lasgole.sacar(9);

        //exc4
        System.out.printf("\n\nexc4");
        Funcionario tors = new Funcionario();
        tors.setSalario(-1400);
        tors.setSalario(4000);
        System.out.printf("\nSalário: %.2f", tors.getSalario());

        //exc5
        System.out.printf("\n\nexc5");
        Aluno gmener = new Aluno();
        gmener.setNota1(11);
        gmener.setNota2(11);
        gmener.setNota1(-10);
        gmener.setNota2(-10);
        System.out.printf("\nAluno\n");
        System.out.printf("Nota 1: %.1f\nNota 2: %.1f", gmener.getNota1(),gmener.getNota2());

        //exc6
        System.out.printf("\n\nexc6");
        Produto paoFrances = new Produto();
        paoFrances.setPreco(-3);
        System.out.printf("\nPreço: %.2f", paoFrances.getPreco());
        paoFrances.setPreco(4.99);
        System.out.printf("\nPreço: %.2f", paoFrances.getPreco());

        //exc7
        System.out.printf("\n\nexc7");
        Livro oHobbit = new Livro();
        oHobbit.emprestar();
        System.out.printf("\n%s", oHobbit.getDisponivel());
        oHobbit.devolver();
        System.out.printf("\n%s", oHobbit.getDisponivel());

        //exc8
        System.out.printf("\n\nexc8");
        Termostato carlos = new Termostato();
        carlos.setTemperaturaDesejada(20);
        System.out.printf("\nTemperatura Desejada: %d", carlos.getTemperaturaDesejada());
        carlos.setTemperaturaDesejada(40);
        System.out.printf("\nTemperatura Desejada: %d", carlos.getTemperaturaDesejada());

        //exc9
        System.out.printf("\n\nexc9");
        Usuario yuslim = new Usuario();
        yuslim.setSenha("gyozao");
        yuslim.setSenha("gyozaogostoso");

        //exc10
        System.out.printf("\n\nexc10");
        Carro fusca = new Carro();
        fusca.acelerar(180);
        fusca.acelerar(1);
        fusca.frear(180);
        fusca.frear(1);
    }
}