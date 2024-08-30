package Listas.exercicio.src.application;
import Listas.exercicio.src.entities.Funcionario;

import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class execLista {
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionario> list = new ArrayList<>();

        System.out.println("How many employees will be registered?: ");
        int N = sc.nextInt();

        for (int i=0; i<N; i++) {
            System.out.println("Funcionário #" + (i + 1) + ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();

            // validacao do ID
            while (hasId(list, i)) {
                System.out.println("Id já existe!! Tente novamente !!");
                id = sc.nextInt();
            }

            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            


            System.out.print("Salário: ");
            Double salario = sc.nextDouble();

            Funcionario func = new Funcionario(id, nome, salario);

            list.add(func);

        }

        System.out.println();
        System.out.println("Qual funcionário terá o salário ajustado?");
        int idProcurado = sc.nextInt();
        
        Funcionario func = list.stream().filter(x -> x.getId() == idProcurado).findFirst().orElse(null);
        //Integer pos = idPosition(list, idProcurado);
        
        if (func == null) {
            System.out.println("ID não encontrado!");
        } 
        else {
            System.out.println("Entre com a porcentagem");
            double percent = sc.nextDouble();
            //list.get(pos).aumentoSalario(percent);
            func.aumentoSalario(percent);
        }

        System.out.println();
        System.out.println("Lista de Funcionários");

        for (Funcionario f : list) {
            System.out.println(f);
        }

        sc.close();
        
    }

    public static int idPosition(List<Funcionario> list, int id) {

        for (int i=0; i < list.size(); i++ ) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    } 

    public static boolean hasId(List<Funcionario> list, int id) {
        Funcionario func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return func != null;
    }



}