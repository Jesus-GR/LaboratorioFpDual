package edu.fpdual.GymApp.GymApp;

import java.io.IOException;

import javafx.fxml.FXML;

public class Rutinas {

	@FXML
	private void cambiarNuevaRutina() throws IOException {
		App.setRoot("nuevaRutina");
	}
	
	@FXML 
	private void cambiarLogin() throws IOException {
		App.setRoot("Login");
	}
	
	
	
}
