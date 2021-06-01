package edu.fpdual.manager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import edu.fpdual.dao.Musculos;

// TODO: Auto-generated Javadoc
/**
 * The Class MusculosManager.
 */
public class MusculosManager {

	/**
	 * Find all.
	 *
	 * @param con the con
	 * @return the list
	 */
	public List<Musculos> findAll(Connection con) {
		try(Statement stmt = con.createStatement()){
			ResultSet result = stmt.executeQuery("SELECT * FROM MUSCULOS");
			result.beforeFirst();
			List<Musculos> musculos = new ArrayList<>();
			while(result.next()) {
				musculos.add(new Musculos(result));
			}
			return musculos;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	
}
