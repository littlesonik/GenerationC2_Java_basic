package cl.generation.f20221028;

public class Estudiante {
	//Atributos
	private String nombre;
	private String apellido;
	private Integer edad;
	private String rut;
	private String curso; //1A -> depende del contexto el atributo, podría trabajar de manera independiente el "nivel" y el "curso"
	private String correo;
	
	
	//Constructores
	public Estudiante() {
		super();
	}


	public Estudiante(String nombre, String apellido, Integer edad, String rut, String curso, String correo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.rut = rut;
		this.curso = curso;
		this.correo = correo;
	}

	//por protocolo se suele hacer un constructor vacío y uno con todos los atributos.

	public Estudiante(String nombre, String apellido, String rut) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.rut = rut;
	}


	public Estudiante(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}

	//Getters y Setters
	public String getNombre() {
		return nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public Integer getEdad() {
		return edad;
	}


	public String getRut() {
		return rut;
	}


	public String getCurso() {
		return curso;
	}


	public String getCorreo() {
		return correo;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public void setEdad(Integer edad) {
		this.edad = edad;
	}


	public void setRut(String rut) {
		this.rut = rut;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}

	
	//Metodos
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", rut=" + rut
				+ ", curso=" + curso + ", correo=" + correo + "]";
	}
	

}
