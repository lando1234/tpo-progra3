package uade.edu.ar.backtraking.batalla;



public class AlgoritmoBatallaNavalImpl implements AlgoritmoBatallaNaval{

	 public Resultado encontrarEmbarcacionEnemigaDeBusqueda(char[][] mapa, int ubicacionX, int ubicacionY, char[] embarcacion) {
	       
		 int n= mapa.length;
		 int m= mapa[0].length;
		 Resultado resultado = new Resultado(null);
		 
		 for (int i = ubicacionX ; i<=n ; i++) {
			 for (int j = ubicacionY ; j<=m ; j++) {
				 
				 Object c= mapa[i][j];
				 if ( mapa[i][j]== embarcacion[0] && c instanceof Character)  {
					 if (embarcacion.length <= n-1) {
						 if (AlgoritmoBuscarEmbarcacion.buscarEmbarcacion(mapa, embarcacion,ubicacionX, ubicacionY +1, "horizontal", 1, resultado)){
							 return resultado;
						 }
					 }
					 if (embarcacion.length <= m-j) {
						 if (AlgoritmoBuscarEmbarcacion.buscarEmbarcacion(mapa, embarcacion,ubicacionX +1, ubicacionY , "vertical", 1, resultado)){
							 return resultado;
						 }
					 }
					 if (embarcacion.length <= n-1 && embarcacion.length <= m-j) {
						 if (AlgoritmoBuscarEmbarcacion.buscarEmbarcacion(mapa, embarcacion,ubicacionX +1, ubicacionY+1 , "diagonal", 1, resultado)){
							 return resultado;
					 }
				 }
			 }
		 }
	 
		 
		 }
		 return resultado;
	 }

}
