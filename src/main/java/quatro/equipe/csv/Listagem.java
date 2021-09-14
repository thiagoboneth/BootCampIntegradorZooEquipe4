package quatro.equipe.csv;

import quatro.equipe.model.Pessoa;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Listagem {

    ArrayList<String> list = new ArrayList<>();

    public void mostraPessoas() throws IOException {

        Scanner scanner = new Scanner(new FileReader("pessoas3.csv")).useDelimiter("\\n");
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }

    }

    public void escreveObjeto() throws IOException {
        Scanner scanner1 = new Scanner(new FileReader("pessoas3.csv")).useDelimiter("\\n");
        while (scanner1.hasNext()) {
            list.add(scanner1.next());
        }
    }


    public void retornaObjeto() {
        list.forEach(System.out::println);
        list.forEach(x -> System.out.println(mapearParaPessoa(x).toString()));
    }

    public Pessoa mapearParaPessoa(String linha) {
        String[] valores = linha.replaceAll("\"","").split(",");
        Pessoa pessoa = new Pessoa(valores[0], valores[1], valores[2], valores[3]);
        return pessoa;
    }
}