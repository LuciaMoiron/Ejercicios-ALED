package EjerciciosPractica;

public class Ejercicio12 {
	public static void main(String[] args) {
		float suma=0;
		float[] array= {1, 3, 6, 8, 14};
		for(int i=0;i<array.length;i++ ) {	
		suma+=array[i];
		
			
	}
		float promedio= suma/array.length;
		System.out.println("El promedio es: "+ promedio);
	
		
	}

}
