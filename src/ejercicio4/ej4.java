package ejercicio4;

import java.util.Scanner;

public class ej4 {
	private static Scanner teclado;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
Scanner teclado = new Scanner(System.in);
		
		boolean error=false;
		
		float pcateto=0;
		float scateto=0;
		
		do {		
			System.out.print("Introduce el primer cateto triangulo de su triangulo: ");
			String auxTam = teclado.nextLine();
			try {
				pcateto = Integer.parseInt(auxTam);
				error =false;
			} catch (Exception e) {
				error = true;
				System.out.println("No has introducido un número.");
			}
		} while (error==true);
		do {		
			System.out.print("Introduce el primer segundo cateto de su triangulo: ");
			String auxTam = teclado.nextLine();
			try {
				scateto = Integer.parseInt(auxTam);
				error =false;
			} catch (Exception e) {
				error = true;
				System.out.println("No has introducido un número.");
			}
		} while (error==true);
		
	System.out.println(datos(scateto, scateto));


		}
		public static float datos(float pcateto,float scateto){
			
		float i=(pcateto*pcateto+scateto+scateto);
			return  (float) Math.sqrt(i);
				}
	}