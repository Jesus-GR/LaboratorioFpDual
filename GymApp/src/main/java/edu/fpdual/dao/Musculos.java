package edu.fpdual.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString

public class Musculos {
	private int codigoMusculo;
	private String nombreMusculo;
	
	public Musculos(ResultSet result) {
		try {
			this.codigoMusculo = result.getInt("CodMusc");
			this.nombreMusculo = result.getString("NomMusc");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
}
