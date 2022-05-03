package repository;

import dao.FichaDAO;
import entity.Ficha;
import entity.Objeto;

public class FichaRepository implements IRepository{
    private FichaDAO fichaDAO;

    public FichaRepository(){
         this.fichaDAO = new FichaDAO();
    }

    @Override
    public void insert(Objeto objeto) {
        this.fichaDAO.insert((Ficha)objeto);
        
    }

    @Override
    public void update(Objeto objeto) {
        this.fichaDAO.update((Ficha)objeto);
        
    }

    @Override
    public void delete(Objeto objeto) {
        this.fichaDAO.delete(objeto);
        
    }

    @Override
    public void selectbyID(Objeto objeto) {
        this.fichaDAO.selectbyID(objeto);
        
    }
    
    
}
