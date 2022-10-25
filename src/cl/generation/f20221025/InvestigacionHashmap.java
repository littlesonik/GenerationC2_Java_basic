package cl.generation.f20221025;

import java.util.HashMap;
import java.util.Iterator;

public class InvestigacionHashmap {

	public static void main(String[] args) {
		// Investigar y exponer sobre los Hashmap
		// buscar definicion y propiedades, como se recorre, etc.
		// compararlos con el ArrayList y HashSet.
		// como recorrer un arreglo con while y con iterator.

		/*
		 * ArrayList<String> grupo4 = new ArrayList<String>(); grupo4.add("Carlos");
		 * grupo4.add("Michel"); grupo4.add("Ignacia"); grupo4.add("Maria Teresa");
		 * grupo4.add("Ivan");
		 * 
		 * Iterator it = grupo4.iterator(); while (it.hasNext()) {// el Next me dice que
		 * a la siguiente vuelta tome el siguiente valor System.out.println(it.next());
		 * }
		 */
		// El iterator es un índice

		// 1- definicion
		// HashMap<TIPODATO, TIPODATO> seriesFavoritas = new HashMap<TIPODATO,
		// TIPODATO>();
		HashMap<String, String> seriesFavoritas = new HashMap<String, String>();

		// 2- Agregar valores al arreglo
		seriesFavoritas.put("Carlos", "Sons of Anarchy");
		seriesFavoritas.put("Ivan", "Better Call Saul");
		seriesFavoritas.put("Ignacia", "Young Royals");
		seriesFavoritas.put("Michel", "Mandalorian");
		seriesFavoritas.put("Maria Teresa", "One Piece"); 
		//seriesFavoritas.put("Maria Teresa", "Naruto"); -> si ya existe la clave, sobreescribe el valor

		System.out.println("2: " + seriesFavoritas);
		System.out.println("-----------------------------------------------");

		// 3- tamaño del Hashmap
		System.out.println("3: " + seriesFavoritas.size());

		System.out.println("-----------------------------------------------");

		// 4- obtener un elemento dentro del Hashmap

		System.out.println("4: " + seriesFavoritas.get("Carlos")); //accede a un dato a través de la clave,no por la posicion

		System.out.println("-----------------------------------------------");

		// 5- eliminar un elemento del Hashmap
		seriesFavoritas.remove("Carlos");
		System.out.println("5: " + seriesFavoritas);

		System.out.println("-----------------------------------------------");

		// 6- recorrer el Hashmap
		System.out.println("6: ");
		for (String series : seriesFavoritas.keySet()) {
			System.out.println(series);
		}

		System.out.println("-----------------------------------------------");
		System.out.println("6: ");
		for (String series : seriesFavoritas.values()) {
			System.out.println(series);
		}
		
		System.out.println("-----------------------------------------------");
		System.out.println("6: ");
		
		//Uso del formap:
		/*for (Map.Entry<keyType, valType> entry : map.entrySet()) {
			keyType key = entry.getKey();
			valType val = entry.getValue();	
		}
		*/
		for(String clave: seriesFavoritas.keySet()) {
			System.out.println("clave: " + clave + " valor: " + seriesFavoritas.get(clave));
		}

		System.out.println("-----------------------------------------------");
		
		// 7- Recorrer el Hashmap con while e iterator
		Iterator it = seriesFavoritas.keySet().iterator();
		while (it.hasNext()) {
			String clave = (String) it.next();
			String valor = seriesFavoritas.get(clave);
			System.out.println("Clave: " + clave + ", valor: " + valor);
		}
		
		System.out.println("-----------------------------------------------");
		
		
	}

}
