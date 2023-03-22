/**************************************************
 * Autor:Herrera Lopez Giovnny                    *
 * Fecha de creacion:  20 de Marzo                *
 * Fecha de modificacion: 21 de Marzo             *
 * Descrpcion: Metodo burbuja                     *
 *************************************************/
package Tarea;

public class Burbuja {
		  
		  public static void main(String[] args) {
		    int[] arreglo = { 7, 2, 8, 4, 5, 9, 1, 3, 6 };
		    
		    // Muestra el arreglo antes de ser modificado
		    
		    System.out.println("Entrada del arreglo a modificar: ");
		    for (int i = 0; i < arreglo.length; i++) {
		      System.out.print(arreglo[i] + " ");
		    }
		    //Salto de linea
		    System.out.println();
		    
		    // Ordenamiento por el metodo burbuja
		    burbuja(arreglo);
		    // Salida del arreglo
		    System.out.println("Arreglo ordenado:");
		    for (int i = 0; i < arreglo.length; i++) {
		      System.out.print(arreglo[i] + " ");
		    }
		    System.out.println();
		  }
		  
		  public static void burbuja(int[] arreglo) {
		  
		    int num = arreglo.length;
		    int aux = 0;
		    
		    for (int i = 0; i < num; i++) {
		      for (int j = 1; j < (num - i); j++) {
		        if (arreglo[j - 1] > arreglo[j]) {
		          // intercambiamos los elementos
		          aux = arreglo[j - 1];
		          arreglo[j - 1] = arreglo[j];
		          arreglo[j] = aux;
		        }
		      }
		    }
		  }
		}
