package edu.fpdual.GymApp.GymApp;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import edu.fpdual.conector.Conector;
import edu.fpdual.dao.Usuario;
import edu.fpdual.manager.UsuarioManager;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
// TODO: Auto-generated Javadoc

@Getter
@Setter

@NoArgsConstructor
public class LoginController {

	/** The user text. */
	@FXML
	 private TextField userText;
	
	/** The password text. */
	@FXML
	private PasswordField passwordText;

	/**
	 * Switch to new user.
	 *
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	@FXML
	private void switchToNewUser() throws IOException {
		App.setRoot("nuevoUsuario");
	}

	/** The nombre usuario. */
	String nombreUsuario;
	
	/**
	 * Login.
	 *
	 * @throws ClassNotFoundException the class not found exception
	 * @throws SQLException the SQL exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	@FXML
	
	private void login() throws ClassNotFoundException, SQLException, IOException {
		Connection con = new Conector().getMySqlConnection();
		
		/*Utilizamos el método UsuarioManager().findById para almacenar en una variable usuario el resultado de la búsqueda y además lo almacenamos
		 * el resultado también en el Usuario de App*/
		Usuario usuario = new UsuarioManager().findByEmail(con, userText.getText(), passwordText.getText());
		System.out.println(usuario);
			if (usuario.getEmail() != null && usuario.getEmail().contains("@")) {
			App.setUsuario(usuario);
			App.setRoot("perfil");
		} else {
			Alert alerta = new Alert(AlertType.INFORMATION);
			alerta.setContentText("El email o la contraseña no son correctos");
			alerta.show();

		}

	}

	/**
	 * Enter.
	 *
	 * @param key the key
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws ClassNotFoundException the class not found exception
	 * @throws SQLException the SQL exception
	 */
	@FXML
	public void enter(KeyEvent key) throws IOException, ClassNotFoundException, SQLException {
		if (key.getCharacter().equals("\r")) {
			login();
		}
	}
	
	

}
