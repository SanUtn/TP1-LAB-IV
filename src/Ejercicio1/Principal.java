package ejercicio1;

public class Principal {

	public static void main(String[] args) {
		
		Empleado [] empleados = new Empleado [5];
		empleados[0] = new Empleado();
		empleados[1] = new Empleado();
		empleados[2] = new Empleado("Juan", 30);
		empleados[3] = new Empleado("Sara", 20);
		empleados[4] = new Empleado("Pedro", 45);
		

		//recorremos el array y mostramos cada uno
		for (Empleado empleado : empleados) {
			System.out.println(empleado.toString());
			
		}
		
		System.out.println("El proximo ID es: "+ Empleado.devuelveProximoID());
		
	}

}
