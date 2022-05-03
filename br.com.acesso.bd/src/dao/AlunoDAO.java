package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import entity.Aluno;
import entity.Objeto;

public class AlunoDAO {

    private Conexao conexao;

    public AlunoDAO(){
        conexao = Conexao.getInstance();
    }

    public void insert(Aluno aluno){
        String sql = "INSERT INTO alunos(id_aluno,nome, genero,telefone)VALUES(?,?,?,?)";
        try {
            PreparedStatement stmt = conexao.conn.prepareStatement(sql);
            stmt.setLong(1, aluno.getId());
            stmt.setString(2, aluno.getNome());
            stmt.setString(3, aluno.getGenero());
            stmt.setString(4, aluno.getTelefone());
            stmt.execute();
        } catch (SQLException al) {
            System.out.println(al.getMessage());
        } catch (Exception al) {
            System.out.println(al.getMessage());
        }
    }

    /*public void insert(Aluno aluno){
        String sql = "INSERT INTO alunos(id_aluno,nome, genero,telefone)VALUES(?,?,?,?)";
        try {
            PreparedStatement stmt = conexao.conn.prepareStatement(sql);
            stmt.setLong(1, aluno.getId());
            stmt.setString(2, aluno.getNome());
            stmt.setString(3, aluno.getGenero());
            stmt.setString(4, aluno.getTelefone());
            stmt.execute();
        } catch (SQLException al) {
            System.out.println(al.getMessage());
        } catch (Exception al) {
            System.out.println(al.getMessage());
        }
    }*/
    public void update(Aluno aluno){
        // queria no lugar de nome (?) para poder mudar as colunas alteradas
        String sql = "UPDATE alunos SET nome = ?, genero = ?, Telefone = ? WHERE id_aluno = ?";
        try {
            PreparedStatement stmt = conexao.conn.prepareStatement(sql);
            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getGenero());
            stmt.setString(3, aluno.getTelefone());
            stmt.setLong(4, aluno.getId());
            stmt.executeUpdate();
        } catch (SQLException al) {
            System.out.println(al.getMessage());
        } catch (Exception al) {
            System.out.println(al.getMessage());
        }
        }
    public void delete(Objeto objeto){
        String sql = "DELETE FROM alunos WHERE Id_aluno = ?";
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
        String sql = "SELECT * FROM alunos WHERE id_aluno = ?";
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
        
    }

