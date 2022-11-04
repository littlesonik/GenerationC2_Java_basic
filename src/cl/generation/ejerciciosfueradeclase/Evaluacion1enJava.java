package cl.generation.ejerciciosfueradeclase;


public class Evaluacion1enJava {

	public static void main(String[] args) {
		/*
		Funciones solicitadas:
		obs: los días se deben ingresar como tipo String y los valores de los productos a
		comprar se deben trabajar con arreglos, por ejemplo = [1000,500,650,8000]
		*/

		/*Don José todos los martes y jueves realiza un 20% de descuento en el total de las
		compras, crea una función la cual debe recibir un parámetro del día y el arreglo de
		valores de los productos a comprar, esta debe retornar el total final de la compra según
		corresponda o no descuento.*/
		int [] precios = {200,5500,900,7000,500,300};
		System.out.println(descuentos(precios));
		
		
		
		/*
		 * ● Se desea tener una función verificadora encargada de revisar si dentro de
		 * el arreglo de valores de los productos a comprar no existan valores negativos
		 * ingresados por error, en caso de no existir debe retornar un mensaje de
		 * éxito, en caso contrario debe retornar un mensaje de error junto con el
		 * número negativo y el índice en el que se encontraba.
		 */
		
		numerosNegativos(precios);
		/*
		 * ● Dado el siguiente arreglo [200,5500,900,7000,500,300] con los valores de
		 * cada producto
		 */

		// Crea una función que retorne el valor del producto más costoso.
		// Crea una función que retorne el valor del producto menos costoso.
		System.out.println("El numero mayor es: " + numMayor(precios));
		System.out.println("El numero menor es: " + numMenor(precios));

	}

	//Funcion que valida si el valor ingresado es negativo y muestra error
	public static void numerosNegativos(int array[]) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				System.out.println(
						"ERROR! el " + (i + 1) + " producto, con el valor: $" + array[i] + " no se encuentra bien ingresado");
			} else {
				System.out.println("Exito! $" + array[i]);
			}
		}
	}
	
	//funcion que retorna el numero mayor del array
	public static int numMayor (int array[]) {
		int numMayor = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > numMayor) {
				numMayor = array[i];
			}
		}
		return numMayor;
	}
	
	//funcion que retorna el numero menor del array
	public static int numMenor (int array[]) {
		int numMenor = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < numMenor) {
				numMenor = array[i];
			}
		}
		return numMenor;
	}
	
	//funcion ejercicios 1 y 2
	public static int descuentos (int array[]) {
		
		int precioTotal = 0;
		String dia = "lunes";
		boolean dctoDiezmil = false;
		for(int i = 0; i < array.length; i++){
	        precioTotal = precioTotal + array[i];
	    }
		if(dia == "martes" || dia == "jueves"){
	        precioTotal = (int) (precioTotal * 0.8);
	    }
	    for(int i = 0; i < array.length; i++){
	        if(array[i] >= 10000 && array.length >= 3){
	        dctoDiezmil = true;
	        		}
	    }
		if (dctoDiezmil){
	        precioTotal = (int) (precioTotal * 0.95);
	    }
	    return precioTotal;
	}
}