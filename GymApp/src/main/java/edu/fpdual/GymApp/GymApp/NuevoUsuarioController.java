package edu.fpdual.GymApp.GymApp;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.format.DateTimeFormatter;

import edu.fpdual.conector.Conector;
import edu.fpdual.manager.UsuarioManager;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class NuevoUsuarioController {

	@FXML
	private TextField nuevoNombre;
	@FXML
	private TextField nuevoPrimerApellido;
	@FXML
	private TextField nuevoSegundoApellido;
	@FXML
	private TextField nuevaDireccion;
	@FXML
	private DatePicker nuevaFechaNac;
	@FXML
	private TextField nuevoPeso;
	@FXML
	private TextField nuevaAltura;
	@FXML
	private PasswordField nuevaContraseña;

	@FXML

	public void insertUsuario() throws ClassNotFoundException, SQLException, IOException {
		
		try(Connection con = new Conector().getMySqlConnection()) {
			new UsuarioManager().insertUsuario(con, nuevoNombre.getText(), nuevaContraseña.getText(),
					nuevoPrimerApellido.getText(), nuevoSegundoApellido.getText(), nuevaDireccion.getText(),
					nuevaFechaNac.getValue().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")), nuevoPeso.getText(), nuevaAltura.getText());
			App.setRoot("nuevaRutina");
		} catch (Exception e) {
			e.printStackTrace();
			String error = "";
			
			if(nuevoNombre == null) {
				error += "El nombre no puede estar vacío";
			}else if(nuevaContraseña == null) {
				error += "La contraseña no puede estar vacía";
			}else if(nuevoPrimerApellido == null || nuevoSegundoApellido == null) {
				error+= "Los apellidos no pueden estar vacíos";
			}else if(nuevaDireccion == null) {
				error += "La direción no puede estar vacía";
			}else if(nuevaFechaNac == null) {
				error+= "La fecha de nacimiento no puede estar vacía";
			}else if(nuevoPeso == null) {
				error+= "El peso debe ser un valor positivo";
			}else if(nuevaAltura == null) {
				error+="La altura no puede estar vacía";
			}
			
			Alert alerta = new Alert(AlertType.INFORMATION);
			alerta.setContentText(error);
			alerta.showAndWait();
		}

	}
	
	@FXML
	public void volverALogin() throws IOException {
		App.setRoot("Login");
	}
}
