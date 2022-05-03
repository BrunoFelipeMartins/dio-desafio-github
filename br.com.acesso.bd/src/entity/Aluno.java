package entity;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Objeto{
    private String nome;
    private String genero;
    private String telefone;
    private List<Ficha>fichas;

    public Aluno(){
        this.fichas = new ArrayList<Ficha>();
    }
    public List<Ficha> getFichas() {
        return fichas;
    }
    public void setFichas(List<Ficha> fichas) {
        this.fichas = fichas;
    }
    public String getNome() {
        return nome;
    }
    public String getGenero() {
        return genero;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
}
