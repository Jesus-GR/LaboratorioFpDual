package edu.fpdual.manager;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import edu.fpdual.dao.Rutina;
import edu.fpdual.dao.Usuario;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RutinaManager {

	public int addRutine(Connection con, String nombre, int codigoUsuario, String FechIni, String FechFin) {
		try (PreparedStatement stmt = con
				.prepareStatement("Insert into rutina values ((SELECT MAX(CodRut)+1 from rutina as max),?,?,?,?)")) {
			stmt.setString(1, nombre);
			stmt.setInt(2, codigoUsuario);
			stmt.setString(3, FechIni);
			stmt.setString(4, FechFin);
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

	public List<Rutina> findAll(Connection con) {
		try (Statement stmt = con.createStatement()) {
			ResultSet result = stmt.executeQuery("SELECT * FROM RUTINA");
			result.beforeFirst();
			List<Rutina> rutinas = new ArrayList<>();

			while (result.next()) {
				rutinas.add(new Rutina(result));
			}
			return rutinas;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	public int findIdByName(Connection con, String nombre) throws SQLException {
		try (Statement stmt = con.createStatement()) {
			String sql = String.format("Select CodRut from rutina where NomRut = '%s'", nombre);
			ResultSet result = stmt.executeQuery(sql);
			result.beforeFirst();
			result.next();
			Rutina rutina = new Rutina(result);
			
			int codigoRutina =  rutina.getCodRut();
			return codigoRutina;

		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	public List<Rutina> fillRutineByCodUsu(Connection con, int codUsu){
		try(Statement stmt = con.createStatement()){
			String sql = String.format("Select * from rutina where Usuario_CodUsu = %d ", codUsu);
			ResultSet result = stmt.executeQuery(sql);
			result.beforeFirst();
			
			List<Rutina> rutinas = new ArrayList<>();
			while(result.next()) {
				rutinas.add(new Rutina(result));
				
			}
			
			return rutinas;
		}catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

}
