package ejercicio1;

public class Principal {

	public static void main(String[] args) {
		
		//Creacion del vector de 5 Objetos tipo Empleado y seteandolo de diferentes maneras. 
		Empleado [] empleados = new Empleado [5];
		empleados[0] = new Empleado();
		empleados[0].setNombre("Josefina");
		empleados[0].setEdad(18);
		empleados[1] = new Empleado();
		empleados[1].setNombre("Carlos");
		empleados[1].setEdad(52);
		empleados[2] = new Empleado("Juan", 30);
		empleados[3] = new Empleado("Sara", 20);
		empleados[4] = new Empleado("Pedro", 45);
		

		//Recorremos el array para mostrar cada objeto tipo Empleado.
		for (Empleado empleado : empleados) {
			System.out.println(empleado.toString());
			
		}
		//Mostramos por cartel el Próximo ID
		System.out.println("El proximo ID es: "+ Empleado.devuelveProximoID());
		
	}

}
