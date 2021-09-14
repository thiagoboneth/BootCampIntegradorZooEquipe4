package quatro.equipe.model;

import java.util.Date;

public class Consulta {
    Date dataHora = new Date();
    public Paciente paciente;
    public String motivo;
    public Veterinario veterinario;
    public String diagnostico;
    public String tratamento;

    public Consulta( Date dataHora, Paciente paciente, String motivo, Veterinario veterinario, String diagnostico, String tratamento) {
        this.dataHora = dataHora;
        this.paciente = paciente;
        this.motivo = motivo;
        this.veterinario = veterinario;
        this.diagnostico = diagnostico;
        this.tratamento = tratamento;
    }

    public Consulta() {

    }


    public Date getDataHora() {
        return dataHora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public String getMotivo() {
        return motivo;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public String getTratamento() {
        return tratamento;
    }

    @Override
    public String toString() {
        return ("\n----- CONSULTA -----" + "\n"
                +"Data Hora: " + this.dataHora + "\n"
                + "Paciente: " + this.paciente + "\n"
                + "Motivo: " + this.motivo + "\n"
                + "Veterinario: " + this.veterinario + "\n"
                + "Diagnostico: " + this.diagnostico + "\n"
                + "Tratamento: " + this.tratamento  + "\n");

    }
}
