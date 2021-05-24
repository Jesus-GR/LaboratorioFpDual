package edu.fpdual.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Ejercicio {

	private int codigoEjercicio;
	private String nombreEjercicio;
	private String descanso;
	private String series;
	private int peso;
	private Musculos codigoMusculo;
	private String observaciones;
	
	public Ejercicio(ResultSet result) {
		try {
			this.codigoEjercicio = result.getInt("CodEje");
			this.nombreEjercicio = result.getString("NomEje");	
			this.descanso = result.getString("Descanso");
			this.series = result.getString("Series");
			this.peso = result.getInt("Peso");
			this.observaciones = result.getString("Observaciones");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}
