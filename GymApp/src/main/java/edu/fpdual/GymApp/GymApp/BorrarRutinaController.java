package edu.fpdual.GymApp.GymApp;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

import edu.fpdual.conector.Conector;
import edu.fpdual.dao.Rutina;
import edu.fpdual.manager.RutinaEjercicioManager;
import edu.fpdual.manager.RutinaManager;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

// TODO: Auto-generated Javadoc
/**
 * The Class BorrarRutinaController.
 */
public class BorrarRutinaController  implements Initializable{
	

	/** The tbl borrar rutina. */
	@FXML
	TableView<Rutina> tblBorrarRutina;
	
	/** The column borrar rutina. */
	@FXML
	TableColumn<Rutina, String> columnBorrarRutina;
	
	/**
	 * Volver perfil.
	 *
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	@FXML
	public void volverPerfil() throws IOException {
		App.setRoot("perfil");
	}
	

	
	/**
	 * Delete rutine.
	 *
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws ClassNotFoundException the class not found exception
	 */
	@FXML
	public void deleteRutine() throws IOException, ClassNotFoundException {
		try(Connection con = new Conector().getMySqlConnection()){
				int codRut = tblBorrarRutina.getSelectionModel().getSelectedItem().getCodRut();
			new RutinaEjercicioManager().deleteRutinaEjercicio(con, codRut);
			
			new RutinaManager().deleteRutine(con, codRut);
	App.setRoot("perfil");
	}catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	/**
	 * Initialize.
	 *
	 * @param location the location
	 * @param resources the resources
	 */
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		try (Connection con = new Conector().getMySqlConnection()) {
			this.columnBorrarRutina.setCellValueFactory(new PropertyValueFactory<>("nomRut"));
			ObservableList<Rutina> rutinas = new RutinaManager().fillRutineByCodUsu(con, App.getUsuario().getCodigo()).stream().collect(Collectors.toCollection(FXCollections::observableArrayList));
			tblBorrarRutina.setItems(rutinas);

			
			
			
		}catch (NullPointerException e) {
			e.printStackTrace();
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e1) {
			
			e1.printStackTrace();
		}
		
	}
	
		
	

}
