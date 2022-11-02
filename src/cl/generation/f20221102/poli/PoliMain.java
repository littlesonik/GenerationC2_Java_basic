package cl.generation.f20221102.poli;

public class PoliMain {

	public static void main(String[] args) {
		//Polimorfismo
		
		//instancia de las clases
		Mascota mascota = new Mascota();
				
		mascota.emitirSonido();
		
		Perro bellota = new Perro();
		bellota.emitirSonido();
		
		Gato barry = new Gato();
		barry.emitirSonido();
		
		/************* POLIMORFISMO *****************/
		System.out.println(" ");
		Mascota catan = new Perro(); // Esta mascota se va a comportar como perro, pero no es un perro
		
		Mascota silvestre = new Gato(); //Esta mascota se va a comportar como gato, pero no es un gato
		//tanto perro como gato heredan de la super clase mascota
		
		/* Polimorfismo: cuando una clase se comporta como otra, pero no es esa otra clase.
		 * Para que exista el polimorfismo debe existir Herencia (jerarquia de clases)
		 *
		 **/
		
		
		catan.emitirSonido();
		silvestre.emitirSonido();
		System.out.println(catan.toString());
		
		/*polimorfismo parametrico: el metodo se escribe igual, pero recibe distintos parametros*/
		//INVESTIGAR polimorfismo de inclusion
		
		silvestre.horasSiesta(6.5f);
		
		//Perro chocolo = (Perro) new Mascota ();
		Perro dog = (Perro) catan;
		dog.emitirSonido();
		

	}

}
