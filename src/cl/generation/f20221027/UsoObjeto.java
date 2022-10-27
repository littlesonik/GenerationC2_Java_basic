package cl.generation.f20221027;

public class UsoObjeto {

	public static void main(String[] args) {
		// Instancia de clase
		Auto auto1 = new Auto();
		//Aqui estamos creando una variable de tipo Auto
		
		//auto1.color="rojo"; //no nos deja acceder a esta variable porque es privado
		
		//En este caso la importacion al objeto Auto no es necesaria,
		//porque el objeto Auto está dentro del mismo package.
		
		//Asignar valores a los atributos privados
		auto1.setColor("rojo"); //solo con el  metodo setter puedo asignarle un valor a un atributo privado
		auto1.setMarca("Lamborghini");
		
		auto1.setColor("blanco"); //si se settea un nuevo valor, se reemplaza
		
		//consultar los atributos (contenido de éstos)
		System.out.println(auto1.getColor());
		System.out.println(auto1.getModelo());
		
		//saber el contenido de los atributos
		System.out.println(auto1.toString());
		
		//nueva instancia de Auto
		Auto car = new Auto("Nissan", "Negro", "Qashqai", 1.6f,10.0f,240f);
		
		System.out.println(car.getModelo());
		
	}

}
