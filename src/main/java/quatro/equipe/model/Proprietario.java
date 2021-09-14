package quatro.equipe.model;


import java.util.Comparator;

public class Proprietario implements Comparator<Proprietario>, Comparable<Proprietario> {
    public Integer idProprietario;
    public Pessoa proprietario;
    public String endereco;
    public String telefone;

    public Proprietario(Integer idProprietario, Pessoa proprietario, String endereco, String telefone) {
        this.idProprietario = idProprietario;
        this.proprietario = proprietario;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public Proprietario(Integer idProprietario, String endereco, String telefone) {
        this.idProprietario = idProprietario;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public Proprietario() {

    }

    public Integer getIdProprietario() {
        return idProprietario;
    }

    public void setIdProprietario(Integer idProprietario) {
        this.idProprietario = idProprietario;
    }


    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
/*    public String toString() {
        return "Proprietario{idProprietario='" + idProprietario + ", proprietario=" + proprietario + ", endereco=" + endereco + ", telefone=" + telefone +  "}";
    }*/
    public String toString() {
        return "Proprietario{idProprietario='" + idProprietario + ", endereco=" + endereco + ", telefone=" + telefone +  "}";
    }

    @Override
    public int compareTo(Proprietario o) {
        return this.proprietario.nome.compareTo(o.proprietario.nome);
    }

    @Override
    public int compare(Proprietario o1, Proprietario o2) {
        return 0;
    }
}