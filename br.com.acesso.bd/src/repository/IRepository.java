package repository;

import entity.Objeto;

public interface IRepository {
    public void insert(Objeto objeto);
    public void update(Objeto objeto);
    public void delete(Objeto objeto);
    public void selectbyID(Objeto objeto);
}
