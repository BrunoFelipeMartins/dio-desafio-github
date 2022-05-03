package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Exercicio;
import entity.Objeto;

public class ExercicioDAO {
    
    private Conexao conexao;

    public ExercicioDAO(){
        conexao = Conexao.getInstance();
    }
    
    public void insert(Exercicio exercicio){
        String sql = "INSERT INTO public.exercicios(id_exercicios,nome, area)VALUES(?,?,?)";
        try {
            PreparedStatement stmt = conexao.conn.prepareStatement(sql);
            stmt.setLong(1, exercicio.getId());
            stmt.setString(2, exercicio.getNome());
            stmt.setString(3, exercicio.getArea());
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        }
    public void update(Exercicio exercicio){


        //           "UPDATE exercicios SET nome = 'barra' WHERE id_exercicios = 1 "
        //           "UPDATE exercicios SET" + exercicio.getNome() +"= ? WHERE id_exercicios = ? "
        String sql = "UPDATE exercicios SET nome = ? WHERE id_exercicios = ? ";
        try {
            PreparedStatement stmt = conexao.conn.prepareStatement(sql);
            stmt.setString(1, exercicio.getNome_Exercicio());
            stmt.setLong(2, exercicio.getId());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    public void delete(Objeto objeto){
        //delete from exercicios where id_exercicios = 1
        String sql = "DELETE FROM exercicios WHERE id_exercicios = ? ";
        try {
            PreparedStatement stmt = conexao.conn.prepareStatement(sql);
            stmt.setLong(1, objeto.getId());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    // public ? selectbyID(?){
    public void selectbyID(Objeto objeto){
        String sql = "SELECT * FROM exercicios WHERE id_exercicios = ?";
        try {
            PreparedStatement stmt = conexao.conn.prepareStatement(sql);
            stmt.setLong(1, objeto.getId());
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    // }

    public List<Exercicio> selectAll(){
        List<Exercicio> exercicioList = new ArrayList<Exercicio>();
        String sql = "SELECT * FROM exercicios";
        try {
            PreparedStatement stmt = conexao.conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Exercicio exercicio = new Exercicio();
                exercicio.setId(rs.getLong("id_exercicio"));
                exercicio.setNome(rs.getString("nome"));
                exercicio.setArea(rs.getString("area"));

                exercicioList.add(exercicio);
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return exercicioList;
        
    }
}
