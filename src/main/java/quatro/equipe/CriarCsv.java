package quatro.equipe;

import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import quatro.equipe.model.*;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CriarCsv {

    public static void main(String[] args) throws IOException, CsvDataTypeMismatchException, CsvRequiredFieldEmptyException {

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("100.000.000-01", "Luana", "Medina", "1995/04/22"));
        pessoas.add(new Pessoa("200.000.000-01", "Pedro", "Augusto", "1996/04/22"));
        pessoas.add(new Pessoa("300.000.000-01", "Thiago", "Medeiro", "1997/04/22"));
        pessoas.add(new Pessoa("400.000.000-01", "TIsac", "Medeiro", "1997/04/22"));
        Writer writer = Files.newBufferedWriter(Paths.get("db/pessoas.csv"));
        StatefulBeanToCsv<Pessoa> pessoaToCsv = new StatefulBeanToCsvBuilder(writer).build();

        pessoaToCsv.write(pessoas);

        writer.flush();
        writer.close();

        // criando proprietario
        List<Proprietario> proprietarios = new ArrayList<>();
        proprietarios.add(new Proprietario(1,pessoas.get(0), "Avenida primavera, Condomínio Girassol II apt 408", "01 9 0000-0002"));
        proprietarios.add(new Proprietario(2,pessoas.get(1), "Rua das laranjas,  Fazenda Campo Belo", "01 9 0000-0001"));
        Writer writerProprietario = Files.newBufferedWriter(Paths.get("db/proprietario.csv"));
        StatefulBeanToCsv<Proprietario> proprietarioToCsv = new StatefulBeanToCsvBuilder(writerProprietario).build();

        proprietarioToCsv.write(proprietarios);

        writerProprietario.flush();
        writerProprietario.close();

        // criando veterinario
        List<Veterinario> veterinarios = new ArrayList<>();
        veterinarios.add(new Veterinario(1L,pessoas.get(0), "CRMV-0011-MG", "Animais Domésticos"));
        veterinarios.add(new Veterinario(2L,pessoas.get(0), "CRMV-0011-MG", "Animais Domésticos"));
        Writer writerVeterinario = Files.newBufferedWriter(Paths.get("db/veterinarios.csv"));
        StatefulBeanToCsv<Veterinario> veterinarioToCsv = new StatefulBeanToCsvBuilder(writerVeterinario).build();

        veterinarioToCsv.write(veterinarios);

        writerVeterinario.flush();
        writerVeterinario.close();

        // criando Paciente
        List<Paciente> pacientes = new ArrayList<>();
        pacientes.add(new Paciente("1L", "Gato", "Maine Coon", "Marrom", "2018/07/10", "Max", "M", proprietarios.get(0)));
        pacientes.add(new Paciente("1L", "Cachorro", "Pinche", "Preto", "2018/07/10", "Max", "M", proprietarios.get(0)));
        Writer writerPaciente = Files.newBufferedWriter(Paths.get("db/paciente.csv"));
        StatefulBeanToCsv<Paciente> PacienteioToCsv = new StatefulBeanToCsvBuilder(writerPaciente).build();

        PacienteioToCsv.write(pacientes);

        writerPaciente.flush();
        writerPaciente.close();


        // criando Paciente
        List<Consulta> consultas= new ArrayList<>();
        consultas.add(new Consulta( new Date(), pacientes.get(0), "Animal com caimento de pelos em excesso", veterinarios.get(0),
                "Foliculite bacteriana superficial",
                "Banhos semanais com clorexidina 3% (HEPTADERMI Spherulites), durante 8 semanas"));
        consultas.add(new Consulta(new Date(), pacientes.get(1),
                "Rachaduras nos cascos",
                veterinarios.get(1),
                "Animal tem caminhado em superficies duras e inóspitas, falta fazer manutencao nos cascos",
                "Limpar os cascos, utilizar reina nas linhas de fraturas para cobrir os machucados"));
        Writer writerConsulta = Files.newBufferedWriter(Paths.get("db/consultas.csv"));
        StatefulBeanToCsv<Consulta> ConsultaioToCsv = new StatefulBeanToCsvBuilder(writerConsulta).build();

        ConsultaioToCsv.write(consultas);

        writerConsulta.flush();
        writerConsulta.close();
    }

}