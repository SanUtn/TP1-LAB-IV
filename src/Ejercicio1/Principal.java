package Ejercicio1;

public class Principal {

	public static void main(String[] args) {
		Empleado empleado1 = new Empleado("Juan", 30);
		
		System.out.println(empleado1.toString());

		System.out.println("El proximo ID es:"+Empleado.devuelveProximoID());
	}

}
