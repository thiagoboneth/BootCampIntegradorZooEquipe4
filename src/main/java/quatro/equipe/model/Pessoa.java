package quatro.equipe.model;

public class Pessoa {
    public String cpf;
    public String nome;
    public String sobrenome;
    public String dataNascimento;

    public Pessoa(String cpf, String nome, String sobrenome, String dataNascimento) {
        this.cpf = cpf;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Pessoa{cpf='" + cpf + "\', nome=" + nome + ", sobrenome='" + sobrenome + ", dataNascimento='" + dataNascimento +  "\'}";
    }

}
