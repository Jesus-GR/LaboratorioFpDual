package edu.fpdual.dao;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// TODO: Auto-generated Javadoc

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Rutina {
	
	/** The cod rut. */
	int codRut;
	
	/** The nom rut. */
	String nomRut;
	
	/** The codigo. */
	int codigo;
	
	/** The Fech ini. */
	Timestamp FechIni;
	
	/** The Fech fin. */
	Timestamp FechFin;

	/**
	 * Instantiates a new rutina.
	 *
	 * @param result the result
	 */
	public Rutina(ResultSet result) {
		
		try {
		this.codRut = result.getInt("CodRut");	
		this.nomRut = result.getString("NomRut");
		this.codigo = result.getInt("Usuario_CodUsu");
		this.FechFin = result.getTimestamp("FechIni");
		this.FechFin = result.getTimestamp("FechFin");
		
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
		return this.nomRut;
	}
}
