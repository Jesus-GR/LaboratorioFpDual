package edu.fpdual.GymApp.GymApp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import edu.fpdual.dao.Rutina;
import edu.fpdual.dao.Usuario;

/**
 * JavaFX App
 */

public class App extends Application {
	
	
	private static Stage stage;
	
	/**
	 * Creamos un usuario estático en App para poder utilizar el nombre en las siguientes pantallas
	 */
    private static Usuario usuario;
    private static Rutina rutina;
    private static String nombreRutinaPorFavor;
   

    public static String getNombreRutinaPorFavor() {
		return nombreRutinaPorFavor;
	}

	public static void setNombreRutinaPorFavor(String nombreRutinaPorFavor) {
		App.nombreRutinaPorFavor = nombreRutinaPorFavor;
	}

	public static Rutina getRutina() {
		return rutina;
	}

	public static void setRutina(Rutina rutina) {
		App.rutina = rutina;
	}

	private static Scene scene;
    
    public static Scene getScene() {
		return scene;
	}

	public static void setScene(Scene scene) {
		App.scene = scene;
	}

	public static Usuario getUsuario() {
		return usuario;
	}

	public static void setUsuario(Usuario usuario) {
		App.usuario = usuario;
	}

	

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("Login"), 640, 480);
        stage.setScene(scene);
        stage.show();
        this.stage = stage;
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
        stage.sizeToScene();
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}