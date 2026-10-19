package EjerciciosPractica;

import java.util.Scanner;

public class SolucionEjercicio4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca números enteros positivos (negativo para terminar):");

		int minimo = Integer.MAX_VALUE; //Le damos al valor minimo el maximo valor que soporta java para que cualquier numero que metamos sea menor
		int maximo = Integer.MIN_VALUE;
		boolean hayNumeros = false; //empezamos declarándolo falso porque todavia no se ha metido ningun numero

		while (true) { //bucle infinito
			System.out.print("Número: ");
			int numero = sc.nextInt(); //se guarda el numero que escriba la persona en la variable numero

			if (numero < 0) { //aqui sale del bucle si metes un numero negativo
				break;
			}

			hayNumeros = true; //aqui ya nos hemos asegurado de que la persona ya ha escrito un numero
			if (numero < minimo) {
				minimo = numero; //si el numero que metemos es menor se guarda en la variable minimo
			}
			if (numero > maximo) {
				maximo = numero;
			}
		}

		sc.close();

		if (!hayNumeros) {
			System.out.println("No se introdujeron números positivos.");
		} else {
			System.out.println("Mínimo: " + minimo);
			System.out.println("Máximo: " + maximo);
		}
	}
}


