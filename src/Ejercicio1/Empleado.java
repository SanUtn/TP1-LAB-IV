package Ejercicio1;

public class Empleado {
	
	//ATRIBUTOS DEL OBJETO
	private final int id;
	private String nombre;
	private int edad;

	//ATRIBUTOS DE LA CLASE
	private static int contLegajo = 1000;
	
	//CONSTRUCTOR
	public Empleado() {
		id=contLegajo++;
	}

	//GETTERS Y SETTERS 
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getId() {
		return id;
	}
}
