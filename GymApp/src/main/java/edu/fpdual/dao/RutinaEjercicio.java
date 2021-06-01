package edu.fpdual.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// TODO: Auto-generated Javadoc

@NoArgsConstructor

@Setter

@Getter

@ToString


public class RutinaEjercicio {

	/** The cod rutina. */
	private int codRutina;
	
	/** The cod eje. */
	private int codEje;
	
	/** The repeticiones. */
	private String repeticiones;
	
	/** The descanso. */
	private String descanso;
	
	/** The Peso. */
	private int Peso;
	
	/** The dia. */
	private String dia;
	
	/** The nombre ejercicio. */
	private String nombreEjercicio;
	
	
	/**
	 * Instantiates a new rutina ejercicio.
	 *
	 * @param result the result
	 * @throws SQLException the SQL exception
	 */
	public RutinaEjercicio(ResultSet result) throws SQLException {
		this.codEje = result.getInt("Ejercicio_CodEje");
		this.repeticiones = result.getString("Repeticiones");
		this.descanso = result.getString("Descanso");
		this.Peso = result.getInt("Peso");
		this.dia = result.getString("Dia");
		this.nombreEjercicio = result.getString("nombreEjercicio");
	}
	
	
}
