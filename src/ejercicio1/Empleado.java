package ejercicio1;

public class Empleado {
	
	//ATRIBUTOS DEL OBJETO
	private final int id;
	private String nombre;
	private int edad;

	//ATRIBUTOS DE LA CLASE
	private static int contLegajo = 1000;
	
	//CONSTRUCTORES
	public Empleado() {
		this.id = contLegajo++;
		this.nombre = "sin nombre";
		this.edad = 99;
	}
	
	public Empleado( String nombre, int edad ) {
		this.id = contLegajo++;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	//METODOS �STATICOS
	public static int devuelveProximoID() {

	 return contLegajo;

	}

	//GETTERS Y SETTERS 
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return this.edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getId() {
		return this.id;
	}

	//METODO TOSTRING()
	@Override
	public String toString() {
		return "El empleado " + nombre + " tiene " + edad + " a�os y su ID es el n�mero " + id + ".";
	}
}
