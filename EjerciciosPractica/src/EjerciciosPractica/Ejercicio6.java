package EjerciciosPractica;

public class Ejercicio6 {
	public static void main(String[] args) {
	int contador=0;
	int numero=2;
	System.out.println("Los 100 primeros números primos: ");
		for(numero=0; numero<=100; numero++) {
		if(esNumeroPrimo(numero)) {
		System.out.println(" "+ numero);
			
		}
	
		}
		
	}
	public static boolean esNumeroPrimo(int numero) {
		if (numero < 2) {
			return false;
		}
		if (numero == 2) {
			return true;
		}
		if (numero % 2 == 0) {
			return false;
		}
		
		
		for(int i=3; i*i<=numero; i++ ) {
			if(numero%i ==0) {
				return false;
			}
		}
		return true;
	}

}
