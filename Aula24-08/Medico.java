package br.edu.unicesumar;

public class Medico {
    private String nome;
    private String crm;
    private Consulta[] consultas;

    public Medico(String nome, String crm){
        this.nome=nome;
        this.crm=crm;
        this.consultas= new Consulta[10];
    }

    public String getNome(){
        return nome;
    }

    public void addConsulta(Consulta consulta){
        this.consultas[0]=consulta;
    }

    public void exibirDados(){
        System.out.printf("\nMedico\n");
        System.out.printf("Nome: %s | CRM: %s", nome, crm);
        for (int i=0; i<10;i++){
            if (consultas[i]!= null){
                System.out.printf("\nConsulta[%d]: %s", i+1);
                consultas[i].exibirDados();
            }
        }
    }
}
