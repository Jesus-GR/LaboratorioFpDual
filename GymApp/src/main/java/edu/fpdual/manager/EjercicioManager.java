package edu.fpdual.manager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import edu.fpdual.dao.Ejercicio;
import edu.fpdual.dao.Musculos;

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
	
	public List<Ejercicio> findByMuscle(Connection con, String nombreMusculo) {
		try(Statement stmt = con.createStatement()){
			String sql = String.format("Select CodEje, NomEje from ejercicio e join musculos m on (e.musculos_codMusc = m.codMusc) where NomMusc = '%s'", nombreMusculo);
			ResultSet result = stmt.executeQuery(sql);
			result.beforeFirst();
			List<Ejercicio> ejercicios = new ArrayList<>(); 
			
			while(result.next()) {
				ejercicios.add(new Ejercicio(result));
			}
			return ejercicios;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	
}
