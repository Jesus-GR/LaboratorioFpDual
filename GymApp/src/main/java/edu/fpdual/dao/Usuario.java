package edu.fpdual.dao;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// TODO: Auto-generated Javadoc

@Getter
@Setter

@ToString

@NoArgsConstructor

public class Usuario {

	/** The codigo. */
	private int codigo;
	
	/** The nombre. */
	private String nombre;
	
	/** The apellido 1. */
	private String apellido1;
	
	/** The apellido 2. */
	private String apellido2;
	
	/** The direccion. */
	private String email;
	
	/** The fecha nacimiento. */
	private String fechaNacimiento;
	
	/** The altura. */
	private String altura;
	
	/** The peso. */
	private String peso;
	
	/** The contraseña. */
	private String contraseña;
	
	/**
	 * Instantiates a new usuario.
	 *
	 * @param result the result
	 */
	public Usuario(ResultSet result) {
		try {
			this.codigo = result.getInt("CodUsu");
			this.nombre = result.getString("NomUsu");
			this.apellido1 = result.getString("Ape1");
			this.apellido2 = result.getString("Ape2");
			this.email = result.getString("email");
			this.fechaNacimiento = result.getString("FechNac");
			this.altura = result.getString("Altura");
			this.peso = result.getString("Peso");
			this.contraseña = result.getString("Contraseña");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * Instantiates a new usuario.
	 *
	 * @param nombre the nombre
	 */
	public Usuario(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
	
}
