package edu.fpdual.GymApp.GymApp;

import java.net.URL;
import java.sql.Connection;
import java.util.ResourceBundle;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import edu.fpdual.conector.Conector;
import edu.fpdual.dao.RutinaEjercicio;
import edu.fpdual.manager.RutinaEjercicioManager;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class EjerciciosPorDiasController implements Initializable {

@FXML
ComboBox<String> diaSemanaCombobox;
@FXML
TableView<RutinaEjercicio> tablaEjercicios;
@FXML
TableColumn<RutinaEjercicio, String> columnaNombre;
@FXML
TableColumn<RutinaEjercicio, Integer> columnaPeso;
@FXML
TableColumn<RutinaEjercicio, String> columnaRepeticiones;
@FXML
TableColumn<RutinaEjercicio, String> columnaDescanso;
@FXML
TableColumn<RutinaEjercicio, CheckBox>  columnaCheck;


	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		try(Connection con = new Conector().getMySqlConnection()){
			ObservableList<String> items = FXCollections.observableArrayList();
			items.addAll("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo");

			diaSemanaCombobox.setItems(items);
			
		}catch (Exception e) {
			
		}
		
	}
	
	public void mostrarTabla( ) {
		try(Connection con = new Conector().getMySqlConnection()){
			this.columnaNombre.setCellValueFactory(new PropertyValueFactory<>("nombreEjercicio"));
			this.columnaPeso.setCellValueFactory(new PropertyValueFactory<>("Peso"));
			this.columnaRepeticiones.setCellValueFactory(new PropertyValueFactory<>("repeticiones"));
			this.columnaDescanso.setCellValueFactory(new PropertyValueFactory<>("descanso"));
			
			ObservableList<RutinaEjercicio> listaRutina = new RutinaEjercicioManager().mostrarTablaEjercicios(con, diaSemanaCombobox.getValue(), App.getUsuario().getCodigo()).stream().collect(Collectors.toCollection(FXCollections :: observableArrayList));
			tablaEjercicios.setItems(listaRutina);
			
		}catch (Exception e) {
			
		}
	}
	
	
}

