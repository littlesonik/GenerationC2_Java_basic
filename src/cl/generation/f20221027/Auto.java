package cl.generation.f20221027;

public class Auto {
	// atributos (en la parte superior deben ir estos)
	// la parte de privada me dice que no es llegar y pasar el dato, hay una manera
	// de ingresar a éstos.
	private String marca; // "Nissan" -> un atributo del auto es la marca, y le estoy asignando un valor String
	private String color; // "negro"
	private String modelo; // "ñuñuqui"
	private Float cilindrada; // 1.6 o 2.4, etc.
	private Float rendimiento; // 10.5 km/l
	private Float velocidad; // km/h
	

	// Constructor
	//nos permite la instancia (llamar) al objeto
	//nor permite inicializar los atributos
	
	//Creando constructor vacío
	public Auto() {
		super();
	}
	
	//Creando constructor con parametros
	public Auto(String marca, String color, String modelo, Float cilindrada, Float rendimiento, Float velocidad) {
		super();
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
		this.cilindrada = cilindrada;
		this.rendimiento = rendimiento;
		this.velocidad = velocidad;
	}
	
	//GETTER Y SETTERS (accesador y mutador)
	//el get obtiene (accede) al valor del atributo
	//el setter (mutador) cambia o reemplaza
	
	public String getMarca() {
		return marca;
	}


	public String getColor() {
		return color;
	}


	public String getModelo() {
		return modelo;
	}


	public Float getCilindrada() {
		return cilindrada;
	}


	public Float getRendimiento() {
		return rendimiento;
	}


	public Float getVelocidad() {
		return velocidad;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public void setCilindrada(Float cilindrada) {
		this.cilindrada = cilindrada;
	}


	public void setRendimiento(Float rendimiento) {
		this.rendimiento = rendimiento;
	}


	public void setVelocidad(Float velocidad) {
		this.velocidad = velocidad;
	}
	
	//metodos del objeto (acciones)
	
	public void avanzar () {
		System.out.println("estoy en el metodo avanzar del objeto");
	}

	
	//Este es un Metodo que estamos HEREDANDO
	//El override significa que está sobre escribiendo
	@Override
	public String toString() {
		return "Auto [marca=" + marca + ", color=" + color + ", modelo=" + modelo + ", cilindrada=" + cilindrada
				+ ", rendimiento=" + rendimiento + ", velocidad=" + velocidad + "]";
	}
	
	
}
