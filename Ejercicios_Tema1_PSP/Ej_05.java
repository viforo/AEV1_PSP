package Ejercicios_Tema1_PSP;

import java.util.Scanner;

public class Ej_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1;
		int num2;
		do{
			System.out.print("Introdueix un número: ");
			Scanner teclado = new Scanner (System.in);
			
			num1 = teclado.nextInt();
			System.out.print("Introdueix un altre número: ");
			num2 = teclado.nextInt();
			
		} while (num1 != num2);

		System.out.print("El número coincideix, es el " + num1);

	}

}
