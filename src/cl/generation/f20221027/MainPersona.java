package cl.generation.f20221027;

import java.util.Scanner;

public class MainPersona {

	public static void main(String[] args) {
		// Instanciando la creacion de un nuevo objeto
		Persona persona1 = new Persona();

		// Asignando los valores
		Scanner scanner = new Scanner(System.in);
		System.out.println("******Ingreso de datos********");

		System.out.println("_______________________________");

		System.out.println("Ingresa datos de usuario ");

		System.out.println("_______________________________");

		System.out.println("Ingrese su nombre: ");
		persona1.setNombre(scanner.next());
		System.out.println("_______________________________");

		System.out.println("Ingrese su apellido: ");
		persona1.setApellido(scanner.next());

		System.out.println("_______________________________");

		System.out.println("Ingrese su edad: ");
		persona1.setEdad(scanner.nextInt());
		System.out.println("_______________________________");

		System.out.println("Ingrese su correo: ");
		persona1.setCorreo(scanner.next());

		System.out.println("_______________________________");

		System.out.println("Ingrese su telefono: ");
		persona1.setTelefono(scanner.nextInt());

		System.out.println("_______________________________");
		System.out.println("Los datos ingresados de la persona son: ");
		//System.out.println(persona1.toString());
		
		
		System.out.println("El nombre de la persona es: "+persona1.getNombre());
		System.out.println("El apellido de la persona es: "+persona1.getApellido());
		System.out.println("El edad de la persona es: "+persona1.getEdad());
		System.out.println("El correo de la persona es: "+persona1.getCorreo());
		System.out.println("El telefono de la persona es: "+persona1.getTelefono());
		
		scanner.close();

	}

}
