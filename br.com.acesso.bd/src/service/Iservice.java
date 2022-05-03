package service;

import entity.Objeto;

public interface Iservice {
    public void insert(Objeto objeto);
    public void update(Objeto objeto);
    public void delete(Objeto objeto);
    public void selectbyID(Objeto objeto);
}
