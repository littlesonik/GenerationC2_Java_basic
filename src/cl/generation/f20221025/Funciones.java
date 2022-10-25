package cl.generation.f20221025;

import java.util.Arrays;

public class Funciones {

	public static void main(String[] args) {
		//Funciones o metodo
		
		//llamar a un metodo
		nombreMetodo();
		metodo2("Iván");
		metodo2("Zapata");
		metodo3(3);
		metodo4(77, 9.9f);
		String[] vocales = {"a","e","i","o","u"};
		metodo5(vocales);
		
	}
	
	//DEFINICION o estructura de un metodo
	//void -> el metodo no retorna ningún valor, solo se encarga de realizar su acción
	//static -> va a permitir no realizar una instancia, la podemos usar desde cualquier parte
	public static void nombreMetodo() {
		System.out.println("estoy dentro del metodo inicial...");
	}
	
	/*la palabra "static" nos permite acceder a este metodo
	 *sin la necesidad de crear una instancia de la clase
	 */
	//la instancia es una representacion especifica de una clase
	
	public static void metodo2(String nombre) {
		System.out.println("hola, soy " + nombre);
	}
	
	public static void metodo3(Integer numero) {
		System.out.println("Soy el numero: " + numero);
	}
	
	public static void metodo4(Integer numero1, Float numero2) {
		System.out.println("Soy el numero: " + numero1);
		System.out.println("Soy el numero: " + numero2);
	}
	
	public static void metodo5 (String[] arreglito) {
		System.out.println("Soy un arreglo " + Arrays.toString(arreglito));
	}

}
