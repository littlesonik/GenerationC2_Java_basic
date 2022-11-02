package cl.generation.f20221102.interfaces;

public class Main {

	public static void main(String[] args) {
		//Interfaces y clases abstractas
		
		//No se pueden instanciar clases abstractas
		// Animal animal = new Animal (); --> No se puede instanciar
		
		//Una clase abstracta es una clase donde solo se heredan los metodos
		
		Caballo caballo = new Caballo();
		caballo.setAltura(2.5f);
		
		Humano humano = new Humano();
		humano.metodoEnAnimal();
		
		//A modo de ejercicio crear clase León
		Leon leon = new Leon();
		//setearle la altura y el peso
		leon.setAltura(1.50f);
		leon.setPeso(250f);
		
		leon.metodoEnAnimal();
		System.out.println(leon.toString());
		
		Persona persona = new Persona();
		persona.setDni("19.360.144-8");
		persona.metodoEnAnimal();
		
	}
		
}