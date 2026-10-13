package br.edu.unicesumar;

public class Main {
    public static void main(String[] args) {
        //Exercício 1
        Veiculo bicicleta = new Veiculo("BMX", "GTA: San Andreas");
        Carro fusca = new Carro("Volkswagen", "Fusca");
        Moto harley = new Moto("Harley Davidson", "Aquela bonita la");

        System.out.printf("\nExercício 1:\n");
        System.out.printf("Veiculo: %.2f\n", bicicleta.calcularPedagio());
        System.out.printf("Carro: %.2f\n", fusca.calcularPedagio());
        System.out.printf("Moto: %.2f\n", harley.calcularPedagio());

        //Exercício 2
        Cachorro prubiu = new Cachorro();
        Gato lep = new Gato();

        System.out.printf("\nExercício 2:\n");
        prubiu.emitirSom();
        lep.emitirSom();

        //Exercício 3
        Circulo bola = new Circulo(2.0);
        Quadrado menecrafiti = new Quadrado(4);

        System.out.printf("\nExercício 3:\n");
        System.out.printf("Circulo: %.1f\n", bola.calcularArea());
        System.out.printf("Quadrado: %.1f\n", menecrafiti.calcularArea());

        //Exercício 4
        Gerente haruki = new Gerente();
        Colaborador haruto = new Colaborador();

        System.out.printf("\nExercício 4:\n");
        System.out.printf("Haruki Taiyo Férias: %d\n", haruki.calcularFerias());
        System.out.printf("Haruto Férias: %d\n", haruto.calcularFerias());

        //Exercício 5
        Guerreiro thysia = new Guerreiro();
        Mago implacavel = new Mago();

        System.out.printf("\nExercício 5:\n");
        thysia.atacar();
        implacavel.atacar();

        //Exercício 6
        Violao viola = new Violao();
        Bateria batera = new Bateria();
        Piano pi = new Piano();

        System.out.printf("\nExercício 6:\n");
        viola.tocar();
        batera.tocar();
        pi.tocar();

        //Exercício 7
        //Resposta:
        //o metodo chamado será a sobrescrita que ocorre na classe B, ou seja "Mensagem da classe B"
        //pois a classe C é uma extensão da B, que por sua vez é uma extensão da A, porém o
        //primeiro metodo "mostrarMensagem" que será lido pela classe C será o da classe B.

        //Exercício 8
        //Resposta:
        //a existência de metodos que executam a mesma funcionalidade mas que possuem nomes
        //diferentes é um mau design, pois, mesmo que os calculos sejam diferentes, ambos
        //calculam impostos, e colocar nomes expecíficos para cada calculo pode funcionar no
        //momento, mas dificulta a manutenção do código futuramente.
        //o principal problema será devido ao grande número de itens, pois com métodos diferente
        //dificulta a existência de um laço de repetição para a execução da tarefa.
        //a solução para corrigir este código é usando a sobrescrista, deixando o metodo principal
        //na superclasse com o nome "calcularImposto", e sobrescrever esse metodo nas outras classes
        //alterando o valor da multiplicação.

        //Exercício 9

        //Exercício 10

    }
}