package ejercicio6;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		int num1, num2;
		int resultado = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Teclea el primer numero");
		String ln = teclado.nextLine();
        num1=Integer.parseInt(ln);
		
		System.out.println("Teclea el segundo numero");
		String ln1 = teclado.nextLine();
        num2=Integer.parseInt(ln1);
		
		//suma
		resultado = num1+num2;
		System.out.println("La suma de " +num1+ "+" +num2+ " es: " +resultado);
		
		//multiplicación
		resultado = num1*num2;
		System.out.println("La multiplición de " +num1+ "*" +num2+ " es: " +resultado);
		
		//modulo
		try {
			System.out.println("El resto es: " +num1%num2);
		}
		catch (ArithmeticException e) {
			System.out.println("No se puede dividir por 0");
		}
		//división
		try {
			System.out.println("La división de " +num1+ "/" + num2+ " es: " +num1/num2);
		}
		catch (ArithmeticException e) {
			System.out.println("No se puede dividir por 0");
		}
		teclado.close();
			
	}

}
