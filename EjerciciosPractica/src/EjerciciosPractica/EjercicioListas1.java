package EjerciciosPractica;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EjercicioListas1 {
	private static int numMedidas=10;
	
public static void main(String[] args) {
	
	
	Set<Measurement> medidas= new HashSet<>();
	Scanner teclado = new Scanner(System.in);
	for(int i=0; i<numMedidas; i++) {
		System.out.println("Medida " + (i+1) + ":");
	float[] valores=new float [4];
	for (int j = 0; j < 4; j++) {
		System.out.print("  Valor " + (j + 1) + ": ");
		valores[j] = teclado.nextFloat();
	}
	medidas.add( new Measurement(valores));

}
	System.out.println("Se han añadido " + medidas.size() + " medidas al Set");
	teclado.close();
}
}
