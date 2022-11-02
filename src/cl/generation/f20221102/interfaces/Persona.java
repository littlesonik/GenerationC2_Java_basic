package cl.generation.f20221102.interfaces;

public class Persona extends Humano implements Generico{
	//Atributos que hereda
	/*
	 * Altura (heredado por Animal)
	 * Peso  (heredado desde Animal)
	 * Razonamiento (Heredado desde Humano)
	 * */
	
	//metodos
	/*MetodoEnAnimal
	 *Respirar
	 *Comer
	 **/
	private String dni;

	public Persona() {
		super();
	}

	public Persona(String dni) {
		super();
		this.dni = dni;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", Razonamiento=" + isRazonamiento() + ", Peso=" + getPeso()
				+ ", Altura=" + getAltura() + "]";
	}
	
	@Override
	public void metodoEnAnimal() {
		System.out.println("Las personas comen de todo");
	}
	
}
