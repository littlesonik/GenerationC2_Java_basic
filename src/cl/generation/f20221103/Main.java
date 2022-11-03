package cl.generation.f20221103;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//Objetos de colaboración
		
		Usuario usuario = new Usuario();
		
		/*ArrayList <String> telefono = new ArrayList <String>();
		String telefonito = "123456789";
		telefono.add(telefonito);
		telefono.add("543452342");
		
		
		usuario.setTelefonos(telefono);
		System.out.println(telefono);*/
		
		usuario.getTelefonos().add("348582");
		usuario.getTelefonos().add("495593");
		usuario.getTelefonos().add("1238483");
		System.out.println(usuario.getTelefonos());
		
		usuario.getTelefonos().add("3499449");
		//.getTelefonos se instancia al ArrayList / el .add añade el valor.
		
		//usuario.setDireccion("playa blanca 1258, renca, santiago");
		
		
				
		//Llenando el objeto direccion
		Direccion direccion = new Direccion();
		direccion.setCalle("Playa Blanca");
		direccion.setNumero("1258");
		direccion.setCiudad("Santiago");
		direccion.setRegion("Region Metropolitana");
		direccion.setSector("Renca");
		
		//Entregandole al Objeto Usuario el objeto Direccion
		usuario.setDireccion(direccion);
		
		System.out.println(usuario.getDireccion());
		
		//Se agrega de manera directa los datos, ya que se inicializó el objeto Direccion 
		//en el constructor vacío del Objeto Usuario
		Usuario usuario2 = new Usuario();
		usuario2.getDireccion().setCalle("Playa Blanca");
		
	}

}
