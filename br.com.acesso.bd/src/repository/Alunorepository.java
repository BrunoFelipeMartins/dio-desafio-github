package repository;

import dao.AlunoDAO;
import entity.Aluno;
import entity.Objeto;

public class Alunorepository implements IRepository{
    private AlunoDAO AlunoDAO;

    public Alunorepository(){
        this.AlunoDAO = new AlunoDAO();
    }

    @Override
    public void insert(Objeto objeto) {
        this.AlunoDAO.insert((Aluno) objeto);
        
    }

    @Override
    public void update(Objeto objeto) {
        this.AlunoDAO.update((Aluno) objeto);
        
    }

    @Override
    public void delete(Objeto objeto) {
        this.AlunoDAO.delete(objeto);
        
    }

    @Override
    public void selectbyID(Objeto objeto) {
        this.AlunoDAO.selectbyID(objeto);
        
    }
  
    
}
