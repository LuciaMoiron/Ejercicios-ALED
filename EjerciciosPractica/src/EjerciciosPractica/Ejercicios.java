package EjerciciosPractica;

public class Ejercicios {
public static void main (String[] args) {
	short diasAño= 365;
	byte minutosHora= 60;
	byte segundosMinuto= 60;
System.out.println("Los segundos que tiene un año son: " + segundosAño (diasAño, minutosHora, segundosMinuto));
	

}

public static long segundosAño (short diasAño, byte minutosHora, byte segundosMinuto) {
int segundosDia= minutosHora*60*24;
long segundosAno= segundosDia*365;
return segundosAno;
		
}
}
