import model.Funcionario;
import repository.FuncionarioRepository;
import service.FuncionarioService;

import model.Diretor;
import repository.DiretorRepository;
import service.DiretorService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Diretor diretor = new Diretor(15, "Bif", "04696900975", 1.47, 96.6);
        DiretorService serviceDir = new DiretorService();
        serviceDir.save(diretor);
        diretor.setNome(diretor.getNome() + " - alterado");
        serviceDir.update(diretor);
        DiretorRepository repositoryDir = new DiretorRepository();
        repositoryDir.findAll();
        repositoryDir.findById(10);


        Funcionario funcionario = new Funcionario(16, "Biffff", "04696900975", 1.47);
        FuncionarioService serviceFunc = new FuncionarioService();
        serviceFunc.save(funcionario);
        diretor.setNome(diretor.getNome() + " - alterado");
        serviceFunc.update(funcionario);
        FuncionarioRepository repositoryFunc = new FuncionarioRepository();
        repositoryFunc.findAll();
        repositoryFunc.findById(10);

    }
}