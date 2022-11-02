package cl.generation.f20221102.interfaces;

public class Humano extends Omnivoro implements Generico{
	//que yo herede de una clase abstracta no lo hace abstracto, por lo que se puede heredar

	private boolean razonamiento;

	public Humano() {
		super();
	}

	public Humano(boolean razonamiento) {
		super();
		this.razonamiento = razonamiento;
	}

	public boolean isRazonamiento() {
		return razonamiento;
	}

	public void setRazonamiento(boolean razonamiento) {
		this.razonamiento = razonamiento;
	}

	
	@Override
	public void respirar() {
		System.out.println("El humano respira");
	}

	@Override
	public void comer() {
		System.out.println("El humano come de todo");
	}
	
	@Override
	public void metodoEnAnimal() {
		System.out.println("El Humano comen de todo");
		
	}
	
}
