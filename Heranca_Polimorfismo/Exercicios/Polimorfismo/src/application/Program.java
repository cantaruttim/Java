package Heranca_Polimorfismo.Exercicios.Polimorfismo.src.application;
import java.util.Locale;
import java.util.Scanner;

import java.util.List;
import java.util.ArrayList;

import Heranca_Polimorfismo.Exercicios.Polimorfismo.src.entities.Employee;
import Heranca_Polimorfismo.Exercicios.Polimorfismo.src.entities.OutsourceEmployee;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        for (int i =1; i<n; i++){
            System.out.println("Employee #" + i + "data: ");
            System.out.print("Outsourced (y/n) ?: ");
            char c = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Hours: ");
            int hours = sc.nextInt();

            System.out.print("Value Per Hour: ");
            Double valuePerHour = sc.nextDouble();

            if (c == 'y') {
                System.out.print("Additional Charge: ");
                double additionalCharge = sc.nextDouble();

                list.add(new OutsourceEmployee(name, hours, valuePerHour, additionalCharge));
            } else {
                list.add(new Employee(name, hours, valuePerHour));
            }
        }

        System.out.println();
        System.out.println("PAYMENTS");

        for (Employee emp : list) {
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }

        sc.close();
    }
}
