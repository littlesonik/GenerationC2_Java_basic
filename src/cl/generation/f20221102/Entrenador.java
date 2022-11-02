package cl.generation.f20221102;

public class Entrenador extends Equipobasquetbol{
	//EL concepto de herencia, se utiliza cuando tenemos atributos en comun,
	//entre distintos objetos (en este caso el nombre, apellido y edad del entrenador, kinesiologo y basquetbolista)
	//para utilizar estos atributos se utiliza el "extends" + el nombre de la superclase.
	//extends significa herencia
	
	private int aniosExperiencia;
	private String equipo;
	
	public Entrenador() {
		super();
	}

	public Entrenador(String nombre, String apellido, int edad, int aniosExperiencia, String equipo) {
		super(nombre, apellido, edad); //pasando valores al constructor de la superclase
		this.aniosExperiencia = aniosExperiencia;
		this.equipo = equipo;
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	@Override
	public String toString() {
		return "Entrenador [aniosExperiencia=" + aniosExperiencia + ", equipo=" + equipo + ", Nombre="
				+ getNombre() + ", Apellido=" + getApellido() + ", Edad=" + getEdad() + "]";
	}

	/*@Override
	public void MetodoImprimir() {
		System.out.println("Estoy en el metodo de la clase hija Entrenador");
	}*/

}
