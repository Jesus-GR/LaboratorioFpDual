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
import edu.fpdual.excepciones.ErrorNuevoUsuario;
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
// TODO: Auto-generated Javadoc

@Getter
@Setter

@ToString
public class UsuarioManager {
	
	/**
	 * Obtener codigo usuario.
	 *
	 * @param con the con
	 * @param nombre the nombre
	 * @return the int
	 */
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

	/**
	 * Find by id.
	 *
	 * @param con the con
	 * @param nombre the nombre
	 * @param contraseña the contraseña
	 * @return the usuario
	 */
	public Usuario findById(Connection con, String email, String contraseña) {
		try(PreparedStatement stmt = con.prepareStatement("Select * from Usuario where Email = ? and contraseña = ?")){
			stmt.setString(1, email);
			stmt.setString(2, contraseña);
			ResultSet result = stmt.executeQuery();
			result.beforeFirst();
			result.next();
			Usuario usuario = new Usuario(result);
			System.out.println(usuario);
			if(usuario.getEmail().equals(email)  && usuario.getContraseña().equals(contraseña) ) {
				return usuario;
				
			}else {
				return null;
				
				
			}

		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public Usuario findByEmail(Connection con, String email, String contraseña) {
		try(PreparedStatement stmt = con.prepareStatement("Select * from Usuario where Email = ? and contraseña = ?")){
			stmt.setString(1, email);
			stmt.setString(2, contraseña);
			ResultSet result = stmt.executeQuery();
			result.beforeFirst();
			result.next();
			Usuario usuario = new Usuario(result);
			if(usuario != null) {
					return usuario;
			}else {
				return null;
			}
			

		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	

	
	
	/**
 * Find all.
 *
 * @param con the con
 * @return the list
 */
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
	
	/**
	 * Insert usuario.
	 *
	 * @param con the con
	 * @param nombre the nombre
	 * @param contraseña the contraseña
	 * @param ape1 the ape 1
	 * @param ape2 the ape 2
	 * @param email the email
	 * @param fecha the fecha
	 * @param peso the peso
	 * @param altura the altura
	 * @return the int
	 * @throws SQLException 
	 */
	public int insertUsuario(Connection con,String nombre, String contraseña, String ape1, String ape2, String email, String fecha, String peso, String altura) throws ErrorNuevoUsuario, SQLException {
		
			try(PreparedStatement stmt = con.prepareStatement("insert into usuario values ((Select Max(CodUsu) + 1 from usuario as max),?,?,?,?,?,?,?,?);")){
			stmt.setString(1, nombre);
			stmt.setString(2, contraseña);
			stmt.setString(3, ape1);
			stmt.setString(4, ape2);
			stmt.setString(5, email);
			stmt.setString(6, fecha);
			stmt.setString(7, peso);
			stmt.setString(8, altura);
			
			if(!email.contains("@") || email.isEmpty() || nombre.isEmpty() || contraseña.isEmpty() || ape1.isEmpty() || ape2.isEmpty() || peso.isEmpty() || altura.isEmpty()){
				
				return 0;	
			}else {
				int result = stmt.executeUpdate();
				System.out.println(result);
				return result;
			}
			
			
			
		}catch (SQLException e) {
			return 0;
			
		}

	}
	
	
	/**
	 * Delete usuario.
	 *
	 * @param con the con
	 * @param codUsu the cod usu
	 * @return the int
	 */
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
	
	/**
	 * Find by name.
	 *
	 * @param con the con
	 * @param nombre the nombre
	 * @return the usuario
	 */
	public Usuario findByName(Connection con, String nombre) {
		try(Statement stmt = con.createStatement()){
			String sql = String.format("Delete  from Usuario where CodUsu =  '%s'", nombre);
			ResultSet result = stmt.executeQuery(sql);
			result.beforeFirst();
			result.next();
			Usuario usuario = new Usuario(result);
			return usuario;
			
		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
}
