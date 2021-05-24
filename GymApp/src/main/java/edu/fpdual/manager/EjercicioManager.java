package edu.fpdual.manager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import edu.fpdual.dao.Ejercicio;

public class EjercicioManager {

	public List<Ejercicio> listaEjercicios(Connection con){
		try(Statement stmt = con.createStatement()){
		ResultSet result = stmt.executeQuery("SELECT * FROM ejercicio");
		result.beforeFirst();
		List<Ejercicio> ejercicios = new ArrayList<>();
		
		while(result.next()) {
			ejercicios.add(new Ejercicio(result));
		}
		return ejercicios;
		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	
}
