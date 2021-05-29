package edu.fpdual.manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.sun.javafx.binding.StringFormatter;

import edu.fpdual.dao.Ejercicio;
import edu.fpdual.dao.Rutina;
import edu.fpdual.dao.RutinaEjercicio;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



public class RutinaEjercicioManager {

	public int nuevaRutinaEjercicio(Connection con, int codRutina, int codigoEjercicio, String repeticiones, String descanso, int peso, String dia, String nombreEjercicio) throws SQLException {
		
		try(PreparedStatement stmt = con.prepareStatement("insert into rutina_ejercicio values (?,?,?,?,?,?,?)")){
			stmt.setInt(1,codRutina);
			stmt.setInt(2, codigoEjercicio);
			stmt.setString(3, repeticiones);
			stmt.setString(4, descanso);
			stmt.setInt(5, peso);
			stmt.setString(6, dia);
			stmt.setString(7, nombreEjercicio);
		
			int resultado = stmt.executeUpdate();
			return resultado;
			
		}catch (SQLException e) {
			e.printStackTrace();
			return 0;
			
		}
		
				
				
				
	}
	
	public List<RutinaEjercicio> rutinaSemanal (Connection con, String dia){
		try(Statement stmt = con.createStatement()){
			String sql = String.format("Select * from ejercicio e join musculos m on (e.Musculos_CodMusc = m.codMusc) join rutina_ejercicio r on (r.Ejercicio_CodEje = e.codeJE) Where Dia = '%s' ", dia);
			
			ResultSet result = stmt.executeQuery(sql);
			result.beforeFirst();
			
			List<RutinaEjercicio> ejerciciosSemanales = new ArrayList<>();
			while(result.next()) {
				ejerciciosSemanales.add(new RutinaEjercicio(result));
			}
			return ejerciciosSemanales;
			
		}catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
