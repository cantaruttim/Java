package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.aluno;


public class media_final {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		aluno alu = new aluno();
		
		
		alu.name = sc.nextLine();
		alu.nota_1t = sc.nextDouble();
		alu.nota_2t = sc.nextDouble();
		alu.nota_3t = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", alu.soma());
		
		if (alu.soma() < 60.00) {
			System.out.println("FAILED");
			System.out.printf("MISSING = %.2f POINTS%n", 60.00 - alu.soma());
			
		} else {
			
			System.out.println("PASS");
		}
		
		
		sc.close();
	}

}
