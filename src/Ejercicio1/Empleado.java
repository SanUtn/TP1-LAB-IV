package Ejercicio1;

public class Empleado {
	
	private final int id;
	private String nombre;
	private int edad;

	private static int contLegajo = 1000;
	
	public Empleado() {
		id=contLegajo++;
	}
}
