package cl.generation.f20221024;

public class Main {

	public static void main(String[] args) {
		// VARIABLES
		// var nombre_variable

		// variables primitivas, son de caracter estático
		int numero1 = 2; // variable numerica -2^31 y +2^31-1
		// -2,147,483,648 y 2,147,483,647 (inclusive)

		long numero2 = 2147483648l; // -2^63 y 2^63-1

		float decimal = 2.5f;
		float decimal2 = (float) 2.5; // castear
		double decimal3 = 9.8d;

		char caracter = 'a'; // siempre en 'comillas simples', no con "doble comillas"

		boolean respuesta = true; // false

		// investigar tipo de short y byte

		String palabra = "holas"; // cadena de caracteres, va con "doble comilla"

		System.out.println(numero1 + " " + numero2 + " " + decimal + " " + decimal2);
		System.out.println(decimal3 + " " + caracter + " " + respuesta + " " + palabra);

		// variables objeto, estas variables tienen mas propiedades.
		Integer numero3 = 2;
		// numero2.

		Long numero4 = 1234567890L;
		Float numero5 = 348583F;
		Double numero6 = 23495932134D;

		System.out.println(numero4 + numero5 + numero6 + numero3);
		// tarea: conversion a otro tipo de datos numericos.

		// el valueOf no solo obtiene el valor numerico de la variable, absorbe todas
		// las propiedades del objeto.
		// el valueOf nos retorna un Integer (variable objeto).
		// el parseo convierte un String a un valor numerico.
		// el parseo nos devuelve un int (valor primitivo).
		

	}

}
