package edu.fpdual.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter

public class RutinaEjercicio {

	private Rutina codRutina;
	private int codEje;
	private String repeticiones;
	private String descanso;
	private int Peso;
	private String dia;
	private String nombreEjercicio;
	
	public RutinaEjercicio(ResultSet result) throws SQLException {
		this.codEje = result.getInt("Ejercicio_CodEje");
		this.repeticiones = result.getString("Repeticiones");
		this.descanso = result.getString("Descanso");
		this.Peso = result.getInt("Peso");
		this.dia = result.getString("Dia");
		this.nombreEjercicio = result.getString("nombreEjercicio");
	}
	
	
}
