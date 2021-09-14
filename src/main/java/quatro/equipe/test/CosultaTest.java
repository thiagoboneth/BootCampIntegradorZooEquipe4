package quatro.equipe.test;

import quatro.equipe.csv.Listagem;
import quatro.equipe.model.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class CosultaTest {


    public static void main(String[] args) throws IOException {
        Listagem listagem= new Listagem();
        // Cadastra pessoas
        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("100.000.000-01", "Luana", "Medina", "1995/04/22"),
                new Pessoa("100.000.000-05", "Paula", "Lima", "1988/10/10"),
                new Pessoa("200.000.000-00", "Ana" , "Oswald", "1998/08/15"),
                new Pessoa("000.000.000-02", "Durval" , "Torres", "1975/12/16")
        );

        List<Proprietario> proprietarios = Arrays.asList(
                new Proprietario(pessoas.get(2), "Avenida primavera, Condomínio Girassol II apt 408", "01 9 0000-0002"),
                new Proprietario(pessoas.get(3), "Rua das laranjas,  Fazenda Campo Belo", "01 9 0000-0001")
        );

        // Cadastra veterinarios(as)
        List<Veterinario> veterinarios = Arrays.asList(
                new Veterinario(pessoas.get(0), "CRMV-0011-MG", "Animais Domésticos"),
                new Veterinario(pessoas.get(1), "CRMV-0008-MG", "Animais Fazenda")
        );

        // Cadastra pacientes
        List<Paciente> pacientes = Arrays.asList(
                new Paciente(1L, "Gato", "Maine Coon", "Marrom", "2018/07/10", "Max", 'M', proprietarios.get(0)),
                new Paciente(2L, "Cavalo", "Arábe", "Preta", "2016/01/08", "Relâmpago Mcqueen", 'M', proprietarios.get(1))
        );

        // Cadastra consultas
        List<Consulta> consultas = Arrays.asList(
                new Consulta(new Date(), pacientes.get(0), "Animal com caimento de pelos em excesso", veterinarios.get(0),
                        "Foliculite bacteriana superficial",
                        "Banhos semanais com clorexidina 3% (HEPTADERMI Spherulites), durante 8 semanas"),
                new Consulta(new Date(), pacientes.get(1),
                        "Rachaduras nos cascos",
                        veterinarios.get(1),
                        "Animal tem caminhado em superficies duras e inóspitas, falta fazer manutencao nos cascos",
                        "Limpar os cascos, utilizar reina nas linhas de fraturas para cobrir os machucados")
        );

        System.out.println("--- Ordenacao por consultas por dataHora usando sort lambda crescente por nome ---") ;
        consultas.sort((Consulta c1, Consulta c2) -> c1.getDataHora().compareTo(c2.getDataHora()));
        consultas.forEach(System.out::println);
        System.out.println("--- fim ---\n") ;

        System.out.println("--- Ordenacao por ID usando sort lambda crescente por ID ---") ;
        consultas.sort((Consulta c1, Consulta c2) -> c1.getPaciente().id.compareTo(c2.getPaciente().id));
        consultas.forEach(System.out::println);
        System.out.println("--- fim ---\n") ;

        System.out.println("--- Ordenacao por ID usando sort lambda decrescente por ID ---") ;
        consultas.sort((Consulta c1, Consulta c2) -> c2.getPaciente().id.compareTo(c1.getPaciente().id));
        consultas.forEach(System.out::println);
        System.out.println("--- fim ---\n") ;

        System.out.println("--- Ordenacao por especie em ordem alfabetica usando sort lambda ---") ;
        consultas.sort((Consulta c1, Consulta c2) -> c2.getPaciente().especie.compareTo(c1.getPaciente().especie));
        consultas.forEach(System.out::println);
        System.out.println("--- fim ---\n") ;

        listagem.mostraPessoas();

        System.out.println("---------------teste retorno---------------");

        listagem.escreveObjeto();
        listagem.retornaObjeto();




    }
}
