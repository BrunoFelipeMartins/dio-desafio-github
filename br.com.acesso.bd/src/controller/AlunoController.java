package controller;

import entity.Aluno;
import service.AlunoService;

public class AlunoController {
    private AlunoService alunoService;

    public AlunoController(){
        this.alunoService = new AlunoService();
    }
    public String insert(Aluno aluno){
        if(aluno.getTelefone().length() > 11){
            return "Erro: Maximo é 11";
        }
        this.alunoService.insert(aluno);
        return "ok";
    }

    public String insertFicha(Aluno aluno){
        this.alunoService.insertFicha(aluno);
        return "ok";
    }
    
    public String update(Aluno aluno){
        this.alunoService.update(aluno);
        return null;
    }
    public String delete(Aluno aluno){
        this.alunoService.delete(aluno);
        return null;
    }
    public String selectbyID(Aluno aluno){
        this.alunoService.selectbyID(aluno);
        return null;
    }
}