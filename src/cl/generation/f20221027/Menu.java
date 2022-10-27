package cl.generation.f20221027;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		// MENU DE OPCIONES
		// terminar la ejecucion
		// ofrecer opciones de repeticion (bucles)
		menu();

		// Calculadora con 4 operaciones básicas
		// solicitar 2 numeros y guardarlos en una variable
		// imprimir los resultados y guardar en una variable

		// definir los metodos (suma, resta, multiplicacion y division)
		// validar la entrada de solo numeros
		// limpiar las variables

	}

	// MENU DE OPCIONES
	// terminar la ejecucion
	// ofrecer opciones de repeticion (bucles)
	public static void menu() {
		Scanner scanner = new Scanner(System.in);
		int opciones = 0;
		int contadorErrores = 4;

		System.out.println("*********-****-***-**-*-**-***-****-*********");
		System.out.println("(~°w°)~      LA GRAN CALCULADORA      ~(°w°~)");
		System.out.println("*********-****-***-**-*-**-***-****-*********");
		System.out.println("(~°w°)~          1- SUMAR             ~(°w°~)");
		System.out.println("(~°w°)~          2- RESTAR            ~(°w°~)");
		System.out.println("(~°w°)~          3- MULTIPLICAR       ~(°w°~)");
		System.out.println("(~°w°)~          4-  DIVIDIR          ~(°w°~)");
		System.out.println("(~°w°)~          0-  SALIR            ~(°w°~)");
		System.out.println("*********-****-***-**-*-**-***-****-*********");

		do {
			System.out.println("(~°w°)~ Seleccione una opción ~(°w°~)");
			opciones = scanner.nextInt();

			// si la opcion es cero, salir del do -while
			if (opciones == 0) {
				System.out.println("(~°w°)~ Nos vemos! ~(°w°~)");
				break;
			}

			// Terminar el do -while si ingresas cierta cantidad de errores
			if (opciones < 0 || opciones > 4) {
				contadorErrores--;
				System.out.println("**       Te quedan " + contadorErrores + " intentos      **");
			}

			if (contadorErrores == 0) {
				System.out.println("(~°w°)~ Agotaste la cantidad de intentos, ADIOS ~(°w°~)");
				break;

			}

		} while (opciones < 0 || opciones > 4);

		System.out.println(contadorErrores);
		if (opciones == 0 || contadorErrores == 0) {
			System.out.println("Adios!");
		} else { // solo ingresará para opciones 1,2,3,4
			System.out.println("Fuera del while, opcion " + opciones);
			
			//solicitar 2 numeros
			System.out.println("Ingrese el primer numero");
			float numero1 = scanner.nextFloat();
			System.out.println("Ingrese el segundo numero");
			float numero2 = scanner.nextFloat();
			
			float resultado = 0;
			
			switch (opciones) {
			case 1: //SUMAR
				resultado = numero1 + numero2;
				System.out.println("El resultado de la suma es (~°w°)~ " + resultado);
				break;
			case 2: //RESTA
				resultado = numero1 - numero2;
				System.out.println("El resultado de la resta es (~°w°)~ " + resultado);

				break;
			case 3: //MULTIPLICACION
				resultado = numero1 * numero2;
				System.out.println("El resultado de la multiplicación es (~°w°)~ " + resultado);
				break;
			case 4: //DIVISION
				if (numero2 == 0) {
					System.out.println("NO SE PUEDE DIVIDIR POR CERO");
				}else {
				resultado = numero1 / numero2;
				System.out.println("El resultado de la división es (~°w°)~ " + resultado);
				}
				break;

			default:
				System.out.println("Opción no válida");
				break;
			}
		}
	}

}
