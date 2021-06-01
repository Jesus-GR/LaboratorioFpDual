package edu.fpdual.GymApp.GymApp;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.sun.glass.events.MouseEvent;

import edu.fpdual.conector.Conector;
import edu.fpdual.dao.RutinaEjercicio;
import edu.fpdual.dto.RutinaEjercicioDto;
import edu.fpdual.manager.RutinaEjercicioManager;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;
import mail.Sender;

// TODO: Auto-generated Javadoc
/**
 * The Class EjerciciosPorDiasController.
 */
public class EjerciciosPorDiasController implements Initializable {

	/** The dia semana combobox. */
	@FXML
	ComboBox<String> diaSemanaCombobox;

	/** The tabla ejercicios. */
	@FXML
	TableView<RutinaEjercicioDto> tablaEjercicios;

	/** The columna nombre. */
	@FXML
	TableColumn<RutinaEjercicioDto, String> columnaNombre;

	/** The columna peso. */
	@FXML
	TableColumn<RutinaEjercicioDto, Integer> columnaPeso;

	/** The columna repeticiones. */
	@FXML
	TableColumn<RutinaEjercicioDto, String> columnaRepeticiones;

	/** The columna descanso. */
	@FXML
	TableColumn<RutinaEjercicioDto, String> columnaDescanso;

	/** The columna check. */
	@FXML
	TableColumn<RutinaEjercicioDto, Boolean> columnaCheck;

	/**
	 * Initialize.
	 *
	 * @param location  the location
	 * @param resources the resources
	 */
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		try (Connection con = new Conector().getMySqlConnection()) {
			ObservableList<String> items = FXCollections.observableArrayList();
			items.addAll("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo");

			diaSemanaCombobox.setItems(items);

		} catch (Exception e) {

		}

	}

	/**
	 * Mostrar tabla.
	 *
	 * @param <T> the generic type
	 */
	@FXML
	public <T> void mostrarTabla() {
		try (Connection con = new Conector().getMySqlConnection()) {
			this.columnaNombre.setCellValueFactory(new PropertyValueFactory<>("nombreEjercicio"));
			this.columnaPeso.setCellValueFactory(new PropertyValueFactory<>("Peso"));
			this.columnaRepeticiones.setCellValueFactory(new PropertyValueFactory<>("repeticiones"));
			this.columnaDescanso.setCellValueFactory(new PropertyValueFactory<>("descanso"));
			this.columnaCheck.setCellValueFactory(new PropertyValueFactory<>("check"));
			

			ObservableList<RutinaEjercicioDto> listaRutina = new RutinaEjercicioManager()
					.mostrarTablaEjercicios(con, diaSemanaCombobox.getValue(), App.getCodRutina()).stream()
					.map(n -> new RutinaEjercicioDto(n))
					.collect(Collectors.toCollection(FXCollections::observableArrayList));

			tablaEjercicios.setItems(listaRutina);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Finalizar entrenamiento.
	 *
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	@FXML
	public void finalizarEntrenamiento() throws IOException {
		if( tablaEjercicios.getItems().stream().filter(data -> !data.getCheck().isSelected()).findAny().isPresent()) {
			Alert alerta = new Alert(AlertType.INFORMATION);
			alerta.setContentText("Aún no has finalizado la rutina al completo, vuelve al gym vago!!");
			alerta.show();
		}else {
			Sender sender = new Sender();
			sender.send("jgutiramirez92@gmail.com", "jgutiramirez92@gmail.com", "¡Enhorabuena!", "Has terminado tu rutina correctamente");
			App.setRoot("rutinas");
		}
		
		
	}
	@FXML
	public void volverARutinas() throws IOException {
		App.setRoot("rutinas");
	}

}
