package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.employee;

public class Payment {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		employee employee = new employee();
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		
		System.out.print("Gross Salary: ");
		employee.GrossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		// Mostrando o valor Líquido do salário
		System.out.println("Employee: " + employee);
		
		// Ajustando o salário em 10%
		System.out.print("Which percentage to increase salary?: ");
		double percentage = sc.nextDouble();
		employee.IncreaseSalary(percentage);
		
		
		System.out.println();
		System.out.println("Updated data: " + employee);
		System.out.println();
		
		
		sc.close();
	}

}
