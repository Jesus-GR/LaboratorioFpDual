package ejercicio3;
/*1- Hacer una clase llamada Cliente. Encapsular mínimo 5 características (variables) de un cliente. Desarrollar al menos 5 métodos (comportamientos) que este cliente pueda realizar.*/
public class Cliente {
	private String codigoCliente;
	private String nombre;
	private int edad;
	private String direccion;
	private float saldo;
	private int cantidadArticulosComprados = 0;
	private String historialCompra = "";
	
	/****Constructor***/
	
	public Cliente(String codigoCliente,String nombre, int edad, String direccion) {
		this.codigoCliente = codigoCliente;
		this.nombre = nombre;
		this.edad = edad;
		this.direccion = direccion;
		
	}
	
	/***Métodos***/
	
	public void añadirSaldo(double euros) {
		this.saldo += euros;
	}
	public void mostrarSaldo() {
		System.out.println(this.saldo);
	}
	
	int contadorArticulos = 0;
	String[] articulos = new String[100];
	
	public void comprar(String articulo, double precio) {
		
		articulos[contadorArticulos++] = articulo;
		
		
		this.saldo -= precio;
	}
	public void mostrarHistorial() {
		for (int i = 0; i < contadorArticulos; i++) {
			if(articulos[i]!="Libre") {
				System.out.println(articulos[i]);
			}
			
		}
		
	}
	public void devolverArticulo(String articulo, double precio) {
		this.saldo += precio;
		for (int i = 0; i < articulos.length; i++) {
			if(articulos[i] == articulo) {
				articulos[i]="Libre";
			}
		}
		
	}
	public String toString() {
		return "====================\nCodigo cliente: "+this.codigoCliente+"\nNombre:  "+this.nombre+"\nEdad: "+this.edad+"\nDirección: "+this.direccion+"\n====================";
	}
}
