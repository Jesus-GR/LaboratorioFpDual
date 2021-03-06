package edu.fpdual.GymApp.GymApp;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

import edu.fpdual.conector.Conector;
import edu.fpdual.dao.Ejercicio;
import edu.fpdual.dao.Musculos;
import edu.fpdual.manager.EjercicioManager;
import edu.fpdual.manager.MusculosManager;
import edu.fpdual.manager.RutinaManager;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

// TODO: Auto-generated Javadoc
/**
 * The Class RutinaEjercicioControlador.
 */
public class RutinaEjercicioControlador implements Initializable {

	/** The combo box. */
	@FXML
	ComboBox<Musculos> comboBox;
	
	/** The combo dias. */
	@FXML
	ComboBox<String> comboDias;
	
	/** The tabla musculos. */
	@FXML
	TableView<Ejercicio> tablaMusculos;
	
	/** The nombre rutina. */
	@FXML
	TextField nombreRutina;
	
	/** The code column. */
	@FXML
	TableColumn<Ejercicio, Integer> codeColumn;
	
	/** The nom column. */
	@FXML
	TableColumn<Ejercicio, String> nomColumn;
	

	/**
	 * Initialize.
	 *
	 * @param location the location
	 * @param resources the resources
	 */
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		try(Connection con = new Conector().getMySqlConnection()){
			
		ObservableList<Musculos> musculos = new MusculosManager().findAll(con).stream().collect(Collectors.toCollection(FXCollections::observableArrayList));
		ObservableList<String> items = FXCollections.observableArrayList();
		ObservableList<Ejercicio> ejercicios = (ObservableList<Ejercicio>) new EjercicioManager().findByMuscle(con, comboBox.getValue().getNombreMusculo());
		
		items.addAll("Lunes","Martes","Mi??rcoles","Jueves","Viernes","S??bado","Domingo");
		
		comboDias.setItems(items);
		
		comboBox.setItems(musculos);
		
		
		
		

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	 
	}
	
	/**
	 * Combo action.
	 */
	public void comboAction() {
	    System.out.println("Selected value : " + comboBox.getValue().getClass());
	}
	
	/**
	 * Lista ejercicios.
	 */
	public void listaEjercicios() {
		try(Connection con = new Conector().getMySqlConnection()){
			List<Ejercicio>ejercicios = new ArrayList<>();
			ejercicios.addAll(new EjercicioManager().findByMuscle(con, comboBox.getPromptText()));
			ejercicios.forEach(e -> System.out.println(e));
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	

}
