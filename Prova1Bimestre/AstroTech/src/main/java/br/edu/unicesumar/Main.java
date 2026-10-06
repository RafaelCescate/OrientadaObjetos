package br.edu.unicesumar;

public class Main {
    public static void main(String[] args) {
        Sonda voyager = new Sonda("Infravermelho", "Voyager",-1.0, 1970);
        Foguete artemis = new Foguete(280.0, "Artemis", 200.0, 2020);
        Engenheiro amraque = new Engenheiro("Amraque Prochenece", "nao sei o que e isso 123");
        amraque.inspecionar(voyager);
        Hangar a773b = new Hangar("A773B", 5);
        a773b.adicionarNave(voyager);
        a773b.adicionarNave(artemis);
        AgenciaEspacial astroTech = new AgenciaEspacial("AstroTech", "AT", "Lasgoli Magu VIII");
        astroTech.adicionarHangar(a773b);
        voyager.nomeHangar();
    }
}