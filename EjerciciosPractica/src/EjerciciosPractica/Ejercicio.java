package EjerciciosPractica;

public class Ejercicio {
	

		public static void main(String[] args) {
			int suma = 0;
			int contador = 0;

			System.out.println("Múltiplos de 5 entre 1 y 100:");
			for (int i = 5; i <= 100; i += 5) {
				System.out.print(i + " ");
				suma += i;
				contador++;
			}

			System.out.println("\n\nCantidad de múltiplos: " + contador);
			System.out.println("Suma total: " + suma);
		}
	}


