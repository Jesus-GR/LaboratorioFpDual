package edu.fpdual.GymApp.GymApp;

import java.net.URL;
import java.sql.Connection;
import java.util.ResourceBundle;

import edu.fpdual.conector.Conector;
import edu.fpdual.dao.RutinaEjercicio;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class EjerciciosPorDiasController implements Initializable {

	@FXML
	TableView<RutinaEjercicio> tblSemana;
	@FXML
	TableColumn<RutinaEjercicio, String> diaDeLaSemanaColumn;
	@FXML
	TableColumn<RutinaEjercicio, String> grupoMuscularColumn;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		try(Connection con = new Conector().getMySqlConnection()){
			
			
		}catch (Exception e) {
			
		}
		
	}
	
	
}

