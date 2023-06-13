package uade.edu.ar.backtraking.batalla;

import java.util.ArrayList;
import java.util.List;

public class AlgoritmoBatallaNavalImpl implements AlgoritmoBatallaNaval{

	 public Resultado encontrarEmbarcacionEnemigaDeBusqueda(char[][] mapa, int ubicacionX, int ubicacionY, char[] embarcacion) {
	       
		 int n= mapa.length;
		 int m= mapa[0].length;
		 
		 Ubicacion ubicacion = new Ubicacion(ubicacionX,ubicacionY);
		 List<Ubicacion> pos= new ArrayList<Ubicacion>() ;
		 
		 for (int i = ubicacionX ; i<n ; i++) {
			 ubicacion.setX(i);	
			 for (int j = ubicacionY ; j<m ; j++) {
				 ubicacion.setY(j);	 
				 if ( mapa[i][j] == embarcacion[0] )  { 
					
					 if (embarcacion.length <= m-j) {
						
						 if (buscarEmbarcacion(mapa, embarcacion, ubicacion.getX() , ubicacion.getY()+1, "horizontal", 1, pos)){
							pos.add(0, ubicacion); 
							Resultado resultado = new Resultado(pos);
							 return resultado;
						 }
					 }
					 if (embarcacion.length <= n-i) {
						 
						 if (buscarEmbarcacion(mapa, embarcacion,ubicacion.getX() +1, ubicacion.getY() , "vertical", 1, pos)){
							pos.add(0, ubicacion); 
							Resultado resultado = new Resultado(pos);
							 return resultado;
						 }
					 }
					 if (embarcacion.length <= m-j && embarcacion.length <= n-i) {
						
						 if (buscarEmbarcacion(mapa, embarcacion,ubicacion.getX() +1, ubicacion.getY()+1 , "diagonal", 1, pos)){
							pos.add(0, ubicacion); 
							Resultado resultado = new Resultado(pos);
							 return resultado;
					 }
				 }
			 }
			
		 }
			 	 
		 
		 }
		 Resultado resultado = new Resultado(null);
		 return resultado;
	 }
	 
	 
	 private boolean buscarEmbarcacion(char [][] mapa, char[]embarcacion,int ubicacionX, int ubicacionY, String direccion, int etapa, List<Ubicacion> pos) {
		
		 Ubicacion ubicacion = new Ubicacion(ubicacionX,ubicacionY);
		 
			if (etapa == embarcacion.length -1 && mapa[ubicacionX][ubicacionY]== embarcacion[etapa]) {
				pos.add(ubicacion);
				return true;
			}
			else if (mapa[ubicacionX][ubicacionY] != embarcacion[etapa] || ubicacionX<0 || ubicacionX>mapa.length -1  || ubicacionY<0 || ubicacionY>mapa[0].length) { //ubicacionX<0 || ubicacionX>mapa.length  || ubicacionY<0 || ubicacionY>mapa[0].length || 
				
				pos.clear();;
				return false;
			}
			else { 
				if (direccion=="horizontal") {
					pos.add(ubicacion);
					
					return buscarEmbarcacion(mapa, embarcacion,ubicacionX, ubicacionY+1, direccion, etapa+1 , pos);
				}
					
				if (direccion=="vertical") {
				
					pos.add(ubicacion);
					return buscarEmbarcacion(mapa, embarcacion,ubicacionX+1, ubicacionY, direccion, etapa+1 , pos);
				}
				if (direccion=="diagonal") {
					
					pos.add(ubicacion);
					return buscarEmbarcacion(mapa, embarcacion,ubicacionX+1, ubicacionY+1, direccion, etapa+1 , pos);
				}
			}
				
			pos=null;
			return false;
	 }
	 

}
