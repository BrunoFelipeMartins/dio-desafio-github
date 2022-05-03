import java.util.ArrayList;
import java.util.List;

import controller.AlunoController;
//import controller.ExercicioController;
import entity.Aluno;
//import entity.Exercicio;
import entity.Ficha;

public class App {
    public static void main(String[] args) throws Exception {
    /*    Exercicio exercicio = new Exercicio();
        exercicio.setId(3);
        exercicio.setNome("Pula-Pula");
        exercicio.setArea("Joelho");

        ExercicioController exercicioController = new ExercicioController();
        exercicioController.insert(exercicio);
    
    
        Exercicio exercicio = new Exercicio();
        exercicio.setId(1);
        exercicio.setNome("nome");
        exercicio.setNome_Exercicio("perna");

        ExercicioController exercicioController = new ExercicioController();
        exercicioController.update(exercicio);
    */
        Ficha ficha = new Ficha();
        ficha.setId_aluno(3);
        ficha.setId_exercicios(1);
        ficha.setQtd(5);
        ficha.setSessao(3L);
        ficha.setId(1);
        Aluno aluno = new Aluno();
        aluno.setId(3);
        aluno.setNome("Sofia");
        aluno.setGenero("Feminino");
        aluno.setTelefone("45994768234");
        List<Ficha>fichas = new ArrayList<Ficha>();
        fichas.add(ficha);
        aluno.setFichas(fichas);

        AlunoController alunoController = new AlunoController();
        alunoController.insertFicha(aluno);
     //alunoController.insert(aluno);
    
    }
}
