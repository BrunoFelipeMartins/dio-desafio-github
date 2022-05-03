package service;

import java.util.List;

import entity.Exercicio;
import entity.Objeto;
import repository.ExercicioRepository;

public class ExercicioService implements Iservice{
    private ExercicioRepository exercicioRepository;

    public ExercicioService(){
        this.exercicioRepository = new ExercicioRepository();
    }
    
    public List<Exercicio> selectAll(){
        return this.exercicioRepository.selectAll();
    }
    @Override
    public void insert(Objeto objeto) {
        this.exercicioRepository.insert((Exercicio)objeto);
        
    }
    @Override
    public void update(Objeto objeto) {
        this.exercicioRepository.update((Exercicio)objeto);
        
    }
    @Override
    public void delete(Objeto objeto) {
        this.exercicioRepository.delete(objeto);
        
    }
    @Override
    public void selectbyID(Objeto objeto) {
        this.exercicioRepository.selectbyID(objeto);
    }
    
}
