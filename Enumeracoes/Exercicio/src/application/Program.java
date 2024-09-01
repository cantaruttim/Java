package Enumeracoes.Exercicio.src.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;
import java.util.Date;

import Enumeracoes.Exercicio.src.entities.ContratoPorHora;
import Enumeracoes.Exercicio.src.entities.Departamento;
import Enumeracoes.Exercicio.src.entities.Worker;
import Enumeracoes.Exercicio.src.entities_enums.WorkerLevel;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.print("Entre com o nome do Departamento");
        String nomeDepartamento = sc.nextLine();
        System.out.println("Entre com os dados do trabalhador");
        System.out.println("Nome");
        String nomeTrabalhador = sc.nextLine();
        System.out.println("Level");
        String levelTrabalhador = sc.nextLine();
        System.out.println("Salário base");
        double salarioBaseTrabalhador = sc.nextDouble();

        Worker worker = new Worker(nomeTrabalhador
                                , WorkerLevel.valueOf(levelTrabalhador)
                                , salarioBaseTrabalhador
                                , new Departamento(nomeDepartamento));

        System.out.print("Digite a quantidade de contratos: ");
        int n = sc.nextInt();

        for (int i=0;i<n;i++){
            System.out.println("Contrato #" + i + 1);

            System.out.print("Data (dd/mm/yyyy) = ");
            Date dataContrato = sdf.parse(sc.next());

            System.out.print("Valor por Hora = ");
            double valorDaHora = sc.nextDouble();

            System.out.print("Duração do Contrato (horas) = ");
            int horas = sc.nextInt();

            ContratoPorHora contrato = new ContratoPorHora(dataContrato, valorDaHora, horas);
            worker.addContrato(contrato); // associa o trabalhador ao seu contrato
        }

        System.out.println();
        System.out.println("Entre com o mês e ano para calcular o income (mm/yyyy) = ");
        String mesEano = sc.next();

        int mes = Integer.parseInt(mesEano.substring(0,2));
        int ano = Integer.parseInt(mesEano.substring(3));

        System.out.println("Trabalhador = " + worker.getName());
        System.out.println("Departamento = " + worker.getDepartamento().getNome());
        System.out.println("Receita para " + mesEano + ": " + String.format("%.2f", worker.income(ano, mes)));

        sc.close();
    }
}
