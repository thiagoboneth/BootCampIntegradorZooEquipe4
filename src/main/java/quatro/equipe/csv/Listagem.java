package quatro.equipe.csv;

import quatro.equipe.model.Paciente;
import quatro.equipe.model.Pessoa;
import quatro.equipe.model.Proprietario;
import quatro.equipe.model.Veterinario;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Listagem {

    ArrayList<String> pessoas = new ArrayList<>();
    ArrayList<String> proprietario = new ArrayList<>();
    ArrayList<String> veterinario = new ArrayList<>();

    public void mostraPessoas() throws IOException {

        Scanner scanner = new Scanner(new FileReader("pessoas3.csv")).useDelimiter("\\n");
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
    }

    public void mostraProprietario() throws IOException {

        Scanner scanner = new Scanner(new FileReader("proprietario.csv")).useDelimiter("\\n");
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
    }

    public void mostraVeterinario() throws IOException {

        Scanner scanner = new Scanner(new FileReader("veterinarios.csv")).useDelimiter("\\n");
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
    }

    public void leObjeto() throws IOException {
        Scanner scanner1 = new Scanner(new FileReader("pessoas3.csv")).useDelimiter("\\n");
        while (scanner1.hasNext()) {
            pessoas.add(scanner1.next());
        }
    }

    public void leObjetoProprietario() throws IOException {
        Scanner scanner1 = new Scanner(new FileReader("proprietario.csv")).useDelimiter("\\n");
        while (scanner1.hasNext()) {
            proprietario.add(scanner1.next());
        }
    }

    public void leObjetoVeterinario() throws IOException {
        Scanner scanner1 = new Scanner(new FileReader("proprietario.csv")).useDelimiter("\\n");
        while (scanner1.hasNext()) {
            veterinario.add(scanner1.next());
        }
    }

    public void retornaObjetoPessoa() {
        pessoas.forEach(System.out::println);
        pessoas.forEach(x -> System.out.println(mapearParaPessoa(x).toString()));
    }
    public void retornaObjetoVeterinario() {
        veterinario.forEach(System.out::println);
        veterinario.forEach(x -> System.out.println(mapearParaVeterinario(x).toString()));
    }

    public void retornaObjetoProprietario() {
        proprietario.forEach(System.out::println);
        proprietario.forEach(x -> System.out.println(mapearParaVeterinario(x).toString()));
    }
//    public void retornaObjetoPaciente() {
//        proprietario.forEach(System.out::println);
//        proprietario.forEach(x -> System.out.println(mapearParaPaciente(x).toString()));
//    }

    public Pessoa mapearParaPessoa(String linha) {
        String[] valores = linha.replaceAll("\"","").split(",");
        Pessoa pessoa = new Pessoa(valores[0], valores[1], valores[2],valores[3]);
        return pessoa;
    }

    public Veterinario mapearParaVeterinario(String linha) {
        String[] valores = linha.replaceAll("\"","").split(",");
        Veterinario pessoa = new Veterinario(null,valores[1],valores[2]);
        return pessoa;
    }
//    public Paciente mapearParaPaciente(String linha) {
//        String[] valores = linha.replaceAll("\"","").split(",");
//        Proprietario proprietario = new Proprietario();
//        Paciente pessoa = new Paciente(valores[0],valores[1],valores[2],valores[3],valores[4],valores[5],valores[6],null);
//        return pessoa;
//    }
    public Proprietario mapearParaProprietario(String linha) {
        String[] valores = linha.replaceAll("\"","").split(",");
        Proprietario pessoa = new Proprietario(Integer.valueOf(valores[0]),valores[1],valores[2] );
        return pessoa;
}

}