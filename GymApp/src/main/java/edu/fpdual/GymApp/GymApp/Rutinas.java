package edu.fpdual.GymApp.GymApp;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

import edu.fpdual.conector.Conector;
import edu.fpdual.dao.Ejercicio;
import edu.fpdual.dao.Musculos;
import edu.fpdual.dao.Rutina;
import edu.fpdual.manager.EjercicioManager;
import edu.fpdual.manager.MusculosManager;
import edu.fpdual.manager.RutinaManager;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class Rutinas implements Initializable {

	@FXML
	TableView<Rutina> tblRutinas;
	@FXML
	TableColumn<Rutina, String> columnRutinas;
	
	@FXML
	private void cambiarNuevaRutina() throws IOException {
		App.setRoot("nuevaRutina");
	}
	
	@FXML
	private void cambiarEjerciciosPorDias() throws IOException {
		App.setRoot("ejerciciosPorDias");
	}
	
	@FXML 
	private void cambiarLogin() throws IOException {
		App.setRoot("Login");
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		try (Connection con = new Conector().getMySqlConnection()) {
			this.columnRutinas.setCellValueFactory(new PropertyValueFactory<>("nomRut"));
			
			ObservableList<Rutina> rutinas = new RutinaManager().fillRutineByCodUsu(con, App.getUsuario().getCodigo()).stream().collect(Collectors.toCollection(FXCollections::observableArrayList));
			tblRutinas.setItems(rutinas);
			
			
		}catch (NullPointerException e) {
			e.printStackTrace();
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e1) {
			
			e1.printStackTrace();
		}

	}
	
		
	}
	
