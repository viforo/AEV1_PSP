package Ejercicios_Tema1_PSP;

import java.util.Scanner;

public class Ej_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.print("Introduce un número: ");
		
		Scanner teclado = new Scanner (System.in);
		int num1 = teclado.nextInt();
		
		System.out.print("Introduce otro número: ");
		int num2 = teclado.nextInt();
			
		if(num1 > num2) {
			System.out.println("El primer número es mayor que el segundo");

		} else if (num2 > num1) {
			System.out.println("El segundo número es mayor que el primero");

		} else {
			System.out.println("Ambos números son iguales");

		}
		
			
		teclado.close();
		

	}

}
