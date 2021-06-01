package edu.fpdual.conector;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

// TODO: Auto-generated Javadoc
/**
 * The Class Conector.
 */
public class Conector {

	/** The prop. */
	/*
	 * Creamos un objeto de tipo Properties. La clase estándar de Properties permite
	 * almacenar información con una especie de índice y su valor
	 */
	Properties prop = new Properties();

	/**
	 * Creamos el conector
	 */

	public Conector() {
		try {
			/* En la clase de prop, cargame dentro la configuración en forma de stream */
			prop.load(getClass().getClassLoader().getResourceAsStream("config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	/**
	 * Ahora creamos un método para hacer la conexión 
	 * Gets the my sql connection.
	 *
	 * @return la conexión sql
	 * @throws SQLException the SQL exception
	 * @throws ClassNotFoundException the class not found exception
	 */
	public Connection getMySqlConnection() throws SQLException, ClassNotFoundException  {

		try {
			/*
			 * Esta linea quiere decir: Cárgame en la clase pre-establecida Class, la
			 * propiedad DRIVER del obejto getProperty. forName es para buscar por ese
			 * nombre.
			 */
			Class.forName(prop.getProperty(MySqlConstant.DRIVER));
			try {
				return DriverManager.getConnection(getURL());
			}catch(SQLException e) {
				e.printStackTrace();
				throw e;
				
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * Gets the url.
	 *
	 *Este método nos retorna un String, por eso el to String del final y es un
	 * StringBuilder y le vamos concatenando todo el texto de la url
	 * @return the url
	 */
	private String getURL() {
		return new StringBuilder().append(prop.getProperty(MySqlConstant.PREFIX))
				.append(prop.getProperty(MySqlConstant.HOST)).append(":")
				.append(prop.getProperty(MySqlConstant.PORT)).append("/")
				.append(prop.getProperty(MySqlConstant.SCHEMA)).append("?user=")
				.append(prop.getProperty(MySqlConstant.USER)).append("&password=")
				.append(prop.getProperty(MySqlConstant.PASSWD)).append("&useSSL=")
				.append(prop.getProperty(MySqlConstant.SSL)).append("&allowPublicKeyRetrieval=").append(prop.getProperty(MySqlConstant.ALLOW_PUBLIC_KEY)).toString();

	}

}
