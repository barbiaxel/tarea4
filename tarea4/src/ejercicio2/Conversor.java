package ejercicio2;

public class Conversor {
	
	public int valor;
	Conversor(int parametro){
		valor=parametro;
	}
	
	
	public void getNumero(char x) {
		if (x=='B') {
			System.out.println(Integer.toBinaryString(valor));
		}
		if (x=='H') {
			System.out.println(Integer.toOctalString(valor));
		}
		if (x=='O') {
		System.out.println(Integer.toHexString(valor));
		}
	}

	public static void main(String[] args) {
		Conversor C = new Conversor(15);
		C.getNumero('B');
		C.getNumero('H');
		C.getNumero('O');
		
	}

}
