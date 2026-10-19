package EjerciciosPractica;

import java.util.Scanner;

public class Ejercicio7 extends Ejercicio6 {
public static void main(String[] args) {
	int i=2;
	System.out.println("Escriba un número: ");

	Scanner sc= new Scanner(System.in);
	int y= sc.nextInt();
	System.out.println("La descomposición de "+y+ " es: ");
	 while(y>1) {
			if(esNumeroPrimo(i)) {
			if(y%i == 0) {
			System.out.println(i + "x");
			y=y/i;
		
			
		}
			else {
				i++;
			}
			

       }
			else {
				i++; //porque si no cuando un numero no sea primo, no le hemos indicado que hacer
			}
    }
}

}



