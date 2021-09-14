package quatro.equipe.model;

import quatro.equipe.util.ArquivoUtil;

import java.io.File;
import java.util.List;

public class ConsultaDAO implements DAO<Consulta>{

    private File file;
    private ArquivoUtil arquivoUtil;

    @Override
    public void salva(Consulta consulta) {

    }

    @Override
    public void salva(List<Consulta> listagem) {

    }

    @Override
    public Consulta obter(String id) {
        return null;
    }

    @Override
    public List<Consulta> listagem() {
        return null;
    }
}
