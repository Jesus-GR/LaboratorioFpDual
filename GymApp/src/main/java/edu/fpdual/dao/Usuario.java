package edu.fpdual.dao;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor

public class Usuario {

	private int codigo;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String direccion;
	private String fechaNacimiento;
	private String altura;
	private String peso;
	private String contraseña;
	
	public Usuario(ResultSet result) {
		try {
			this.codigo = result.getInt("CodUsu");
			this.nombre = result.getString("NomUsu");
			this.apellido1 = result.getString("Ape1");
			this.apellido2 = result.getString("Ape2");
			this.direccion = result.getString("Direccion");
			this.fechaNacimiento = result.getString("FechNac");
			this.altura = result.getString("Altura");
			this.peso = result.getString("Peso");
			this.contraseña = result.getString("Contraseña");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public Usuario(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
	
}
