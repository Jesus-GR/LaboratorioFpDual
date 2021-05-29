package edu.fpdual.manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.sun.javafx.binding.StringFormatter;

import edu.fpdual.dao.Ejercicio;
import edu.fpdual.dao.Musculos;
import edu.fpdual.dao.Rutina;
import edu.fpdual.dao.RutinaEjercicio;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class RutinaEjercicioManager {

	public int nuevaRutinaEjercicio(Connection con, int codRutina, int codigoEjercicio, String repeticiones,
			String descanso, int peso, String dia, String nombreEjercicio, int codigoUsuario) throws SQLException {

		try (PreparedStatement stmt = con.prepareStatement("insert into rutina_ejercicio values (?,?,?,?,?,?,?,?)")) {
			stmt.setInt(1, codRutina);
			stmt.setInt(2, codigoEjercicio);
			stmt.setString(3, repeticiones);
			stmt.setString(4, descanso);
			stmt.setInt(5, peso);
			stmt.setString(6, dia);
			stmt.setString(7, nombreEjercicio);
			stmt.setInt(8, codigoUsuario);

			int resultado = stmt.executeUpdate();
			return resultado;

		} catch (SQLException e) {
			e.printStackTrace();
			return 0;

		}

	}

	public List<String> rutinaSemanal(Connection con, String dia, int codUsu) {
		try (PreparedStatement stmt = con.prepareStatement(
				"Select * from ejercicio e join musculos m on (e.Musculos_CodMusc = m.codMusc) join rutina_ejercicio r on (r.Ejercicio_CodEje = e.codeJE) Where Dia = ? and CodUsu = ? ")) {

			stmt.setString(1, dia);
			stmt.setInt(2, codUsu);

			ResultSet result = stmt.executeQuery();
			result.beforeFirst();

			List<RutinaEjercicio> ejerciciosSemanales = new ArrayList<>();
			List<Musculos> musculosSemanales = new ArrayList<>();
			while (result.next()) {
				ejerciciosSemanales.add(new RutinaEjercicio(result));
				musculosSemanales.add(new Musculos(result));
			}
			List<String> nuevaLista = new ArrayList<String>();

			for (int i = 0; i < ejerciciosSemanales.size(); i++) {
				nuevaLista.add(ejerciciosSemanales.get(i).getDia());
				nuevaLista.add(musculosSemanales.get(i).getNombreMusculo());

			}

			return nuevaLista;

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public List<RutinaEjercicio> mostrarTablaEjercicios(Connection con, String dia,int codigoUsuario){
		try(Statement stmt = con.createStatement()){
			String sql = String.format("Select * from rutina_ejercicio where dia = '%s' and CodUsuarioFk = %d", dia,codigoUsuario);
			ResultSet result = stmt.executeQuery(sql);
			result.beforeFirst();
			
			List<RutinaEjercicio> listaEjercicios = new ArrayList<>();
			while(result.next()) {
				listaEjercicios.add(new RutinaEjercicio(result));
			}
			return listaEjercicios;
			
		}catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

}
