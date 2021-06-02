package edu.fpdual.excepciones;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class ErrorNuevoUsuario extends Throwable {

	private  String mensaje;
	
	
	public ErrorNuevoUsuario(String mensajeError) {
		this.mensaje = mensajeError;
	}
	
}
