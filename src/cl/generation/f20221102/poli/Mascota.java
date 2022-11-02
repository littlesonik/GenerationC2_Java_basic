package cl.generation.f20221102.poli;

public class Mascota {
	//atributos
	private String raza;
	private String nombre;
	private String sexo;
	
	//constructores vacios
	public Mascota() {
		super();
	}

	//constructores
	public Mascota(String raza, String nombre, String sexo) {
		super();
		this.raza = raza;
		this.nombre = nombre;
		this.sexo = sexo;
	}

	//Getters y Setters
	public String getRaza() {
		return raza;
	}

	public String getNombre() {
		return nombre;
	}

	public String getSexo() {
		return sexo;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	//ToString
	@Override
	public String toString() {
		return "Mascota [raza=" + raza + ", nombre=" + nombre + ", sexo=" + sexo + "]";
	}
		
	public void emitirSonido() {
		System.out.println("el sonido es ...");
	}
	
	//polimorfismo parametrico
	//SOBRECARGA DEL METODO
	public void horasSiesta() {
		System.out.println("La mascota no duerme");
	}
	
	public void horasSiesta(int horas) {
		System.out.println("La mascota duerme " + horas + " horas");
	}
	
	public void horasSiesta(float horas) {
		System.out.println("La mascota duerme " + horas + " horas");
	}
	
}
