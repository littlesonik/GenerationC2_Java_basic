package cl.generation.f20221102.interfaces;

public abstract class Animal {
	//se usa la palabra clave abstract para que no se puedan instanciar.
	
	private Float peso;
	private Float altura;
	
	public Animal() {
		super();
	}
	
	public Animal(Float peso, Float altura) {
		super();
		this.peso = peso;
		this.altura = altura;
	}

	
	public Float getPeso() {
		return peso;
	}

	public Float getAltura() {
		return altura;
	}

	public void setPeso(Float peso) {
		this.peso = peso;
	}

	public void setAltura(Float altura) {
		this.altura = altura;
	}
	
	//los metodos abstractos no pueden tener nada en su contenido
	
	/*public abstract void metodoEnAnimal() {
		System.out.println("Estoy en el metodo de animal");
	}*/
	
	public abstract void metodoEnAnimal();
	//definicion del metodo -> Definir es que no lleva {llaves}

	@Override
	public String toString() {
		return "Animal [peso=" + peso + ", altura=" + altura + "]";
	}

	//Las clases abstractas no se pueden implementar o instanciar
	
}
