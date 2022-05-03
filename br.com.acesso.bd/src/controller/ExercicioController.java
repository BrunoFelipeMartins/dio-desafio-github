package controller;

import java.util.List;

import entity.Exercicio;
import service.ExercicioService;

public class ExercicioController {
    private ExercicioService exercicioService;

    public ExercicioController(){
        this.exercicioService = new ExercicioService();
    }

    public String insert(Exercicio exercicio){
        if(exercicio.getNome().length() > 50){
            return "Erro: Maximo é 50";
        }

        this.exercicioService.insert(exercicio);
        return "OK";
    }

    public String update(Exercicio exercicio){
        if(exercicio.getNome_Exercicio().length() > 50){
            return "erro MAximo é 50";
        }
        this.exercicioService.update(exercicio);
        return "ok";
    }
    public String delete(Exercicio exercicio){
        return null;
    }

    public List<Exercicio> selectAll(){
        return this.exercicioService.selectAll();
    }
}
