package edu.fpdual.manager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import edu.fpdual.dao.Ejercicio;
import edu.fpdual.dao.Musculos;

// TODO: Auto-generated Javadoc
/**
 * The Class EjercicioManager.
 */
public class EjercicioManager {

	/**
	 * Lista ejercicios.
	 *
	 * @param con the con
	 * @return the list
	 */
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
	
	/**
	 * Find by muscle.
	 *
	 * @param con the con
	 * @param nombreMusculo the nombre musculo
	 * @return the list
	 */
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
