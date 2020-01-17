package ejercicio1;

public class test {

	public static void main(String[] args) {
		dado d1 = new dado();
		moneda m1 = new moneda();
		int v1 = d1.lanzar();
			switch(v1) {
			case 1: System.out.println("1"); break;
			case 2: System.out.println("2"); break;
			case 3: System.out.println("3"); break;
			case 4: System.out.println("4"); break;
			case 5: System.out.println("5"); break;
			case 6: System.out.println("6"); break;
			
	}
		int v2 = m1.lanzar();
			if (v2==0) {
				System.out.println("Cara");
			} else 
				System.out.println("Cruz");

	}

}
