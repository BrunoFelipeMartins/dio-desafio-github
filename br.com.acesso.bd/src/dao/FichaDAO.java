package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Exercicio;
import entity.Ficha;
import entity.Objeto;

public class FichaDAO {

    private Conexao conexao;
    private Exercicio exercicio;


    public FichaDAO(){
        conexao = Conexao.getInstance();
    }

    public Exercicio getExercicio() {
        return exercicio;
    }

    public void setExercicio(Exercicio exercicio) {
        this.exercicio = exercicio;
    }

    public void insert(Ficha ficha){
        String sql = "INSERT INTO fichas(id_fichas, sessao, qtd, id_aluno, id_exercicios)VALUES(?,?,?,?,?)";
        try {
            PreparedStatement stmt = conexao.conn.prepareStatement(sql);
            stmt.setLong(1, ficha.getId());
            stmt.setLong(2, ficha.getSessao());
            stmt.setLong(3, ficha.getQtd());
            stmt.setLong(4, ficha.getId_aluno());
            stmt.setLong(5, ficha.getId_exercicios());
            stmt.execute();
        } catch (SQLException al) {
            System.out.println(al.getMessage());
        } catch (Exception al) {
            System.out.println(al.getMessage());
        }
        }
    public void update(Ficha ficha){
        // queria no lugar de nome (?) para poder mudar as colunas alteradas
        String sql = "UPDATE ficha SET id_ficha = ? sessao = ? qtd = ? id_aluno = ? id_exercicios = ? WHERE id_ficha = ?";
        try {
            PreparedStatement stmt = conexao.conn.prepareStatement(sql);
            stmt.setLong(1, ficha.getId());
            stmt.setLong(2, ficha.getSessao());
            stmt.setLong(3, ficha.getQtd());
            stmt.setLong(4, ficha.getId_aluno());
            stmt.setLong(5, ficha.getId_exercicios());
            stmt.executeUpdate();
        } catch (SQLException al) {
            System.out.println(al.getMessage());
        } catch (Exception al) {
            System.out.println(al.getMessage());
        }
        }
    public void delete(Objeto objeto){
        String sql = "DELETE FROM ficha WHERE Id_ficha = ?";
        try {
            PreparedStatement stmt = conexao.conn.prepareStatement(sql);
            stmt.setLong(1, objeto.getId());
            stmt.execute();
        } catch (SQLException al) {
            System.out.println(al.getMessage());
        } catch (Exception al) {
            System.out.println(al.getMessage());
        }
        }
    public void selectbyID(Objeto objeto){
        String sql = "SELECT * FROM ficha WHERE id_aluno = ?";
        try {
            PreparedStatement stmt = conexao.conn.prepareStatement(sql);
            stmt.setLong(1, objeto.getId());
            stmt.execute();
        } catch (SQLException al) {
            System.out.println(al.getMessage());
        } catch (Exception al) {
            System.out.println(al.getMessage());
        }
        }
    public List<Ficha> selectAll(){
        List<Ficha> fichaList = new ArrayList<Ficha>();
        String sql = "SELECT * FROM ficha";
        try {
            PreparedStatement stmt = conexao.conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Ficha ficha = new Ficha();
                ficha.setId(rs.getLong("id_ficha"));
                ficha.setSessao(rs.getLong("sessao"));
                ficha.setQtd(rs.getLong("qtd"));
    
                fichaList.add(ficha);
            }
                
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return fichaList;           
    }
}