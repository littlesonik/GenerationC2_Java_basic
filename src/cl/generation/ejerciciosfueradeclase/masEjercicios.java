package cl.generation.ejerciciosfueradeclase;

public class masEjercicios {

	public static void main(String[] args) {
		// 1- Declara dos variables numéricas (con el valor que desees), 
		//muestra por consola la suma, resta, multiplicación, división y módulo (resto de la división).
		
		int num1 = 50;
		int num2 = 12;
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println(num1 % num2);
		
		//2) Declara 2 variables numéricas (con el valor que desees),
		//indica cual es mayor de los dos. Si son iguales indicarlo también. Ves cambiando los valores para comprobar que funciona.
		int num3 = 40;
		int num4= 40;
		if (num3 > num4) {
			System.out.println("el numero 1: " + num3 +  " es mayor que el numero 2: " + num4);
		}else if (num3 == num4) {
			System.out.println("el numero 1: " + num3 +  " es igual al numero 2: " + num4);
		}else {
			System.out.println("el numero 2: " + num4 +  " es mayor que el numero 1: " + num3);
		}

	}

}
