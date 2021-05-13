package died.guia06;

public class Main {

	public static void main(String[] args) {
		Alumno alumno1=new Alumno("Irina",5);
		Alumno alumno2=new Alumno("Lidia",6);
		System.out.println("Son iguales: "+ alumno1.equals(alumno2));
		
		System.out.println("Alumno 1: "+ alumno1.compareTo(alumno2));
		System.out.println("Alumno 2: "+ alumno2.compareTo(alumno1));
	}

}
