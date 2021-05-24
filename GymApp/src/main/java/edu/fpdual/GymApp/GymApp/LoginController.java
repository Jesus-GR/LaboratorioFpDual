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

public class LoginController {

	@FXML
	private TextField  userText;
	private PasswordField passwordText;
	
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    
    @FXML
    
   private void login() throws ClassNotFoundException, SQLException, IOException {
    	Connection con = new Conector().getMySqlConnection();
    	
    		if((new UsuarioManager().findById(con, userText, passwordText))) {
    		App.setRoot("nuevoUsuario");
    		}else {
    			Alert alerta = new Alert(AlertType.INFORMATION);
    			alerta.setContentText("El nombre de usuario o la contraseña son incorrectos");
    		}	
    }
    @FXML
	public void enter(KeyEvent key) throws IOException, ClassNotFoundException, SQLException {
	if(key.getCharacter().equals("\r")) {
	login();
	}
	}
    
}
