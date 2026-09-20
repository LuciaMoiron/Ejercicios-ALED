package EjerciciosPractica;

public class Ejercicio3 {
	public static void main(String[] args) {
	byte numero= 0;
	int suma=0;
	
	while (multiploCinco(numero)<= 100){
	System.out.println("El múltiplo de cinco es: " + multiploCinco(numero));
	suma=suma + multiploCinco(numero);
	numero++;

	System.out.println("La suma es: " + suma );	
	}
	
	}
	
	
	public static int multiploCinco(byte numero) {
	
	byte primerMultiplo=5;
	int resultado= primerMultiplo*numero;
	return resultado;
		
	}
	public static int sumaMultiplos(int suma, byte numero) {
	int sumaTotal= multiploCinco(numero)*numero;
	numero++;
	return sumaTotal;
	
	
	}
}
