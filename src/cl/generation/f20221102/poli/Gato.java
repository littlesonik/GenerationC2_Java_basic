package cl.generation.f20221102.poli;

public class Gato extends Mascota{
	
	private String sonido;

	
	//constructor vacío
	public Gato() {
		super();
	}

	//constructor con parametros
	public Gato(String sonido) {
		super();
		this.sonido = sonido;
	}

	
	//Getters y setters
	public String getSonido() {
		return sonido;
	}


	public void setSonido(String sonido) {
		this.sonido = sonido;
	}


	@Override
	public String toString() {
		return "Gato [sonido=" + sonido + "]";
	}


	@Override
	public void emitirSonido() {
		System.out.println("el sonido (maullido) es Miau");
	}
	
}
