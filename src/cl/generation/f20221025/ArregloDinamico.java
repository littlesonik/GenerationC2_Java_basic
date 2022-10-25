package cl.generation.f20221025;

import java.util.ArrayList;
import java.util.Iterator;

public class ArregloDinamico {

	public static void main(String[] args) {
		// Arraylist o Arreglo dinámico
		// No se establece el tamaño del arreglo, se va sumando el dato.

		// 1- definicion
		// ArrayList<TIPODATO> nombre_array = new ArrayList<TIPODATO>();

		ArrayList<String> grupo4 = new ArrayList<String>();

		// 2- Agregar valores al arreglo
		grupo4.add("Carlos");
		grupo4.add("Michel");
		grupo4.add("Ignacia");
		grupo4.add("Maria Teresa");
		grupo4.add("Ivan");
		
		//Recorrer el ArrayList con while e iterator
		
		Iterator it = grupo4.iterator();
		while (it.hasNext()) {// el Next me dice que a la siguiente vuelta tome el siguiente valor
			System.out.println(it.next());
		}
		
		System.out.println("----------------------------");
		System.out.println(grupo4);

		// 3- tamaño del ArrayList

		System.out.println(grupo4.size());
		// Una forma de saber si el arreglo es dinamico o estatico es por:
		// .size (arreglo dinámico).
		// .length (arreglo estático).

		// 4- obtener un elemento dentro del arreglo
		System.out.println(grupo4.get(3));
		// System.out.println(grupo4.get(5)); Fuera de índice

		// 5- eliminar un elemento del ArrayList
		grupo4.remove(3);
		System.out.println(grupo4);

		grupo4.add("Maria Teresa");
		
		// 6- Recorrer el ArrayList
		for (int i = 0; i < grupo4.size(); i++) {
			System.out.println("integrantes grupo 4:" + grupo4.get(i));
		}

		System.out.println("----------------------------");
		// 7- "for" iterador o "for" de objeto
		for (String integrante : grupo4) {
			System.out.println(integrante);
		}
		//Este bucle es mas recomendado para este tipo de ArrayList
		/*el bucle del "for" anterior se utiliza en los Arrays estáticos
		 *ya que se conoce el tamaño del Array*/
		
		//ESTRUCTURA del for iterador
		// for (<TIPODATO> nombrevariable : arreglo){}
	}

}
