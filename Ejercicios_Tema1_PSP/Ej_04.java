package Ejercicios_Tema1_PSP;

import java.util.Scanner;

public class Ej_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.print("Introduce un n�mero: ");
		
		Scanner teclado = new Scanner (System.in);
		int num1 = teclado.nextInt();
		
		System.out.print("Introduce otro n�mero: ");
		int num2 = teclado.nextInt();
			
		if(num1 > num2) {
			System.out.println("El primer n�mero es mayor que el segundo");

		} else if (num2 > num1) {
			System.out.println("El segundo n�mero es mayor que el primero");

		} else {
			System.out.println("Ambos n�meros son iguales");

		}
		
			
		teclado.close();
		

	}

}
