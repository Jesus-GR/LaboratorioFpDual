package edu.fpdual.GymApp.GymApp;

import java.awt.event.MouseAdapter;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.mysql.cj.xdevapi.Statement;
import com.sun.glass.events.MouseEvent;

import edu.fpdual.conector.Conector;
import edu.fpdual.dao.Ejercicio;
import edu.fpdual.dao.Musculos;
import edu.fpdual.dao.RutinaEjercicio;
import edu.fpdual.dao.Usuario;
import edu.fpdual.manager.EjercicioManager;
import edu.fpdual.manager.MusculosManager;
import edu.fpdual.manager.RutinaManager;
import edu.fpdual.manager.RutinaEjercicioManager;
import edu.fpdual.manager.UsuarioManager;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class NuevaRutinaController implements Initializable {

	@FXML
	ComboBox<Musculos> comboBox;
	@FXML
	ComboBox<String> comboDias;
	@FXML
	TableView<Ejercicio> tablaMusculos;
	@FXML
	DatePicker inicioRutina;
	@FXML
	DatePicker finRutina;
	@FXML
	TextField nombreRutina;
	@FXML
	TableView<Ejercicio> tblEjercicio;
	@FXML
	TableColumn<Ejercicio, Integer> codigoEjercicioColumn;
	@FXML
	TableColumn<Ejercicio, String>  nombreEjercicioColumn;
	@FXML
	ListView<Ejercicio> listaEjercicios;
	@FXML
	Integer codigoUsuario;
	@FXML
	TextField userText;
	@FXML
	TextField repeticiones;
	@FXML
	TextField descanso;
	@FXML
	TextField peso;
	
	
	
	ObservableList<Ejercicio> ejercicios;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		try (Connection con = new Conector().getMySqlConnection()) {

			ObservableList<Musculos> musculos = new MusculosManager().findAll(con).stream()
					.collect(Collectors.toCollection(FXCollections::observableArrayList));
			ObservableList<String> items = FXCollections.observableArrayList();
			items.addAll("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo");

			comboDias.setItems(items);

			comboBox.setItems(musculos);
			
			ejercicios = FXCollections.observableArrayList();
			this.codigoEjercicioColumn.setCellValueFactory(new PropertyValueFactory<>("codigoEjercicio"));
			this.nombreEjercicioColumn.setCellValueFactory(new PropertyValueFactory<>("nombreEjercicio"));


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	@FXML
	public void comboAction() {
		System.out.println("Selected value : " + comboBox.getValue().getClass());
	}

	@FXML
	public void insertRutina() {
		try(Connection con = new Conector().getMySqlConnection()) {
			new RutinaManager().addRutine(con, nombreRutina.getText(), 1, inicioRutina.getValue().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),finRutina.getValue().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@FXML
	public void mostrarEjercicio() {
		try(Connection con = new Conector().getMySqlConnection()) {
			ObservableList<Ejercicio> ejercicio = new EjercicioManager().findByMuscle(con, comboBox.getValue().getNombreMusculo()).stream().collect(Collectors.toCollection(FXCollections::observableArrayList));
				
			tblEjercicio.setItems(ejercicio);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
	@FXML
	public void volverARutinas() throws IOException {
		App.setRoot("rutinas");
	}
	
	@FXML
	 ObservableList<Ejercicio> lista =  FXCollections.observableArrayList();
	@FXML
	public void añadirEjercicio() throws ClassNotFoundException {
		
			
				lista.add(tblEjercicio.getSelectionModel().getSelectedItem());
				listaEjercicios.setItems(lista);
	}
	
	@FXML
	public void guardarRutina() throws ClassNotFoundException, SQLException {
		try(Connection con = new Conector().getMySqlConnection()){
			new RutinaManager().addRutine(con, nombreRutina.getText(), 1, inicioRutina.getValue().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")), finRutina.getValue().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
			new RutinaEjercicioManager().nuevaRutina_Ejercicio(con, tblEjercicio.getSelectionModel().getSelectedItem().getCodigoEjercicio(), repeticiones.getText(), descanso.getText(), Integer.parseInt(descanso.getText()), comboDias.getValue(),tblEjercicio.getSelectionModel().getSelectedItem().getNombreEjercicio());
		}
	}
	
//	@FXML
//	public int obtenerCodUsu() {
//		try(Connection con = new Conector().getMySqlConnection()){
//			Usuario usuarioNombre = new Usuario();
//			usuarioNombre.setNombre(userText.getText());
//			this.codigoUsuario = new UsuarioManager().obtenerCodigoUsuario(con,usuarioNombre.getNombre());
//			return this.codigoUsuario;
//		}catch (Exception e) {
//			e.printStackTrace();
//			return 0;
//		}
//	}

}
