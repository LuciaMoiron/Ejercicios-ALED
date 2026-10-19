package EjerciciosPractica;

public class Ejercicio10 {
	
	
	public static void main(String[] args) {
		int tamaño=300;
		int modulo=16;
	int[] enteros= new int[tamaño];
	for(int i=0;i<enteros.length; i++) {
	enteros[i]= i%modulo;
	System.out.println(enteros[i] + "");	
	}
	System.out.println("");
	}

}
