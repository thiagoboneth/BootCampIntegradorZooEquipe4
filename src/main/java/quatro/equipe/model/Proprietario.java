package quatro.equipe.model;

public class Proprietario{
    public Pessoa proprietario;
    public String endereco;
    public String telefone;

    public Proprietario(Pessoa proprietario, String endereco, String telefone) {
        this.proprietario = proprietario;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public Pessoa getProprietario() {
        return proprietario;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return ("\n----- PROPRIETARIO -----" + "\n"
                + "Propietario: " + this.proprietario + "\n"
                + "Endereco: " + this.endereco + "\n"
                + "Data Nascimento: " + this.telefone + "\n");
    }
}
