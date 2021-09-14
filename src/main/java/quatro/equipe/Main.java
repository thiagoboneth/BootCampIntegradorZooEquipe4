package quatro.equipe;

import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import quatro.equipe.csv.CsvPessoa;
import quatro.equipe.csv.Listagem;
import quatro.equipe.model.Pessoa;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

        public static void main(String[] args) throws IOException, CsvDataTypeMismatchException, CsvRequiredFieldEmptyException
        {
            Listagem listagem = new Listagem();

            listagem.mostraPessoas();
            listagem.mostraProprietario();
            listagem.mostraVeterinario();

            listagem.leObjeto();
            listagem.leObjetoProprietario();
            listagem.leObjetoVeterinario();


            System.out.println("---------------teste Pessoa---------------");

            listagem.retornaObjetoPessoa();


            System.out.println("---------------teste veterinario---------------");


            listagem.retornaObjetoVeterinario();


            System.out.println("---------------teste Paciente---------------");


            System.out.println("Terminar arquivo.txt");


        }
}
