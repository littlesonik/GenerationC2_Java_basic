package cl.generation.f20221026;

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
		String[] arreglito = {"a","e","i","o","u"};
		metodo5(arreglito);
		//retorno1(); //no hace nada con el valor retornado
		System.out.println(retorno1());
		Integer valorRetornado = retorno1();
		System.out.println(valorRetornado);
		System.out.println(valorRetornado/7); //esta forma es mas optima que llamar a la función cada vez
		
		String nombreCompleto = obtenerNombreCompleto("Iván", "Zapata", "Pichinao");
		System.out.println("el nombre completo es: "+ nombreCompleto);
		//aprender a usar swagger
		
		llamadaOtroMetodo();
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
	
	//funciones con retorno
	//se cambia el "void" por el tipo de dato que quiero que me retorne
	public static Integer retorno1() {
		Integer totalAlumnos = 35;
		return totalAlumnos;
	}
	
	/**
	 * Metodo que une todos los datos
	 * @param nombre
	 * @param apePaterno
	 * @param apeMaterno
	 * @return
	 */
	//de esta forma nos ayuda a que nos muestre el orden al llamar y completar los parametros del metodo
	public static String obtenerNombreCompleto(String nombre, String apePaterno, String apeMaterno) {
		String nombreCompleto = nombre+" "+apePaterno+" "+apeMaterno;
		return nombreCompleto; //se retorna el contenido de la variable
	}
	
	public static void llamadaOtroMetodo() {
		System.out.println("llamada a otro metodo desde un metodo");
		metodo4(1234, 53.6f);
		}
}
