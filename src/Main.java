import uade.edu.ar.backtraking.batalla.AlgoritmoBatallaNavalImpl;
import uade.edu.ar.backtraking.batalla.Resultado;
import uade.edu.ar.backtraking.batalla.Ubicacion;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	char[] emb= {'H','T','M','S'};
    	
    	
    	char[][] oceano = { 
    			{'1','H','H','T','M'},
    			{'1','2','3','2','1'},
    			{'2','1','1','1','2'},
    			{'3','4','3','3','1'}
    			
    	};
    	
//    	 Scanner sc =  new Scanner(System.in);
//         int filas , columnas;
//         System.out.println("Cuantas filas deseas?: ");
//         filas = sc.nextInt();
//         System.out.println("Cuantas columnas deseas?: ");
//         columnas = sc.nextInt();
//         char nombres[][] = new char[filas][columnas];
//         for(int i = 0; i < nombres.length; i++){
//             for(int j = 0; j < nombres[i].length; j++){
//                 System.out.println("Ingresa el nombre de la fila " + i + " y la columna " + j);
//                 nombres[i][j] = sc.next();
//             }
//         }
//
//         for(int f = 0; f < nombres.length; f++){
//             for(int c = 0; c < nombres[f].length; c++){
//                 System.out.print("["+nombres[f][c]+"]");
//             }
//             System.out.println("");
//         }
//         
         AlgoritmoBatallaNavalImpl ejemplo = new AlgoritmoBatallaNavalImpl();
         Resultado res = ejemplo.encontrarEmbarcacionEnemigaDeBusqueda(oceano, 0, 0, emb);
         
         res.calcularResultado(emb);
    }

}
