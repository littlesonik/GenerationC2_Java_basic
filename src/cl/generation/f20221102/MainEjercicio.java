package cl.generation.f20221102;

import java.util.ArrayList;

public class MainEjercicio {

	public static void main(String[] args) {

		//ALUMNOS
		ArrayList<Alumnos> listaAlumnos = new ArrayList<Alumnos>();
		
		//Creando alumnos y añadiendolos al ArrayList
		Alumnos alumno=new Alumnos();
		alumno.setNombre("Carlos");
		alumno.setApellido("Ancapi");
		alumno.setEdad(28);
		alumno.setCurso("Corte2");
		listaAlumnos.add(alumno);
		
		Alumnos alumno2=new Alumnos();
		alumno2.setNombre("Michel");
		alumno2.setApellido("Espinoza");
		alumno2.setEdad(25);
		alumno2.setCurso("Corte2");
		listaAlumnos.add(alumno2);
		
		Alumnos alumno3=new Alumnos();
		alumno3.setNombre("Ivan");
		alumno3.setApellido("Zapata");
		alumno3.setEdad(26);
		alumno3.setCurso("Corte2");
		listaAlumnos.add(alumno3);
		
		// Recorrer lista
		for (Alumnos clase : listaAlumnos) {
			System.out.println(clase.toString());
		}

		System.out.println("******************************************************");
		
		//PROFESORES
		ArrayList<Profesor> listaProfesores = new ArrayList<Profesor>();
		
		//Añadiendo profesores
		Profesor profe = new Profesor ();
		
		profe.setNombre("Claudia");
		profe.setApellido("Pizarro");
		profe.setEdad(38);
		profe.setAniosExperiencia(12);
		profe.setAsignatura("Lenguaje y Comunicación");
		
		Profesor profe2 = new Profesor ();
		profe2.setNombre("Jorge");
		profe2.setApellido("Castro");
		profe2.setEdad(58);
		profe2.setAniosExperiencia(25);
		profe2.setAsignatura("Matematicas");
		
		Profesor profe3 = new Profesor ();
		profe3.setNombre("Lorena");
		profe3.setApellido("Morales");
		profe3.setEdad(48);
		profe3.setAniosExperiencia(18);
		profe3.setAsignatura("Biologia");
		
		//añadiendo los profesores al ArrayList de profesores
		listaProfesores.add(profe);
		listaProfesores.add(profe2);
		listaProfesores.add(profe3);
		
		
		//recorriendo el ArrayList de profesores
		for (Profesor profesor : listaProfesores) {
		System.out.println(profesor.toString());
		}
		
		System.out.println("******************************************************");
		
		//DIRECTIVOS
		ArrayList<Directivos> listaDirectivos = new ArrayList<Directivos>();
		
		//Añadiendo directivos al directorio
		Directivos directivo=new Directivos();
		directivo.setNombre("Pablo");
		directivo.setApellido("Lopez");
		directivo.setEdad(45);
		directivo.setNombreInstitucion("Generation");
		directivo.setCargo("Director");
		
		Directivos directivo2=new Directivos();
		directivo2.setNombre("Juan");
		directivo2.setApellido("Gutierrez");
		directivo2.setEdad(45);
		directivo2.setNombreInstitucion("Generation");
		directivo2.setCargo("Mentor");
		
		Directivos directivo3=new Directivos();
		directivo3.setNombre("Ernesto");
		directivo3.setApellido("Perez");
		directivo3.setEdad(45);
		directivo3.setNombreInstitucion("Generation");
		directivo3.setCargo("Inspector");
		
		//Añadiendo directorios al ArrayList
		listaDirectivos.add(directivo);
		listaDirectivos.add(directivo2);
		listaDirectivos.add(directivo3);
		
		//recorriendo el ArrayList
		for (Directivos encargado : listaDirectivos) {
			System.out.println(encargado.toString());
		}

		System.out.println("******************************************************");
	}

}
