package edu.fpdual.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
// TODO: Auto-generated Javadoc

/**
 * Gets the nombre musculo.
 *
 * @return the nombre musculo
 */
@Getter

/**
 * Sets the nombre musculo.
 *
 * @param nombreMusculo the new nombre musculo
 */
@Setter
@ToString

/**
 * Instantiates a new musculos.
 */
@NoArgsConstructor

public class Musculos {
	
	/** The codigo musculo. */
	private int codigoMusculo;
	
	/** The nombre musculo. */
	private String nombreMusculo;
	
	/**
	 * Instantiates a new musculos.
	 *
	 * @param result the result
	 */
	public Musculos(ResultSet result) {
		try {
			this.codigoMusculo = result.getInt("CodMusc");
			this.nombreMusculo = result.getString("NomMusc");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	public String toString() {
		return this.nombreMusculo+"";
	}
}
