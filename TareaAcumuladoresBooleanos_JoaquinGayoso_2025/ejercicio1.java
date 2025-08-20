
public class ejercicio1 {
	
	public boolean estaEnLaFila(int[] fila, int n) {
		for(int i=0; i<fila.length; i++) {
			if(fila[i]==n) {
				return true;
			}
		}
		return flase;
	}
	
	//verifica si hay alguna fila con sus elementos multiplos del numero recibido por parametro
	public boolean todosMultiplosEnAlgunaFila(int[][] mat, int num) {
		if (mat.length==0 || num<0) {
			return false;
		}
		boolean ret1=false;   /*variable para comprobar si hay alguna fila que cumpla la condicion*/
		boolean ret2=true;   /*variable para comprobar que todos los elementos sean multiplos*/
		for(int i=0; i<mat.length;i++) {
			for(int j=0;j<mat[i]; j++) {
				ret2 =ret2 && (mat[i][j]%num == 0);
			}
			ret1 = ret1 || ret2;
		}
		return ret1;
		
	}
	
	//verifica, fila a fila, que haya interseccion entre las filas de las matrices recibidas como parametro
	public boolean hayInterseccionPorFila(int[][] mat1, int[][]mat2) {
		if(mat1.length==0 || mat2.length==0 || mat1.length!=mat2.length) {
			return false;
		}
		
	}
}
