package Ev1primerbimestre;

import java.util.Scanner;

public class Ejercicio19 {
public static void main(String[] args) throws InterruptedException {
	
	Scanner datos = new Scanner (System.in);
	int contras;
	int intentos = 0;
    
	do {

		System.out.println("Ingresa tu contrasena: ");
		contras = datos.nextInt();

		if (contras != 2008) {
			Thread.sleep(1000);

			intentos++; 

			if (intentos < 3) {
				System.out.println("Volve a intentarlo. ");
			}

		}

	} while (contras != 2008 && intentos < 3);

	if (contras == 2008) {
		System.out.println("Contrasena correcta.");
	}
	if (contras != 2008) {
		System.err.println("Bloqueaste el usuario ");
	}
}
}