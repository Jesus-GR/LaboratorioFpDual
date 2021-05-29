package edu.fpdual.dao;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Rutina {
	
	int codRut;
	String nomRut;
	int codigo;
	Timestamp FechIni;
	Timestamp FechFin;

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
	
	public String toString() {
		return this.nomRut;
	}
}
