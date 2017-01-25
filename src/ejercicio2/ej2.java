package ejercicio2;

import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		boolean error=false;
		
		float radio=0;
		
		do {		
			System.out.print("Introduce lel radio de tu circunferencia: ");
			String auxTam = teclado.nextLine();
			try {
				radio = Integer.parseInt(auxTam);
				error =false;
			} catch (Exception e) {
				error = true;
				System.out.println("No has introducido un número.");
			}
		} while (error==true);
		
System.out.println("longitud: "+ longitud(radio));
System.out.println("Area: "+ area(radio));

	}
	public static float longitud(float radio){
				
		float longitud=(float) (2*3.14*radio);
		return longitud;
	}
	public static float area(float radio){
		
		float area=(float) (3.14*(radio*radio));
		return area;
	}
}
