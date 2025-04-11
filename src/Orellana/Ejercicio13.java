package Orellana;

import java.util.Scanner;

public class Ejercicio13 {
public static void main(String[] args) {
	
 Scanner ingreso = new Scanner(System.in);
 
  int hora = 24;
  int minuto = 60;
  int segundos = 60;
  
  System.out.println("Ingresa la hora: ");
  hora = ingreso.nextInt();
  System.out.println("Ingrese los minutos: ");
  minuto = ingreso.nextInt();
  System.out.println("Ingrese los segundos: ");
  segundos = ingreso.nextInt();
  
  if (hora >= 0 && hora <= 24){
	  
	  System.out.println("Valor Correcto");
  }
  
  else if (minuto >= 0 && minuto <= 60){  
  }
  
  else if (segundos >= 0 && segundos <= 60) {
  }
  
  else {
	System.out.println("Valor incorrecto");
  }
}
}
