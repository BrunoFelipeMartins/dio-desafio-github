package service;

import entity.Ficha;
import entity.Objeto;
import repository.FichaRepository;

public class FichaService implements Iservice{
    private FichaRepository fichaRepository;

    public FichaService(){
        fichaRepository = new FichaRepository();
    }
        
    public void insert(Objeto objeto){
        this.fichaRepository.insert((Ficha)objeto);
    }
    
    public void update(Objeto objeto){
        this.fichaRepository.update((Ficha)objeto);
    }
    public void delete(Objeto objeto){
        this.fichaRepository.delete(objeto);
    }
    public void selectbyID(Objeto objeto){
        this.fichaRepository.selectbyID(objeto);
    }
}
