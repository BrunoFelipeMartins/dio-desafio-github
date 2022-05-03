package entity;

public class Ficha extends Objeto{
    private Long sessao;
    private long qtd;
    private long id_aluno;
    private long id_exercicios;
    
    
    public long getQtd() {
        return qtd;
    }
    
    public Long getSessao() {
        return sessao;
    }
    
    public long getId_aluno() {
        return id_aluno;
    }

    public long getId_exercicios() {
        return id_exercicios;
    }
 
    public void setQtd(long qtd) {
        this.qtd = qtd;
    }
    
    public void setSessao(Long sessao) {
        this.sessao = sessao;
    }
    
    public void setId_aluno(long id_aluno) {
        this.id_aluno = id_aluno;
    }
    
    public void setId_exercicios(long id_exercicios) {
        this.id_exercicios = id_exercicios;
    }
    
    
}
