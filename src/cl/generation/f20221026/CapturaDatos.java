package cl.generation.f20221026;

import java.util.Scanner;

public class CapturaDatos {

	public static void main(String[] args) {
		Float IMC = calculoIMC();
		nivelIMC(IMC);
	}

	public static Float calculoIMC() {
		// Capturar datos ingresados por el usuario
		Scanner scanner = new Scanner(System.in);
		// creacion variable tipo Scanner //in significa entrada de datos

		// calculo del IMC; imc= kilos/(estatura*estatura)
		System.out.println("ingrese su peso en kilogramos");
		Float peso = scanner.nextFloat(); // captura la informacion del float
		System.out.println("el peso del paciente es: " + peso);

		System.out.println("ingrese su estatura en metros");
		Float estatura = scanner.nextFloat();
		System.out.println("la estatura del paciente es: " + estatura);

		Float imc = peso / (estatura * estatura);

		scanner.close(); // para finalizar el trabajo y deje de consumir memoria
		System.out.println("su IMC es: " + imc);

		return imc;
	}
	/*
	 * Por debajo de 18.5 Bajo peso 18.5 - 24.9 Normal 25.0 - 29.9 Sobrepeso 30.0 o
	 * más Obeso
	 */

	public static void nivelIMC(Float IMC) {
		if (IMC < 18.5F) {
			System.out.println("El paciente está en el rango BAJO PESO");
		} else if (IMC >= 18.5F && IMC < 25F) {
			System.out.println("El paciente está en el rango NORMAL");
		} else if (IMC >= 25 && IMC < 30) {
			System.out.println("El paciente está en el rango SOBRE PESO");
		} else {
			System.out.println("El paciente esta en el rango OBESO");
		}

	}

}
