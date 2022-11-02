package cl.generation.f20221102.interfaces;

public class Herbivoro extends Animal {
	//Cuando heredamos de un metodo abstracto, nos obliga a implementar un metodo (darle contenido al metodo).
	
	@Override
	public void metodoEnAnimal() {
		System.out.println("Dentro del metodo Herbivoro");
		//Aqui se está implementando el metodo, porque le estoy dando una funcion dentro de {llaves}		
	}

	//Una clase abstracta es una clase donde solo se heredan los metodos
}
