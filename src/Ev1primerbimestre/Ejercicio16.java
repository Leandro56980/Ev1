package Ev1primerbimestre;

import java.util.Scanner;

public class Ejercicio16 {
public static void main(String[] args) {
	
	Scanner ingreso = new Scanner (System.in); 

	System.out.println("Seleccione el cafe que quiere:");
    
	int numeroIngresado = ingreso.nextInt();
	
	switch(numeroIngresado) {
	
	case 1:
		System.out.println("Eligio cafe Cortado");
	    break;
	case 2:
		System.out.println("Eligio cafe Latte");
		break;
	case 3:
		System.out.println("Eligio cafe solo");
		break;
	case 4:
		System.out.println("Eligio cafe lagrima");
	default:
		  System.out.println("salir del programa");
		  break;
	}

}
}
