package edu.fpdual.GymApp.GymApp;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Timestamp;

import edu.fpdual.conector.Conector;
import edu.fpdual.dao.Rutina;
import edu.fpdual.dao.RutinaEjercicio;
import edu.fpdual.dao.Usuario;
import edu.fpdual.manager.EjercicioManager;
import edu.fpdual.manager.MusculosManager;
import edu.fpdual.manager.RutinaManager;
import edu.fpdual.manager.RutinaEjercicioManager;
import edu.fpdual.manager.UsuarioManager;
import javafx.scene.control.TextField;

import java.sql.Connection;

public class main {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Connection con = new Conector().getMySqlConnection();

		// new MusculosManager().findAll(con).forEach(musculos ->
		// System.out.println(musculos));

//		Usuario usu = new Usuario();
//		usu.setCodigo(1);
//		usu.setNombre("Jesús");
//		usu.setApellido1("Gutiérrez");
//		usu.setApellido2("Ramírez");
//		usu.setDireccion("Almería 37");
//		usu.setFechaNacimiento(new Date(03 - 8 - 1992));
//		usu.setAltura("179");
//		usu.setPeso(75);
//		usu.setContraseña("1111");

		//new UsuarioManager().insertUsuario(con, usu.getNombre(), usu.getApellido1(), usu.getApellido2(),usu.getDireccion(), usu.getFechaNacimiento(), usu.getPeso(), usu.getAltura(),usu.getContraseña());

		// new UsuarioManager().deleteUsuario(con, 2);
		// new UsuarioManager().findAll(con).forEach(usuarios ->
		// System.out.println(usuarios));
		// new EjercicioManager().listaEjercicios(con).forEach(ejercicio ->
		// System.out.println(ejercicio));

//		Rutina rutina = new Rutina();
//		rutina.setCodRut(1);
//		rutina.setNomRut("Espalda");
//		rutina.setCodigo(usu.getCodigo());
//		rutina.setFechIni(Timestamp.valueOf("1992-03-08 11:22:22"));
//		rutina.setFechFin(Timestamp.valueOf("1992-03-08 11:22:22"));
//
//		new RutinaManager().addRutine(con, rutina.getNomRut(), rutina.getCodigo(), rutina.getFechIni(),rutina.getFechFin());
//		
//		new RutinaManager().findAll(con).forEach(lista -> System.out.println(lista));
		
		
		
//		Usuario usuario = new Usuario();
//		usuario.setNombre("Jesus");
//		usuario.setContraseña("12345");
//		usuario.setApellido1("Gutierrez");
//		usuario.setApellido2("Ramirez");
//		usuario.setFechaNacimiento("11-23-32");
//		usuario.setDireccion("adfad");
//		usuario.setPeso(12);
//		usuario.setAltura("123");
//		
//		new UsuarioManager().insertUsuario(con, usuario.getNombre(),usuario.getContraseña(), usuario.getApellido1(), usuario.getApellido2(), usuario.getDireccion(), usuario.getFechaNacimiento(),usuario.getPeso(),  usuario.getAltura());
		
		//System.out.println(new UsuarioManager().findById(con, "ADFASDFA", "1234"));
		
		//new EjercicioManager().findByMuscle(con, "Dorsales").forEach(ejercicios -> System.out.println(ejercicios));
		
		
		
		

		
	}

}
