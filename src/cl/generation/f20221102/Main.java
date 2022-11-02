package cl.generation.f20221102;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//Herencia en Java
		
		//Instanciando objetos
		
		Entrenador entrenador = new Entrenador();
		entrenador.setNombre("Jhon"); //al extender la clase padre (Equipobasquetbol), se pueden setear los atributos, getters y setter.
		entrenador.setApellido("Doe");
		entrenador.setEdad(55);
		entrenador.setAniosExperiencia(10);
		entrenador.setEquipo("Valdivia");
		
		System.out.println(entrenador.toString());
		//Aqui solo nos muestra los dos atributos pertenecientes a Entrenador
		//Al crear un objeto, al generar el toString se puede seleccionar los metodos heredados.
		
		Kinesiologo kine = new Kinesiologo();
		kine.setNombre("Jane");
		kine.setApellido("Doe");
		kine.setEdad(36);
		kine.setTitulo("Kinesiologia");
		kine.setEspecialidad("Kinesiología deportiva");
		
		ArrayList <Basquetbolista> listaJugadores = new ArrayList <Basquetbolista>();
		
		Basquetbolista jugador1 = new Basquetbolista();
		jugador1.setNombre("Michel");
		jugador1.setApellido("Pipen");
		jugador1.setAltura(1.99f);
		
		listaJugadores.add(jugador1); //agregando un objeto a la lista.
		
		Basquetbolista jugador2 = new Basquetbolista();
		jugador2.setNombre("Steve");
		jugador2.setApellido("Curry");
		jugador2.setAltura(2.5f);
		
		listaJugadores.add(jugador2);
		
		//recorrer lista
		for (Basquetbolista basquetbolista : listaJugadores) {
			System.out.println(basquetbolista.toString());
		}
		
		
		entrenador.MetodoImprimir();
		kine.MetodoImprimir();
		jugador1.MetodoImprimir();
		
		Ayudante ayudante = new Ayudante ();
		ayudante.MetodoImprimir();
		//Tarea: crear un curso donde tendremos al profesor, alumnos y directivos o administrativos
		//se debe heredar e imprimir tanto profesores, alumnos y administrativos que existan.
		
		
		
		//Polimorfismo
		//atributo de colaboración

	}

}
