package quatro.equipe;

import quatro.equipe.csv.Listagem;


import java.io.IOException;


public class Main {

        public static void main(String[] args) throws IOException
        {
            Listagem listagem = new Listagem();

            listagem.mostraPessoas();
            listagem.mostraProprietario();
            listagem.mostraVeterinario();
            listagem.mostraPaciente();

            listagem.leObjetoPessoa();
            listagem.leObjetoProprietario();
            listagem.leObjetoVeterinario();
            listagem.leObjetoPaciente();


            System.out.println("---------------teste Pessoa---------------");

            listagem.retornaObjetoPessoa();


            System.out.println("---------------teste veterinario---------------");


            listagem.retornaObjetoVeterinario();

            System.out.println("---------------teste Proprietario---------------");

            listagem.retornaObjetoProprietario();


            System.out.println("---------------teste Paciente---------------");


            listagem.retornaObjetoPaciente();


            System.out.println("Terminar arquivo.txt");

            System.out.println("---------------teste Comparator Proprietario ---------------");

            listagem.mostraProprietarioCrescente();

            System.out.println("---------------teste Comparator Consulta ---------------");

            listagem.mostraConsultaData();


        }
}
