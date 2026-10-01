package br.edu.unicesumar;

public class Main {
    public static void main(String[] args) {

        Veiculo bicicleta = new Veiculo("BMX", "GTA: San Andreas");
        Carro fusca = new Carro("Volkswagen", "Fusca");
        Moto harley = new Moto("Harley Davidson", "Aquela bonita la");

        System.out.printf("Veiculo: %.2f\n", bicicleta.calcularPedagio());
        System.out.printf("Carro: %.2f\n", fusca.calcularPedagio());
        System.out.printf("Moto: %.2f\n", harley.calcularPedagio());
    }
}