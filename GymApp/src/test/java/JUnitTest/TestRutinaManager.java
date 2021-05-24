package JUnitTest;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Timestamp;

import org.junit.After;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import edu.fpdual.conector.Conector;
import edu.fpdual.dao.Rutina;
import edu.fpdual.dao.Usuario;
import edu.fpdual.manager.RutinaManager;

@RunWith(JUnitPlatform.class)
public class TestRutinaManager {
	
	@BeforeEach
	
	public void sysout() {
		System.out.print("============Prueba Insert============");
	}
	
//	@Test
//	public  void testCase() throws ClassNotFoundException, SQLException {
//		Connection con = new Conector().getMySqlConnection();
//		Usuario usu = new Usuario();
//		usu.setCodigo(123);
//		
//	Rutina rutina = new Rutina();
//	rutina.setNomRut("Espalda/Pecho");
//	rutina.setCodigo(usu.getCodigo());
//	rutina.setFechIni(Timestamp.valueOf("03-08-1992"));
//	rutina.setFechFin(Timestamp.valueOf("03-08-1992"));
//	
	
	//new RutinaManager().addRutine(con, rutina.getNomRut(), rutina.getCodigo(), rutina.getFechIni(), rutina.getFechFin());
	
	
	@Test
	
	public void endTest() throws ClassNotFoundException {
		try {
				Connection con = new Conector().getMySqlConnection();
		new RutinaManager().deleteRutine(con);
		}catch(SQLException e) {
			e.printStackTrace();
		}
	
	}
	
	@AfterAll
	 public void end() {
		System.out.print("===========Fin prueba==========");
	}

}
