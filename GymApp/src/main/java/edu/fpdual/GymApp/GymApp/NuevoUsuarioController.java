package edu.fpdual.GymApp.GymApp;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import edu.fpdual.conector.Conector;
import edu.fpdual.manager.UsuarioManager;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class NuevoUsuarioController {
	
	private TextField nuevoNombre;
	private TextField nuevoApellido1;
	private TextField nuevoApellido2;
	private TextField nuevaDireccion;
	private DatePicker nuevaFechaNac;
	private TextField nuevoPeso;
	private TextField nuevaAltura;
	private PasswordField nuevaContraseña;

	
	@FXML
	
	public void insertUsuario() throws ClassNotFoundException, SQLException {
		Connection con = new Conector().getMySqlConnection();
		new UsuarioManager().insertUsuario(con, nuevoNombre.getText(), nuevoApellido1.getText(), nuevoApellido2.getText(), nuevaDireccion.getText(), nuevaFechaNac.getValue(), nuevoPeso.getTextFormatter(), nuevaAltura.getText(), nuevaContraseña.getText());
	}
	
	
	
}
