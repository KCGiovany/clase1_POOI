/**************************************************
 * Autor:Herrera Lopez Giovnny                    *
 * Fecha de creacion:  20 de Marzo                *
 * Fecha de modificacion: 21 de Marzo             *
 * Descrpcion: Metodo burbuja                     *
 *************************************************/
package Tarea;

import java.util.Random;

public class MatrizTranspuesta {
	
	public static void main(String[] args) {
		
		
		//Ejemplo para matriz (cuadrada o no)
		int[][] matriz = new int[5][3];
		//Y en esta matriz almacenara los nuevos datos ya transpuestos 
		int[][] transpuesta = new int[matriz[0].length][matriz.length];
		inicializar(matriz);
		System.out.println("\nMatriz original\n");
		imprimir(matriz);		
		transponerMatriz(matriz, transpuesta);
		System.out.println("\n\nMatriz transpuesta\n");
		imprimir(transpuesta);
	}
	
	static void transponerMatriz(int[][] matriz, int[][] transpuesta){
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz[i].length;j++){
				transpuesta[j][i] = matriz[i][j];
			}
		}
	}
	
	//Llena la matriz con numeros aleatorios con la funcion Random
	static void inicializar(int[][] matriz){
		 Random r = new Random();
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz[i].length;j++){
				matriz[i][j] = r.nextInt(25) + 1; 
			}
		}
	}

	//Funcion para visualizar las matrices (Original - Transpuesta)
	static void imprimir(int[][] matriz){
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz[i].length;j++){
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
