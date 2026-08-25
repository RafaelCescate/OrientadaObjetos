package br.edu.unicesumar;
public class Main {
    static void main() {

        Medico fengari = new Medico("Fengari Mavros", "123456789");

        Paciente placidus = new Paciente("Placidus Tyet", "12365479811");
        placidus.exibirDados();

        Consulta cirurgia = new Consulta("10/13/801", "22:00",fengari, placidus);
        cirurgia.exibirDados();
        fengari.exibirDados();
    }
}
