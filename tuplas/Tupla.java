package tuplas;
import java.util.List;

public class Tupla<T1, T2> {
	
	public T1 x;
	public T2 y;
		
	//constructor
	public Tupla(T1 x, T2 y) {
		this.x = x;
		this.y = y;
	}
	
	T1 obtenerx() {
		return x;
	}
	
	T2 obtener() {
		return y;
	}
	
	void establecerX(T1 x) {
		 this.x = x;
	}

	void establecerY(T2 y) {
		this.y = y;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
