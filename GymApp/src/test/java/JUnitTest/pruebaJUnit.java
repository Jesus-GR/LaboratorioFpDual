package JUnitTest;

import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.*;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;

import edu.fpdual.GymApp.GymApp.App;
import edu.fpdual.conector.Conector;
import edu.fpdual.dao.Usuario;
import edu.fpdual.manager.UsuarioManager;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
@RunWith(MockitoJUnitRunner.class)
class pruebaJUnit {
	
	@InjectMocks
	Usuario usuario;
	
//	String nombre ="Usu1";
//	String contraseña ="1234";
//	String ape1 = "ape1";
//	String ape2 = "ape2";
//	String email= "email@email";
//	String fecha = "1-1-1111";
//	String peso = "1-1-1111";
//	String altura = "123";

	@BeforeAll
	public static void inicioPrueba() {
		System.out.print("============Prueba Insert============");
	}
	
	@BeforeEach
	public int insertUsuario(Connection con ) {
		try(PreparedStatement stmt = con.prepareStatement("insert usuario values ((Select Max(CodUsu) + 1 from usuario as max),?,?,?,?,?,?,?,?);")){
			
			stmt.setString(1, usuario.getNombre());
			stmt.setString(2, usuario.getContraseña());
			stmt.setString(3, usuario.getApellido1());
			stmt.setString(4, usuario.getApellido2());
			stmt.setString(5, usuario.getEmail());
			stmt.setString(6, usuario.getFechaNacimiento());
			stmt.setString(7, usuario.getPeso());
			stmt.setString(8, usuario.getAltura());
			int result = stmt.executeUpdate();
	
			return result;
		}catch(SQLException e) {
			e.printStackTrace();
			return 0;
		}
		
	}
	
	@Test
	public  void main() {
		try(Connection con = new Conector().getMySqlConnection()){
			new UsuarioManager().findAll(con).forEach(s -> System.out.println(s));
		}catch (SQLException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException c) {
				c.printStackTrace();
		}
	
		
	}

	
	@Test
	public void login() throws ClassNotFoundException, SQLException, IOException {
		Connection con = new Conector().getMySqlConnection();
		
		/*Utilizamos el método UsuarioManager().findById para almacenar en una variable usuario el resultado de la búsqueda y además lo almacenamos
		 * el resultado también en el Usuario de App*/
		Usuario user = new UsuarioManager().findByEmail(con, usuario.getEmail(), usuario.getContraseña());
			
		assertTrue(user.getEmail() != null && usuario.getContraseña() != null);

	}
	
	@AfterEach
	public int deleteUsuario(Connection con,String nombre){
		try(Statement stmt = con.createStatement()){
			nombre = "Usu1";
			String sql = String.format("Delete  from Usuario where NomUSU =  '%s' ", nombre);
			int result = stmt.executeUpdate(sql);
			return result;
			
		}catch(SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	@AfterAll
	 public static void end() {
		System.out.print("===========Fin prueba==========");
	}

}
