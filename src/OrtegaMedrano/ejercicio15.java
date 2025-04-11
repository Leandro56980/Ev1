package OrtegaMedrano;

import java.util.Scanner;

public class ejercicio15 {
public static void main(String[] args) {
	
	
   Scanner ingreso = new Scanner (System.in);
	
	System.out.println("Ingrese en minuscula S,M,L:");
	char Talla = ingreso.next().charAt(0);

	  switch (Talla) {
	  case 's':	
	  case 'S':	
		  System.out.println("tengo 5");
	  break;
	  case 'm':	
	  case 'M':
		  System.out.println("tengo 2");
	  break;
	  case 'l':	
	  case 'L':
		  System.out.println("no tengo");
	  break;
	  default:
		  System.out.println("error");
		  break;
	  }

}
}