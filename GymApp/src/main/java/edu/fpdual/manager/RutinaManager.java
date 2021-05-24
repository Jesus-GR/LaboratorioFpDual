package edu.fpdual.manager;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import edu.fpdual.dao.Rutina;
import edu.fpdual.dao.Usuario;

public class RutinaManager {

	public int addRutine(Connection con, String nombre, int codigo, Timestamp FechIni, Timestamp FechFin) {
		try (PreparedStatement stmt = con.prepareStatement("Insert into rutina values ((SELECT MAX(CodRut)+1 from rutina as max),?,?,?,?)")) {
			stmt.setString(1, nombre);
			stmt.setInt(2, codigo);
			stmt.setTimestamp(3, FechIni);
			stmt.setTimestamp(4, FechFin);
			int result = stmt.executeUpdate();
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public int deleteRutine(Connection con) {
		try (Statement stmt = con.createStatement()) {
			int result = stmt.executeUpdate("Delete * from Rutina");
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}

	}
	
	public List<Rutina> findAll(Connection con){
		try(Statement stmt = con.createStatement()){
			ResultSet result = stmt.executeQuery("SELECT * FROM RUTINA");
			result.beforeFirst();
			List<Rutina> rutinas = new ArrayList<>();
			
			while(result.next()) {
				rutinas.add(new Rutina(result));
			}
			return rutinas;
		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

}