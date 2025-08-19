
public class ejercicio1 {
	
	/*public boolean estaEnLaFila(int[] fila, int n) {
		for(int i=0; i<fila.length; i++) {
			if(fila[i]==n) {
				return true;
			}
		}
		return flase;
	}*/
	
	//verifica si hay alguna fila con sus elementos multiplos del numero recibido por parametro
	public boolean todosMultiplosEnAlgunaFila(int[][] mat, int num) {
		if (mat.length==0 || num<0) {
			return false;
		}
		boolean ret1=false;   /*variable para comprobar si hay alguna fila que cumpla la comndicion*/
		boolean ret2=true;   /*variabloe para com´probar que todos los elementops sean multiplos*/
		for(int i=0; i<mat.length;i++) {
			for(int j=0;j<mat[i]; j++) {
				ret2 =ret2 && (mat[i][j]%num == 0);
			}
			ret1 = ret1 || ret2;
		}
		return ret1;
		
	}
	

}
