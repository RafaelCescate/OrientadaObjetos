package br.edu.unicesumar;

public class Consulta {
    private String data;
    private String hora;
    private Medico medico;
    private Paciente paciente;

    public Consulta(String data, String hora, Medico medico, Paciente paciente){
        this.data=data;
        this.hora=hora;
        this.medico=medico;
        this.paciente=paciente;
        this.medico.addConsulta(this);
    }

    public Medico getMedico() {
        return medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public  void exibirDados(){
        System.out.printf("\nConsulta\n");
        System.out.printf("Data/Hora: %s - %s | Medico: %s | Paciente: %s", data, hora, medico.getNome(), paciente.getNome());
    }
}
