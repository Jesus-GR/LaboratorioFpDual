package edu.fpdual.GymApp.GymApp;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.format.DateTimeFormatter;

import edu.fpdual.conector.Conector;
import edu.fpdual.dao.Usuario;
import edu.fpdual.manager.UsuarioManager;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

// TODO: Auto-generated Javadoc
/**
 * The Class NuevoUsuarioController.
 */
public class NuevoUsuarioController {

	/** The nuevo nombre. */
	@FXML
	private TextField nuevoNombre;
	
	/** The nuevo primer apellido. */
	@FXML
	private TextField nuevoPrimerApellido;
	
	/** The nuevo segundo apellido. */
	@FXML
	private TextField nuevoSegundoApellido;
	
	/** The nueva direccion. */
	@FXML
	private TextField nuevaDireccion;
	
	/** The nueva fecha nac. */
	@FXML
	private DatePicker nuevaFechaNac;
	
	/** The nuevo peso. */
	@FXML
	private TextField nuevoPeso;
	
	/** The nueva altura. */
	@FXML
	private TextField nuevaAltura;
	
	/** The nueva contraseña. */
	@FXML
	private PasswordField nuevaContraseña;

	/**
	 * Insert usuario.
	 *
	 * @throws ClassNotFoundException the class not found exception
	 * @throws SQLException the SQL exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	@FXML

	public void insertUsuario() throws ClassNotFoundException, SQLException, IOException {
		
		try(Connection con = new Conector().getMySqlConnection()) {
			 new UsuarioManager().insertUsuario(con, nuevoNombre.getText(), nuevaContraseña.getText(),
					nuevoPrimerApellido.getText(), nuevoSegundoApellido.getText(), nuevaDireccion.getText(),
					nuevaFechaNac.getValue().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")), nuevoPeso.getText(), nuevaAltura.getText());
			App.setRoot("Login");
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
	
	/**
	 * Volver A login.
	 *
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	@FXML
	public void volverALogin() throws IOException {
		App.setRoot("Login");
	}
}
