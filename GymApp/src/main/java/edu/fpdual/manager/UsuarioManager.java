package edu.fpdual.manager;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import edu.fpdual.dao.Usuario;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
public class UsuarioManager {

	public boolean findById(Connection con, TextField nombre, PasswordField contraseña) {
		try(Statement stmt = con.createStatement()){
			String sql = String.format("Select * from Usuario where NomUsu = '%s' and Contraseña = '%s' ", nombre,contraseña);
			ResultSet result = stmt.executeQuery(sql);
			if(result != null) {
				return true;
			}else {
				return false;
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	
	public List<Usuario> findAll (Connection con){
		try(Statement stmt = con.createStatement()){
			ResultSet result = stmt.executeQuery("SELECT * FROM USUARIO");
			result.beforeFirst();
			result.next();
			List<Usuario> usuarios = new ArrayList<>();
			while(result.next()) {
				usuarios.add(new Usuario(result));
			}
			return usuarios;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public int insertUsuario(Connection con,String nombre,String ape1, String ape2, String direccion, Date fecha, int peso, String altura,String contraseña) {
		try(PreparedStatement stmt = con.prepareStatement("insert usuario values ((Select Max(CodUsu) + 1 from usuario as max),?,?,?,?,?,?,?,?);")){
			stmt.setString(1, nombre);
			stmt.setString(2, ape1);
			stmt.setString(3, ape2);
			stmt.setString(4, direccion);
			stmt.setDate(5, fecha);
			stmt.setInt(6, peso);
			stmt.setString(7, altura);
			stmt.setString(8, contraseña);
			int result = stmt.executeUpdate();
	
			return result;
		}catch(SQLException e) {
			e.printStackTrace();
			return 0;
		}
		
	}
	
	public int deleteUsuario(Connection con, int codUsu){
		try(Statement stmt = con.createStatement()){
			String sql = String.format("Delete  from Usuario where CodUsu =  %d", codUsu);
			int result = stmt.executeUpdate(sql);
			return result;
			
		}catch(SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}
}
