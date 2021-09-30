package Ejercicios_Tema1_PSP;

import java.util.Scanner;

public class Ej_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Introduce un nombre: ");
		
		Scanner teclado = new Scanner (System.in);
		String nombre = teclado.nextLine();
		
		System.out.print("Hola " + nombre);
	
		teclado.close();
		
	}

}
