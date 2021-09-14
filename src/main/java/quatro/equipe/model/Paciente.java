package quatro.equipe.model;

public class Paciente {
    public String id;
    public String especie;
    public String raca;
    public String cor;
    public String dataNascimento;
    public String nome;
    public String sexo;
    public Proprietario proprietario;

    public Paciente(String id, String especie, String raca, String cor, String dataNascimento, String nome, String sexo, Proprietario proprietario) {
        this.id = id;
        this.especie = especie;
        this.raca = raca;
        this.cor = cor;
        this.dataNascimento = dataNascimento;
        this.nome = nome;
        this.sexo = sexo;
        this.proprietario = proprietario;
    }

    public String getId() {
        return id;
    }

    public String getEspecie() {
        return especie;
    }

    public String getRaca() {
        return raca;
    }

    public String getCor() {
        return cor;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    @Override
    public String toString() {
        return ("\n----- PACIENTE -----" + "\n"
                + "Id: " + this.id + "\n"
                + "Especie: " + this.especie+ "\n"
                + "Raca: " + this.raca + "\n"
                + "Cor: " + this.cor + "\n"
                + "Nome: " + this.nome + "\n"
                + "Sexo: " + this.sexo + "\n"
                + "Nome Proprietário: " + this.proprietario + "\n");
    }
}