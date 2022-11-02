package cl.generation.f20221102;

public class Basquetbolista extends Equipobasquetbol {

	private Float peso;
	private Float altura;
	
	public Basquetbolista() {
		super();
	}

	public Basquetbolista(Float peso, Float altura) {
		super();
		this.peso = peso;
		this.altura = altura;
	}

	public Float getPeso() {
		return peso;
	}

	public Float getAltura() {
		return altura;
	}

	public void setPeso(Float peso) {
		this.peso = peso;
	}

	public void setAltura(Float altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Basquetbolista [peso=" + peso + ", altura=" + altura + ", getNombre()=" + getNombre()
				+ ", getApellido()=" + getApellido() + ", getEdad()=" + getEdad() + "]";
	}
	
	@Override
	public void MetodoImprimir() {
		System.out.println("Estoy en el metodo de la clase hija Basquetbolista");
	}
	
}
