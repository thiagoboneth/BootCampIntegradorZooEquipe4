package quatro.equipe;

import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import quatro.equipe.csv.CsvPessoa;
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

            List<Pessoa> pessoas = new ArrayList<>();
            pessoas.add(new Pessoa("100.000.000-01", "Luana", "Medina", "1995/04/22"));
            pessoas.add(new Pessoa("100.000.000-05", "Paula", "Lima", "1988/10/10"));
            pessoas.add(new Pessoa("200.000.000-00", "Ana" , "Oswald", "1998/08/15"));
            pessoas.add(new Pessoa("000.000.000-02", "Durval" , "Torres", "1975/12/16"));

            Writer writer = Files.newBufferedWriter(Paths.get("pessoas.csv"));
            StatefulBeanToCsv<Pessoa> beanToCsv = new StatefulBeanToCsvBuilder(writer).build();

            beanToCsv.write(pessoas);

            writer.flush();
            writer.close();

        }
}
