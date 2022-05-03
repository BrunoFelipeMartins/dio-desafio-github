package controller;

import entity.Ficha;
import service.FichaService;

public class FichaController {
    private FichaService fichaService;
    
    public FichaController(){
        this.fichaService = new FichaService();
    }
    public String insert(Ficha ficha){
        this.fichaService.insert(ficha);
        return null;
    }
    
    public String update(Ficha ficha){
        this.fichaService.update(ficha);
        return null;
    }
    public String delete(Ficha ficha){
        this.fichaService.delete(ficha);
        return null;
    }
    public String selectbyID(Ficha ficha){
        this.fichaService.selectbyID(ficha);
        return null;
    }
    
}
