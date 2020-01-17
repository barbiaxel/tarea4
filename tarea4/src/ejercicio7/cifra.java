package ejercicio7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cifra {

	public static void main(String[] args) throws IOException {
		BufferedReader stdin;
		stdin = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Por favor, introduzca un número entero: ");
	    int n = Integer.parseInt(stdin.readLine());
	    System.out.println("La última cifra del número introducido es el " + (n % 10));
	 }
}

