package cl.generation.f20221102;

public class Equipobasquetbol {
	private String nombre;
	private String apellido;
	private int edad;
	
	public Equipobasquetbol() {
		super();
	}

	public Equipobasquetbol(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Equipobasquetbol [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}
	

	public void MetodoImprimir() {
		System.out.println("Estoy en el metodo de la super clase padre EquipoBasquetbol");
	}
	
}
