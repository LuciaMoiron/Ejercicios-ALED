package EjerciciosPractica;

public class Ejercicio9 {
	public static void main(String[] args) {
	int [] ints= {1,2,3,4,8,5,7,15};
	System.out.println("El 5 está en la posición: " + devolverInt(ints,5));
	System.out.println("El 11 está en la posición: " + devolverInt(ints,11));
	}
	
	private static int devolverInt (int[]ints, int valor) {
		if(ints==null) {
			return -1;
		}
		for(int i=0; i<ints.length; i++) {
		
			if(ints[i] ==valor) {
				return i;
	}
	
	}
	return -1;
	}
	
	}
		
	


