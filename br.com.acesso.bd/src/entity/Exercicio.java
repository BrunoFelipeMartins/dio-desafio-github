package entity;

public class Exercicio extends Objeto{

    private String nome;
    private String area;
    private String Nome_Exercicio;

    public String getNome() {
        return nome;
    }
    
    public String getArea() {
        return area;
    }

    public String getNome_Exercicio(){
        return Nome_Exercicio;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setNome_Exercicio(String nome_Exercicio) {
        Nome_Exercicio = nome_Exercicio;
    }

}
