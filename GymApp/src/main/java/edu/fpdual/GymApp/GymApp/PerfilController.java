package edu.fpdual.GymApp.GymApp;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;

import edu.fpdual.conector.Conector;
import edu.fpdual.dao.Usuario;
import edu.fpdual.manager.RutinaEjercicioManager;
import edu.fpdual.manager.RutinaManager;
import edu.fpdual.manager.UsuarioManager;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

// TODO: Auto-generated Javadoc
/**
 * The Class PerfilController.
 */
public class PerfilController implements Initializable {
	
	/** The nombre perfil. */
	@FXML
	ListView<String> nombrePerfil;

	/**
	 * Initialize.
	 *
	 * @param location the location
	 * @param resources the resources
	 */
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		try(Connection con = new Conector().getMySqlConnection()){
			ObservableList<String> nombreUsuario = FXCollections.observableArrayList();
			nombreUsuario.add(App.getUsuario().getNombre());
			nombrePerfil.setItems(nombreUsuario);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	/**
	 * Ir mis rutinas.
	 *
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	@FXML
	public void irMisRutinas() throws IOException {
		App.setRoot("rutinas");
	}
	
	/**
	 * Ir nuev rutina.
	 *
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	@FXML
	public void irNuevRutina() throws IOException {
		App.setRoot("nuevaRutina");
	}
	
	/**
	 * Ir a login
	 * @throws IOException 
	 * 
	 */
	@FXML
	public void irALogin() throws IOException {
		App.setRoot("Login");
	}
	
	/**
	 * Borrar perfil.
	 *
	 * @throws ClassNotFoundException the class not found exception
	 * @throws SQLException the SQL exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws InterruptedException 
	 */
	@FXML
	public void borrarPerfil() throws ClassNotFoundException, SQLException, IOException, InterruptedException {
		try(Connection con = new Conector().getMySqlConnection()){
			new RutinaEjercicioManager().deleteRutinaEjercicioPorUsuarioFK(con, App.getUsuario().getCodigo());
			Thread.sleep(1000);
			new RutinaManager().deleteRutineCodUsu(con, App.getUsuario().getCodigo());
			
			new UsuarioManager().deleteUsuario(con, App.getUsuario().getCodigo());
			Thread.sleep(1000);
			App.setRoot("Login");
		}
		
	}
	
	

}
