package cl.generation.f20221024;

public class Ejercicio1 {

	public static void main(String[] args) {
		// int a long, long a float y long a double

		// cambio de Int a Long
		int numero1 = 250;

		Long intafloat = Long.valueOf(numero1);

		Long intafloat2 = Long.parseLong(numero1 + "");// Long.parseLong("250")

		long intafloat3 = (long) numero1;

		// de Long a float
		long numero2 = 250l;

		float longafloat = Float.valueOf(numero2);

		float longafloat2 = Float.parseFloat(numero2 + "");

		// long a double
		long numero3 = 250l;

		double longadouble = Double.valueOf(numero3);

		double longadouble2 = Double.parseDouble(numero3 + "");

		// double a long
		double numero4 = 250d;

		long doublealong = Long.parseLong(numero4 + "");

		// double a float
		double numero5 = 250d;

		float doubleafloat = Float.parseFloat(numero5 + "");

		// -------------------------------------
		float numero6 = numero1;

		System.out.println(numero3);

		// la diferencia entre parse, casteo(valueOf)
		// el parse es para numeros compatibles
		// el casteo es para verificar que sean validos, si un dato es valido en una
		// variable

		// el valueOf no solo obtiene el valor numerico de la variable, absorbe todas
		// las propiedades del objeto.
		// el valueOf nos retorna un Integer (variable objeto).

		// el parseo convierte un String a un valor numerico.
		// el parseo nos devuelve un int (valor primitivo).

		System.out.println(intafloat + numero6 + doubleafloat + doublealong + numero5 + longadouble2 + longadouble
				+ intafloat2 + intafloat3 + longafloat + longafloat2);
	}

}
