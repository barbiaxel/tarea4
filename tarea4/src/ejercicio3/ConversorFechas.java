package ejercicio3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ConversorFechas {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una fecha en formato DD/MM/YYYY o MM/DD/YYYY para convertirla:");
		String fecha = teclado.next();
		
		DateTimeFormatter ldt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaD = LocalDate.parse(fecha, ldt);
		
		System.out.println("Formato normal "+normaltoAmericano(fechaD));
		System.out.println("Formato americano "+americanotoNormal(fechaD));
		teclado.close();
	}
	
	public static String normaltoAmericano(LocalDate fechaD) {
		String resultado = DateTimeFormatter.ofPattern("dd/MM/yyyy").format(fechaD);
		return resultado;
	}
	
	public static String americanotoNormal(LocalDate fechaD) {
		String resultado = DateTimeFormatter.ofPattern("MM/dd/yyyy").format(fechaD);
		return resultado;
	}
	
}