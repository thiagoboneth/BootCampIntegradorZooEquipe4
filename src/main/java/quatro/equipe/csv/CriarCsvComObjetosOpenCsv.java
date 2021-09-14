package quatro.equipe.csv;

import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import quatro.equipe.model.Pessoa;
import quatro.equipe.model.Proprietario;
import quatro.equipe.model.Veterinario;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CriarCsvComObjetosOpenCsv {

    public static void main(String[] args) throws IOException, CsvDataTypeMismatchException, CsvRequiredFieldEmptyException {

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("100.000.000-01", "Luana", "Medina", "1995/04/22"));
        pessoas.add(new Pessoa("200.000.000-01", "Pedro", "Augusto", "1996/04/22"));
        pessoas.add(new Pessoa("300.000.000-01", "Thiago", "Medeiro", "1997/04/22"));
        pessoas.add(new Pessoa("400.000.000-01", "TIsac", "Medeiro", "1997/04/22"));
        Writer writer = Files.newBufferedWriter(Paths.get("pessoas.csv"));
        StatefulBeanToCsv<Pessoa> pessoaToCsv = new StatefulBeanToCsvBuilder(writer).build();

        pessoaToCsv.write(pessoas);

        writer.flush();
        writer.close();

        // criando proprietario
        List<Proprietario> proprietarios = new ArrayList<>();
        proprietarios.add(new Proprietario(1,pessoas.get(0), "Avenida primavera, Condomínio Girassol II apt 408", "01 9 0000-0002"));
        proprietarios.add(new Proprietario(2,pessoas.get(1), "Rua das laranjas,  Fazenda Campo Belo", "01 9 0000-0001"));
        Writer writerProprietario = Files.newBufferedWriter(Paths.get("proprietario.csv"));
        StatefulBeanToCsv<Proprietario> proprietarioToCsv = new StatefulBeanToCsvBuilder(writerProprietario).build();

        proprietarioToCsv.write(proprietarios);

        writerProprietario.flush();
        writerProprietario.close();

        // criando proprietario
        List<Veterinario> veterinarios = new ArrayList<>();
        veterinarios.add(new Veterinario(1L,pessoas.get(0), "CRMV-0011-MG", "Animais Domésticos"));
        veterinarios.add(new Veterinario(2L,pessoas.get(0), "CRMV-0011-MG", "Animais Domésticos"));
        Writer writerVeterinario = Files.newBufferedWriter(Paths.get("veterinarios.csv"));
        StatefulBeanToCsv<Veterinario> veterinarioToCsv = new StatefulBeanToCsvBuilder(writerVeterinario).build();

        veterinarioToCsv.write(veterinarios);

        writerVeterinario.flush();
        writerVeterinario.close();




    }

}