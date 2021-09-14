package quatro.equipe.model;

public class Veterinario{
    public Pessoa medico;
    public String numeroRegistro;
    public String especialidade;

    public Veterinario(Pessoa medico, String numeroRegistro, String especialidade) {
        this.medico = medico;
        this.numeroRegistro = numeroRegistro;
        this.especialidade = especialidade;
    }

    public Pessoa getMedico() {
        return medico;
    }

    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    @Override
    public String toString() {
        return ("\n----- PROPRIETARIO -----" + "\n"
                + "Médico: " + this.medico + "\n"
                + "Registro: " + this.numeroRegistro + "\n"
                + "Especialidade: " + this.especialidade + "\n");
    }
}
