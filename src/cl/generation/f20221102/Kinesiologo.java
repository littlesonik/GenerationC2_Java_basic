package cl.generation.f20221102;

public class Kinesiologo extends Equipobasquetbol {
	private String titulo;
	private String especialidad;
	
	public Kinesiologo() {
		super();
	}

	public Kinesiologo(String titulo, String especialidad) {
		super();
		this.titulo = titulo;
		this.especialidad = especialidad;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	@Override
	public void MetodoImprimir() {
		System.out.println("Estoy en el metodo de la clase hija Kinesiologo");
	}
	
}
