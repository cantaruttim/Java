package Application;
import java.util.Locale;
import java.util.Scanner;

import entities.rectangle;

public class program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		rectangle rec = new rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		// recebendo os valores 
		rec.width = sc.nextDouble();
		rec.heigth = sc.nextDouble();
		
		System.out.println();
		
		System.out.printf("AREA = %.2f%n", rec.area());
		System.out.printf("PERIMETER = %.2f%n", rec.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rec.diagonal());

		sc.close();
	}

}
