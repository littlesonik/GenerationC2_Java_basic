package cl.generation.f20221026;

import java.util.Scanner;

public class BucleDoWhileTest {

	public static void main(String[] args) {
		//dowhile
		//a lo menos se ejecuta una vez
		Scanner scanner = new Scanner(System.in);
		int edad = 0;
		Float kilos = 0F;
		Float estatura = 0F;
		
		do {
			System.out.println("ingresa tu edad");
			edad = scanner.nextInt();
			}while(edad < 18 || edad > 110); //mientras la edad sea menor a 18 o mayor a 110, el while se ejecutará nuevamente
		
		System.out.println("edad ingresada " + edad);
		
		
		do {
			System.out.println("ingresa tu peso");
			kilos = scanner.nextFloat();
			}while(kilos < 40 || kilos > 150);
		
		System.out.println("peso ingresado: " + kilos);
		
		do {
			System.out.println("ingresa tu estatura");
			estatura = scanner.nextFloat();
			}while(estatura < 1 || estatura > 2.5);
		
		System.out.println("estatura ingresada: " + estatura);
		
		scanner.close();
	}

}
