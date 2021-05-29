package edu.fpdual.manager;

import java.sql.Statement;
import java.time.LocalDate;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import edu.fpdual.dao.Usuario;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.DateCell;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.util.Callback;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
public class UsuarioManager {
	
	public int obtenerCodigoUsuario(Connection con, String nombre) {
		try(Statement stmt = con.createStatement()){
			String sql = String.format("SELECT CodUsu from usuario where NomUsu = '%s'", nombre);
			
			ResultSet result = stmt.executeQuery(sql);
			result.beforeFirst();
			result.next();
			Usuario usuario = new Usuario(result);
			return usuario.getCodigo();
		}catch(SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public Usuario findById(Connection con, String nombre, String contraseña) {
		try(PreparedStatement stmt = con.prepareStatement("Select * from Usuario where NomUsu = ? and contraseña = ?")){
			stmt.setString(1, nombre);
			stmt.setString(2, contraseña);
			ResultSet result = stmt.executeQuery();
			result.beforeFirst();
			result.next();
			Usuario usuario = new Usuario(result);
			if(usuario.getNombre().equals(nombre)  && usuario.getContraseña().equals(contraseña) ) {
				return usuario;
				
			}else {
				return null;
				
				
			}

		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
//	public List<Usuario> findById(Connection con, String nombre, String contraseña) {
//		try(PreparedStatement stmt = con.prepareStatement("Select * from Usuario where NomUsu = ? and Contraseña = ? ")){
//			stmt.setString(1, nombre);
//			stmt.setString(2, contraseña);
//			ResultSet result = stmt.executeQuery();
//			result.beforeFirst();
//			List<Usuario> usuario = new ArrayList<>();
//			while(result.next()){
//				usuario.add(new Usuario(result));
//			}
//			
//			return usuario;
//		}catch(SQLException e) {
//			e.printStackTrace();
//			return null;
//		}
//	}
	
	
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
	
	public int insertUsuario(Connection con,String nombre, String contraseña, String ape1, String ape2, String direccion, String fecha, String peso, String altura) {
		try(PreparedStatement stmt = con.prepareStatement("insert usuario values ((Select Max(CodUsu) + 1 from usuario as max),?,?,?,?,?,?,?,?);")){
			stmt.setString(1, nombre);
			stmt.setString(2, contraseña);
			stmt.setString(3, ape1);
			stmt.setString(4, ape2);
			stmt.setString(5, direccion);
			stmt.setString(6, fecha);
			stmt.setString(7, peso);
			stmt.setString(8, altura);
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
