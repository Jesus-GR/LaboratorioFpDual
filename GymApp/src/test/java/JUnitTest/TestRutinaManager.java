package JUnitTest;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import edu.fpdual.conector.Conector;
import edu.fpdual.dao.Rutina;
import edu.fpdual.dao.Usuario;
import edu.fpdual.manager.RutinaManager;
import edu.fpdual.manager.UsuarioManager;

	@RunWith(JUnitPlatform.class)
	public class TestRutinaManager {
	
	@BeforeAll
	public static void inicioPrueba() {
		System.out.print("============Prueba Insert============");
	}
	
	@BeforeEach
	public int insertUsuario(Connection con,String nombre, String contraseña, String ape1, String ape2, String email, String fecha, String peso, String altura) {
		try(PreparedStatement stmt = con.prepareStatement("insert usuario values ((Select Max(CodUsu) + 1 from usuario as max),?,?,?,?,?,?,?,?);")){
			nombre =  "Usu1";
			contraseña = "1234";
			ape1 = "ape1";
			ape2 = "ape2";
			email = "email@email";
			fecha = "1-1-1111";
			peso = "100";
			altura = "123";
			
			stmt.setString(1, nombre);
			stmt.setString(2, contraseña);
			stmt.setString(3, ape1);
			stmt.setString(4, ape2);
			stmt.setString(5, email);
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
	
	@Test
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
	@Test
	public static void main() {
		try(Connection con = new Conector().getMySqlConnection()){
			new UsuarioManager().findAll(con).forEach(s -> System.out.println(s));
		}catch (SQLException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException c) {
				c.printStackTrace();
		}
	
		
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
