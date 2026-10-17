package ApuntesClase;

import java.util.Arrays;

public class ejemploUsoBracktracking {
	//Laberinto
	public static boolean camino(int[][] mapa,int fila,int columna) {
	
	if(fila>mapa.length -1 || fila<0 || columna>mapa[0].length -1 || columna<0) {
		return false;
	}
	//if(fila>mapa[0].length) { // asi ves el tamaño de la fila, osea ves el numero de columnas, porque te metes a la posicion cero y ves lo que hay en esa fila, cuantas columnas
	//choco
	if(mapa[fila][columna] ==1) {
		return false;
	}
	//salida
	if(fila==mapa.length -1 && columna==mapa.length -1) {
		return true;
	}
	//Backtracking
		
	//PRUEBO
	mapa[fila][columna]=2;
	//EXPLORO
	if(camino(mapa, fila+1,columna) ||camino(mapa,fila-1, columna) || camino(mapa, fila, columna+1) || 	camino(mapa,fila,columna -1) ) {
		return true;
	}

	//VUELVO, cuando llegue aquí puedo estar en cualquier posicion, por eso no puedo decirle, fila 0 columna 2 ni nada.
	mapa [fila][columna] =0; //si te encuentras en un sitio sin camino, vuelve la posicion en la que estas a cero.
	return false;
	 
	}
	
	public static void main(String[] args) {
		int [][] mapa= {
				{0,0,1,0},
				{1,0,0,0},
				{0,0,1,1},
				{0,0,0,0}
		};
		System.out.println(mapa[0]);// imprime eso porque es una dirección de memoria
		System.out.println(Arrays.toString(mapa[0]));
		
				
	}
	}
	

