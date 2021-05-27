package edu.fpdual.manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RutinaEjercicioManager {

	public int nuevaRutina_Ejercicio(Connection con, int codigoEjercicio, String repeticiones, String descanso, int peso, String dia, String nombreEjercicio) throws SQLException {
		
		try(PreparedStatement stmt = con.prepareStatement("insert into rutina_ejercicio values ((Select MAX(Rutina_CodRut)+1 from rutina_ejercicio as max),?,?,?,?,?,?)")){
			stmt.setInt(1, codigoEjercicio);
			stmt.setString(2, repeticiones);
			stmt.setString(3, descanso);
			stmt.setInt(4, peso);
			stmt.setString(5, dia);
			stmt.setString(6, nombreEjercicio);
		
			int resultado = stmt.executeUpdate();
			return resultado;
			
		}catch (SQLException e) {
			e.printStackTrace();
			return 0;
			
		}
		
				
				
				
	}
}
