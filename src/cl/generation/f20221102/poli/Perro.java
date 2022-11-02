package cl.generation.f20221102.poli;

public class Perro extends Mascota{
	
	private String sonido;

	public Perro() {
		super();
	}

	public Perro(String raza, String nombre, String sexo) {
		super(raza, nombre, sexo);
		
	}

	public Perro(String raza, String nombre, String sexo, String sonido) {
		super(raza, nombre, sexo);
		this.sonido = sonido;
	}
	
	//Getter y setters
	public String getSonido() {
		return sonido;
	}

	public void setSonido(String sonido) {
		this.sonido = sonido;
	}
	

	@Override
	public String toString() {
		return "Perro [sonido=" + sonido + ", getRaza()=" + getRaza() + ", getNombre()=" + getNombre() + ", getSexo()="
				+ getSexo() + "]";
	}

	@Override
	public void emitirSonido() {
		System.out.println("el sonido (ladrido) es Guau Guau");
	}
	
}
