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
	private Musculos codigoMusculo;
	
	public Ejercicio(ResultSet result) {
		try {
			this.codigoEjercicio = result.getInt("CodEje");
			this.nombreEjercicio = result.getString("NomEje");	
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public Ejercicio(int codigo, String nombre) {
		this.codigoEjercicio = codigo;
		this.nombreEjercicio = nombre;
	}
	
	public String toString() {
		return this.codigoEjercicio+"   "+this.nombreEjercicio;
	}
	
}
