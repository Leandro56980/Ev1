package OrtegaMedrano;

import java.util.Scanner;

public class Ejercicio14 {
	public static void main(String[] args) {

	Scanner ingreso = new Scanner(System.in);
	
	System.out.println("Ingrese su edad:  ");
	int edad = ingreso.nextInt();
	
	System.out.println("Pago la entrada");
	String respuestaPago = ingreso.next();
	boolean pagoEntrada = respuestaPago.equals("si");
	
	if (edad >= 18) {
		if (pagoEntrada) {
			System.out.println("Entrada valida");
		}
		else {
			System.out.println("Entrada rechazada, no puede pasar.");
		}
	}
	else {
		System.out.println("Entrada no permitida");
	}
		
		
}
}