package cl.generation.f20221024;

import java.util.Arrays;

public class ejerciciodepractica {

	public static void main(String[] args) {
		// Escribir un arreglo de tamaño de 10,
		// con números positivos y negativos,
		// capturar en máximo y mínimo

		int numeroMayor = 0;
		int numeroMenor = 0;
		int[] ejercicio1 = { -3, -5, 4, 12, 3, 35, -35, 77, -1, 0 };
		for (int i = 0; i < ejercicio1.length; i++) {
			if (ejercicio1[i] > numeroMayor) {
				numeroMayor = ejercicio1[i];
			}
			if (ejercicio1[i] < numeroMenor) {
				numeroMenor = ejercicio1[i];
			}
		}
		System.out.println(numeroMayor);
		System.out.println(numeroMenor);

		// 2. El mismo arreglo crear otros 2 arreglos,
		// uno con solo los pares y otro arreglo solo con los impares.
		int[] pares = new int[ejercicio1.length];
		int[] impares = new int[ejercicio1.length];

		for (int i = 0; i < ejercicio1.length; i++) {
			if (ejercicio1[i] % 2 == 0) {
				pares[i] = ejercicio1[i];
			} else {
				impares[i] = ejercicio1[i];
			}
		}
		System.out.println(Arrays.toString(pares));
		System.out.println(Arrays.toString(impares));

		// 3. Para el mismo arreglo,
		// sacar el promedio de los números.
		int suma = 0;
		int promedio = 0;
		for (int i = 0; i < ejercicio1.length; i++) {
			suma = suma + ejercicio1[i];
		}
		promedio = suma / 2;

		System.out.println(promedio);

	}

}
