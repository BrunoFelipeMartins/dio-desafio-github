package service;


import entity.Aluno;
import entity.Objeto;
import repository.Alunorepository;
import repository.FichaRepository;

public class AlunoService implements Iservice{
    private Alunorepository alunorepository;

    public AlunoService(){
        alunorepository = new Alunorepository();
    }

    public void insertFicha(Aluno aluno){
        FichaRepository fichaRepository = new FichaRepository();
        for( int i = 0; i < aluno.getFichas().size(); i++){
            fichaRepository.insert(aluno.getFichas().get(i));
        }
    }

    @Override
    public void insert(Objeto objeto) {
        this.alunorepository.insert((Aluno)objeto);
        
    }

    @Override
    public void update(Objeto objeto) {
        this.alunorepository.update((Aluno)objeto);
        
    }

    @Override
    public void delete(Objeto objeto) {
        this.alunorepository.delete(objeto);
        
    }

    @Override
    public void selectbyID(Objeto objeto) {
        this.alunorepository.selectbyID(objeto);
        
    }
    
       
}
