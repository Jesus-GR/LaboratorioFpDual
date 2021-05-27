package edu.fpdual.GymApp.GymApp;

import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;

import edu.fpdual.conector.Conector;
import edu.fpdual.dao.Ejercicio;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class EjercicioController implements Initializable {

	@FXML
	TableView<Ejercicio> tablaMusculos;
//	@FXML
//	TableColumn<Ejercicio, Integer> codeColumn;
//	 @FXML
//	 TableColumn<Ejercicio, String> nomColumn;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
		try(Connection con = new Conector().getMySqlConnection()){
		
			//tablaMusculos.getColumns().addAll(codeColumn,nomColumn);
			
			
			
			
			
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
