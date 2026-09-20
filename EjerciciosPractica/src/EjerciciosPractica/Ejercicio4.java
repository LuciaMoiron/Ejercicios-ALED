package EjerciciosPractica;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
	int x=0;
	int valorMaximo=0;
	
	while(x>=0){
		Scanner sc= new Scanner (System.in);
		System.out.println("Introduzca número enteros: ");
		 x= sc.nextInt(); //CUANDO QUEREMOS DARLE A UNA VARIABLE EL VALOR DE OTRA, NO SE PONE INT...
	if(x >= valorMaximo) {
	valorMaximo = x;
	}
	
	System.out.println("El mayor numero entero escrito ha sido: " + valorMaximo);
	}
		
	System.out.println("El último número ha sido: " + valorMaximo);
		
		
	}

}
