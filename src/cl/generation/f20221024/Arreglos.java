package cl.generation.f20221024;

import java.util.Arrays;

public class Arreglos {

	public static void main(String[] args) {
		// Arreglos (Array) en Java
		// son estáticos, no cambian de tamaño.

		int[] arreglo = new int[3];
		// arreglo.length; tamaño del arreglo.

		// A diferencia de JS los arreglos solo permiten un tipo de datos.
		// (todos los datos deben ser int, string, etc).

		// para agregar datos:
		arreglo[0] = 4; // a la posicion 0 se le agrega el valor tipo int "4"
		arreglo[1] = 8;
		arreglo[2] = 12;

		System.out.println(arreglo.toString());

		// imprimir arreglo
		System.out.println(Arrays.toString(arreglo));
		// imprimir arreglo según su indice
		System.out.println(arreglo[0]);

		// {}
		int[] sinNumeros = {}; // cero --> para asignar valores por default usamos {llaves} y no [corchetes]
		System.out.println(sinNumeros.length);

		// sinNumeros[0] = 1; //para un arreglo vacio NO SE PUEDE
		System.out.println(Arrays.toString(sinNumeros));

		String[] vocales = { "a", "e", "i", "o", "u" }; // se usó las llaves para asignar los valores por default
		System.out.println("cantidad de elementos: " + vocales.length);

		vocales[1] = "o";
		vocales[3] = "e";
		System.out.println(Arrays.toString(vocales));
		/*
		 * se pueden sobreescribir valores porque existen esas posiciones en el arreglo,
		 * ya que se reemplaza un valor str por otro str, si diera otro valor no me
		 * dejaria
		 */

		// crear un array de numeros flotantes de tamaño 6
		float[] numeros = new float[6];

		// Agregar 6 elementos al arreglo
		numeros[0] = 33; // por default trae el 33.0
		numeros[0] = -0.6f;

		System.out.println(numeros[0]);

		int[] numeroInt = new int[2];
		numeroInt[0] = (int) 0.2;
		System.out.println(numeroInt[0]);

		/*
		 * crear un arreglo de enteros tamaño 100 y agregar valores dinamicamente, desde
		 * el 1 al 100
		 */

		int[] arregloloco = new int[100];
		for (int i = 0; i < arregloloco.length; i++) {
			arregloloco[i] = i + 1;
		}

		System.out.println(Arrays.toString(arregloloco));

		/*
		 * crear un arreglo de enteros tamaño 100 y agregar valores dinamicamente, desde
		 * el 100 al 1
		 */

		int[] arreglo100a1 = new int[100];
		for (int i = 0; i < arreglo100a1.length; i++) {
			arreglo100a1[i] = 100 - i;
		}
		System.out.println(Arrays.toString(arreglo100a1));

		// solucion para ir decrementando tanto la posicion como el numero
		int[] arreglito = new int[100];

		for (int i = arreglito.length; i > 0; i--) { // i = 100
			arreglito[arreglito.length - i] = i; // arreglito[0] = 100
		}
		System.out.println(Arrays.toString(arreglito));

	}

}
