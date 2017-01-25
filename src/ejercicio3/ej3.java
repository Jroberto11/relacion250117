package ejercicio3;

import java.util.Scanner;

public class ej3 {
	private static Scanner teclado;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(datos()+"m/s");


	}
	public static float datos(){
		boolean error=false;
		teclado = new Scanner(System.in);
		float kmh=0;
		do {		
			System.out.print("Introduce el numero de kilometros por hora: ");
			String auxTam = teclado.nextLine();
			try {
				kmh = Integer.parseInt(auxTam);
				error =false;
			} catch (Exception e) {
				error = true;
				System.out.println("No has introducido un número.");
			}
		} while (error==true);
		return (float) (kmh*0.277778);
			}
}


