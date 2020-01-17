package ejercicio1;

public class moneda extends sorteo {
	
	public int lanzar() {
		int valor = (int) Math.floor(Math.random()*1+0);
		return valor;
	}
}
