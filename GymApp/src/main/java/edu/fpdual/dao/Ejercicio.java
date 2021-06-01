package edu.fpdual.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// TODO: Auto-generated Javadoc
/**
 * Gets the codigo musculo.
 *
 * @return the codigo musculo
 */
@Getter

/**
 * Sets the codigo musculo.
 *
 * @param codigoMusculo the new codigo musculo
 */
@Setter

/**
 * Instantiates a new ejercicio.
 */
@NoArgsConstructor
@ToString
public class Ejercicio {

	/** The codigo ejercicio. */
	private int codigoEjercicio;
	
	/** The nombre ejercicio. */
	private String nombreEjercicio;
	
	/** The codigo musculo. */
	private Musculos codigoMusculo;
	
	/**
	 * Instantiates a new ejercicio.
	 *
	 * @param result the result
	 */
	public Ejercicio(ResultSet result) {
		try {
			this.codigoEjercicio = result.getInt("CodEje");
			this.nombreEjercicio = result.getString("NomEje");	
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * Instantiates a new ejercicio.
	 *
	 * @param codigo the codigo
	 * @param nombre the nombre
	 */
	public Ejercicio(int codigo, String nombre) {
		this.codigoEjercicio = codigo;
		this.nombreEjercicio = nombre;
	}
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	public String toString() {
		return this.codigoEjercicio+"   "+this.nombreEjercicio;
	}
	
}
