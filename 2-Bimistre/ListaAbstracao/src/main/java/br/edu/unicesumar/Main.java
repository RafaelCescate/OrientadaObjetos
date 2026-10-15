package br.edu.unicesumar;

public class Main {
    public static void main(String[] args) {
        //Exercício 1
        Carro fusca = new Carro("Volkswagen", "Fusca");
        Moto harley = new Moto("Harley Davidson", "Aquela bonita la");

        System.out.printf("\nExercício 1:\n");
        System.out.printf("Carro: %.2f\n", fusca.calcularPedagio());
        System.out.printf("Moto: %.2f\n", harley.calcularPedagio());

        //Exercício 2
        Circulo bola = new Circulo(2.0);
        Quadrado menecrafiti = new Quadrado(4);

        System.out.printf("\nExercício 3:\n");
        System.out.printf("Circulo: %.1f\n", bola.calcularArea());
        System.out.printf("Quadrado: %.1f\n", menecrafiti.calcularArea());

        //Exercício 3
    }
}