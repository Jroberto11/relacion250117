package ejercicio1;

import java.util.Scanner;

public class ej1 {

	private static Scanner teclado;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
System.out.println(datos());


	}
	public static float datos(){
		boolean error=false;
		teclado = new Scanner(System.in);
		float gradoscent=0;
		do {		
			System.out.print("Introduce los grados centigrados: ");
			String auxTam = teclado.nextLine();
			try {
				gradoscent = Integer.parseInt(auxTam);
				error =false;
			} catch (Exception e) {
				error = true;
				System.out.println("No has introducido un n�mero.");
			}
		} while (error==true);
		return 32+(9*gradoscent/5);
			}
}
