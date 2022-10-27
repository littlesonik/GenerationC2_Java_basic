package cl.generation.f20221027;

public class Persona {
	//Craendo los atributos
	private String nombre;
	private String apellido;
	private Integer edad;
	private String correo;
	private Integer telefono;
	//Creando los contructores
	public Persona() {
		super();
	}
	//Creando constructor con parametros
	
	public Persona(String nombre, String apellido, Integer edad, String correo, Integer telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.correo = correo;
		this.telefono = telefono;
	}
	//Craendo gettern y setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}
	//Creando metodos objetos
	
	

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", correo=" + correo
				+ ", telefono=" + telefono + "]";
	}
	
	
	
	
	
	
	
	
}