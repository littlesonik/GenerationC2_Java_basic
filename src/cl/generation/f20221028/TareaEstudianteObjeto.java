package cl.generation.f20221028;

import java.util.ArrayList;
import java.util.Scanner;

public class TareaEstudianteObjeto {

	public static void main(String[] args) {
		
		//Tarea: Lograr ingresar de manera interactiva los datos de estudiantes en el objeto Estudiante
		Scanner scanner = new Scanner(System.in);
		
		//arreglo de estudiantes
		ArrayList <Estudiante> lista_estudiantes = new ArrayList <Estudiante>();
		//Buena practica -> nombrar el ArrayList en plural, porque se guardarán varios datos.
		
		int continuar = 2;
		
		//para solicitar los datos de los estudiantes mas de una vez, se crea un bucle do -while
		do {
			//instancia al objeto estudiante
			Estudiante estudiante = new Estudiante(); //creo una variable de tipo Estudiante vacía para capturar los datos.
			System.out.println("Ingrese nombre del estudiante");
			String nombre = scanner.nextLine();
			System.out.println("Ingrese apellido del estudiante");
			String apellido = scanner.nextLine();
			
			//Una vez capturado los datos, los seteo al objeto Estudiante
			estudiante.setNombre(nombre);
			estudiante.setApellido(apellido);
			
			//tambien se puede hacer uso del constructor con parámetros:
			//Estudiante estudiante = new Estudiante(nombre, apellido);
			
			lista_estudiantes.add(estudiante);
			
			//preguntar si se quiere seguir ingresando datos
			System.out.println("Desea agregar otro estudiante?");
			System.out.println("(1) SI   (2) NO");
			continuar = scanner.nextInt();
			scanner.nextLine(); //corrige error de capturar un numero y despues solicitar un string
			
		} while (continuar == 1); //si continuar es distinto de 1, se seguirá solicitando los datos para rellenar
		
		
		//recorrer la lista de estudiantes
		//se crea un for iterador
		for (Estudiante estudiante : lista_estudiantes) {
			System.out.println("*********************************");
			System.out.println("nombre: " + estudiante.getNombre() + " " + estudiante.getApellido());
			System.out.println(" ");
			System.out.println("*********************************");
		}
		
		//obtener un estudiante especifico
		System.out.println(lista_estudiantes.get(0)); //me dara todos los datos del objeto <Estudiante> en la posicion 0 del ArrayList (estudiantes)
		scanner.nextLine();
		
		//obtener un atributo de un estudiante en especifico
		System.out.println(lista_estudiantes.get(0).getNombre()); //Al estudiante en la posicion 0, accedemos a su atributo "Nombre"
		
		scanner.close();
	}

}