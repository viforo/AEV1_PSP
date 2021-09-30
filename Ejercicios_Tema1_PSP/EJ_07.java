package Ejercicios_Tema1_PSP;

import java.util.Scanner;

public class EJ_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		int contador = 0;
		int suma = 0;
		
		for(int i=0; i<5; i++) {
			System.out.print("Introdueix un número: ");
			Scanner teclado = new Scanner (System.in);
			num = teclado.nextInt();
			suma += num;
			contador ++; 
		}
		
		System.out.print("La suma dels 5 números es  " + suma);


	}

}
