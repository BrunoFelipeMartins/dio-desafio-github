package repository;

import java.util.List;

import dao.ExercicioDAO;
import entity.Exercicio;
import entity.Objeto;

public class ExercicioRepository implements IRepository{
    private ExercicioDAO exercicioDAO;

    public ExercicioRepository(){
        this.exercicioDAO = new ExercicioDAO();
    }
    
    public List<Exercicio> selectAll(){
        return this.exercicioDAO.selectAll();
    }

    @Override
    public void insert(Objeto objeto) {
        this.exercicioDAO.insert((Exercicio) objeto);
        
    }

    @Override
    public void update(Objeto objeto) {
        this.exercicioDAO.update((Exercicio) objeto);
        
    }

    @Override
    public void delete(Objeto objeto) {
        this.exercicioDAO.delete(objeto);
        
    }

    @Override
    public void selectbyID(Objeto objeto) {
        this.exercicioDAO.selectbyID(objeto);
        
    }
        
}
