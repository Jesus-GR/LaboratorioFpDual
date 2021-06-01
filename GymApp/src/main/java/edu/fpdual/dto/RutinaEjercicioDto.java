package edu.fpdual.dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import edu.fpdual.dao.RutinaEjercicio;
import javafx.scene.control.CheckBox;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// TODO: Auto-generated Javadoc

@NoArgsConstructor

@Setter

@Getter

@ToString

/**
 * 
 * @author jesus.maria.ramirez
 * Esta clase se ha creado para el uso de datos que no están en la base de datos.
 */
public class RutinaEjercicioDto {

	/** The cod rutina. */
	private int codRutina;
	
	/** The cod eje. */
	private int codEje;
	
	/** The repeticiones. */
	private String repeticiones;
	
	/** The descanso. */
	private String descanso;
	
	/** The Peso. */
	private int Peso;
	
	/** The dia. */
	private String dia;
	
	/** The nombre ejercicio. */
	private String nombreEjercicio;
	
	/** The check. */
	private CheckBox check;
	
	
	/**
	 * Instantiates a new rutina ejercicio dto.
	 *
	 * @param rutinaEjercicio the rutina ejercicio
	 */
	public RutinaEjercicioDto(RutinaEjercicio rutinaEjercicio)  {
		this.codEje = rutinaEjercicio.getCodEje();
		this.repeticiones = rutinaEjercicio.getRepeticiones();
		this.descanso = rutinaEjercicio.getDescanso();
		this.Peso = rutinaEjercicio.getPeso();
		this.dia = rutinaEjercicio.getDia();
		this.nombreEjercicio = rutinaEjercicio.getNombreEjercicio();
		this.check = new CheckBox();
		
	}
	
	
}
