package Ejercicios_Tema1_PSP;

import java.util.Scanner;

public class Ej_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.print("Introduce un n�mero: ");
		
		Scanner teclado = new Scanner (System.in);
		int num1 = teclado.nextInt();
		
		System.out.print("Introduce otro n�mero: ");
		int num2 = teclado.nextInt();
		
		int suma = num1 + num2;
		
		System.out.println(" -Operaci�n " + num1 + "+" + num2);
		System.out.print(" -Resultado: " + suma);
	
		teclado.close();

	}

}
