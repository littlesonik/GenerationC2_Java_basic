package cl.generation.f20221025;

import java.util.HashSet;
import java.util.Iterator;

public class ArregloHashSet {

	public static void main(String[] args) {
		// set o HashSet

		// 1- Definicion del HashSet
		// HashSet<TIPODATO> nombre_array = new HashSet<TIPODATO>();

		HashSet<String> grupo4 = new HashSet<String>();

		// 2- Agregar elemento al arreglo
		grupo4.add("Carlos");
		grupo4.add("Michel");
		grupo4.add("Carlos"); // en este caso no es agregado, está repetido.
		grupo4.add("Maria Teresa");
		grupo4.add("Ignacia");
		grupo4.add("Iván");
		
		//3- recorrer el Hashset con while e iterator
		Iterator it = grupo4.iterator();
		while (it.hasNext()) {// el Next me dice que a la siguiente vuelta tome el siguiente valor
			System.out.println(it.next());
		}
		
		System.out.println("----------------------------");

		System.out.println(grupo4);
		// Agrega solo un tipo de dato, y le asigna un orden aleatorio.

		// 3- Verificar contenido del arreglo
		boolean verificacionNombre = grupo4.contains("Carlos");
		System.out.println(verificacionNombre);

		// 4- Eliminar un elemento por contenido
		grupo4.remove("Carlos");

		System.out.println(grupo4);
		// A diferencia del ArrayList, aqui removemos el objeto que queremos,
		// en un ArrayList se remueve por posicion, sin conocer el valor que este tiene.

		// 5- tamaño del arreglo
		System.out.println(grupo4.size());
		
		grupo4.add("Carlos");
		grupo4.add("Catan");
		grupo4.add("Bellota");
		
		//6- recorrer el arreglo
		//con el for iterador o for de objeto
		for(String integrantes : grupo4) {
			System.out.println(integrantes);
		}		
		
	}

}
