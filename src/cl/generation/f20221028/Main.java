package cl.generation.f20221028;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Estudiante estudiante = new Estudiante("Michel","Espinoza", null, null, null,
		// null)
		Estudiante estudiante = new Estudiante();
		ingresoEstudiantes();

	}

	public static void ingresoEstudiantes() {
		Estudiante estudiante = new Estudiante();
		//Crear un scanner para el ingreso de estudiantes
		Scanner scanner = new Scanner(System.in);
		System.out.println("******Ingreso de estudiantes********");

		System.out.println("_______________________________");


		System.out.println("Ingrese nombre del estudiante: ");
		estudiante.setNombre(scanner.next());
		System.out.println("_______________________________");

		System.out.println("Ingrese apellido de estudiante: ");
		estudiante.setApellido(scanner.next());

		System.out.println("_______________________________");

		System.out.println("Ingrese edad del estudiente: ");
		estudiante.setEdad(scanner.nextInt());
		System.out.println("_______________________________");

		System.out.println("Ingrese rut del estudiente: ");
		estudiante.setRut(scanner.next());

		System.out.println("_______________________________");

		System.out.println("Ingrese curso de estudiante: ");
		estudiante.setCurso(scanner.next());
		
		System.out.println("_______________________________");

		System.out.println("Ingrese correo de estudiante: ");
		estudiante.setCorreo(scanner.next());
	}
}
