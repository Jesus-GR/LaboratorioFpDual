package edu.fpdual.GymApp.GymApp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import edu.fpdual.dao.Rutina;
import edu.fpdual.dao.Usuario;
import edu.fpdual.dto.RutinaEjercicioDto;

// TODO: Auto-generated Javadoc
/**
 * JavaFX App.
 */

public class App extends Application {
	
	
	/** The stage. */
	private static Stage stage;
	
	/** Creamos un usuario estático en App para poder utilizar el nombre en las siguientes pantallas. */
    private static Usuario usuario;
    
    /** Creamos una rutina estática en App. */
    private static Rutina rutina;
    
    /**  Creamos un objeto Integer de códigoRutina para poder obtener el código de la rutina sobre la que hemos hecho click en la tabla para poder utilizarlo más adelante. */
    private static Integer codRutina;
    
    /** The Nombre rutina por favor. */
   private static String NombreRutinaPorFavor;
   
   public static RutinaEjercicioDto getRutinaEjercicioDto() {
		return rutinaEjercicioDto;
	}

	public static void setRutinaEjercicioDto(RutinaEjercicioDto rutinaEjercicioDto) {
		App.rutinaEjercicioDto = rutinaEjercicioDto;
	}

/**
    * 
    */
   private static RutinaEjercicioDto rutinaEjercicioDto;
    /**
     * Gets the nombre rutina por favor.
     *
     * @return the nombre rutina por favor
     */
    public static String getNombreRutinaPorFavor() {
		return NombreRutinaPorFavor;
	}

	/**
	 * Sets the nombre rutina por favor.
	 *
	 * @param nombreRutinaPorFavor the new nombre rutina por favor
	 */
	public static void setNombreRutinaPorFavor(String nombreRutinaPorFavor) {
		NombreRutinaPorFavor = nombreRutinaPorFavor;
	}

	/**
     * Gets the cod rutina.
     *
     * @return the cod rutina
     */
    public static Integer getCodRutina() {
		return codRutina;
	}

	/**
	 * Sets the cod rutina.
	 *
	 * @param codRutina the new cod rutina
	 */
	public static void setCodRutina(Integer codRutina) {
		App.codRutina = codRutina;
	}

	/**
	 * Gets the rutina.
	 *
	 * @return the rutina
	 */
	public static Rutina getRutina() {
		return rutina;
	}

	/**
	 * Sets the rutina.
	 *
	 * @param rutina the new rutina
	 */
	public static void setRutina(Rutina rutina) {
		App.rutina = rutina;
	}

	/** The scene. */
	private static Scene scene;
    
    /**
     * Gets the scene.
     *
     * @return the scene
     */
    public static Scene getScene() {
		return scene;
	}

	/**
	 * Sets the scene.
	 *
	 * @param scene the new scene
	 */
	public static void setScene(Scene scene) {
		App.scene = scene;
	}

	/**
	 * Gets the usuario.
	 *
	 * @return the usuario
	 */
	public static Usuario getUsuario() {
		return usuario;
	}

	/**
	 * Sets the usuario.
	 *
	 * @param usuario the new usuario
	 */
	public static void setUsuario(Usuario usuario) {
		App.usuario = usuario;
	}

	

    /**
     * Start.
     *
     * @param stage the stage
     * @throws IOException Signals that an I/O exception has occurred.
     */
    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("Login"));
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();
        this.stage = stage;
    }

    /**
     * Sets the root.
     *
     * @param fxml the new root
     * @throws IOException Signals that an I/O exception has occurred.
     */
    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
        stage.sizeToScene();
    }

    /**
     * Load FXML.
     *
     * @param fxml the fxml
     * @return the parent
     * @throws IOException Signals that an I/O exception has occurred.
     */
    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        launch();
    }

}