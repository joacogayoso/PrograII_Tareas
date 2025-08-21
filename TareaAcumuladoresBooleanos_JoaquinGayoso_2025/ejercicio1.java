package acumuladores;

public class Acumuladores {

	public boolean estaEnLaFila(int[] fila, int n) {
		for(int i=0; i<fila.length; i++) {
			if(fila[i]==n) {
				return true;
			}
		}
		return flase;
	}
	
	//devuelve true si algun elemento del array esta en otro array
	public boolean interseccion(int[] arr1, int[] arr2) {
		boolean ret = false;
		for(int i=0; i<arr1.length;i++) {
			for(int j=0;j<arr2[i]; j++) {
				ret = ret || (arr[i]==arr[j]);
			}
		}
		return ret;
	}
	
	//suma los elemtnos de una fila y compara si son mayores que la suma de los elementos de una columna
	public boolean sumaElementos(int[] fila, int[] columna) {    
		int sumaFila = 0;
		int sumaColumna = 0;
		for(int i=0; i<fila.length; i++) {
			sumaFila = sumaFila + fila[i];
		}
		for(int j=0; j<columna.length; j++) {
			sumaColumna = sumaColumna + columna[i];
	    }
		return (sumaFila > sumaColumna);
	}
	
	//Ej1: verifica si hay alguna fila con sus elementos multiplos del numero recibido por parametro
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
	
	//Ej2: verifica, fila a fila, que haya interseccion entre las filas de las matrices recibidas como parametro
	public boolean hayInterseccionPorFila(int[][] mat1, int[][]mat2) {
		if(mat1.length==0 || mat2.length==0 || mat1.length!=mat2.length) {
			return false;
		}
		boolean inter = true;  /*se cumple para todas sus filas*/
		for(int i=0; i<mat1.length; i++) {
			inter = inter && (interseccion(mat1[i],mat2[i]));
		}
		return inter;
	}
	
	//Ej3: devuelve true si los elementos de alguna fila de una matriz suman mas que los elementos de una columna pasada por parametro
	public boolean algunaFilaMasQueLaColumna(int[][] mat, int nColum) {
		boolean mayores = false;
		for (int i=0; i<mat.length; i++) {
			mayores = mayores || sumaElementos(mat[i], mat[0][nColum]);
		}
		return mayores;
	}
}
