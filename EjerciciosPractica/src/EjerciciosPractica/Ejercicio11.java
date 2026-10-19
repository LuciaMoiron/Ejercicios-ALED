package EjerciciosPractica;

public class Ejercicio11 {
	public static void main(String[] args) {
		int tamaño=300;
		int modulo=16;
	char[] enteros= new char[tamaño];
	for(char i=0;i<enteros.length; i++) {
	enteros[i]= Character.toUpperCase(Character.forDigit(i%modulo, modulo));//El Character.forDigit lo que hace es poner letras hexadecimales a los numeros correspondientes
	System.out.println(enteros[i] + "");	                                  //El Character.toUpperCase las pone en mayúsculas
	}
	System.out.println("");
	}

}



