package quatro.equipe.model;

public class Veterinario{
    public long idMedico;
    public Pessoa medico;
    public String numeroRegistro;
    public String especialidade;

    public Veterinario(Pessoa medico, String numeroRegistro, String especialidade) {
        this.medico = medico;
        this.numeroRegistro = numeroRegistro;
        this.especialidade = especialidade;
    }
    public Veterinario(long idMedico,Pessoa medico, String numeroRegistro, String especialidade) {
        this.idMedico = idMedico;
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
/*    public String toString() {
        return ("\n----- PROPRIETARIO -----" + "\n"
                + "MÃ©dico: " + this.medico + "\n"
                + "Registro: " + this.numeroRegistro + "\n"
                + "Especialidade: " + this.especialidade + "\n");
    }*/
    public String toString() {
        return "Veterinario{idMedico='" + idMedico + ", medico=" + medico + ", numeroRegistro=" + numeroRegistro+ ", especialidade=" + especialidade + "}";
    }

}