package Enumeracoes.Exercicio.src.entities;

import Enumeracoes.Exercicio.src.entities_enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Departamento departamento;

    // quando tivermos uma composicao 1:*, não incluimos ele no construtor.
    private List<ContratoPorHora> contratos = new ArrayList<>();

    public Worker(){}

    public Worker(String name, WorkerLevel level, Double baseSalary, Departamento departamento){
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departamento = departamento;
    }

    public String getName() {return name;}
    public WorkerLevel getWorkerLevel() {return level;}
    public Double getBaseSalary() {return baseSalary;}
    public Departamento getDepartamento() {return departamento;}
    public List<ContratoPorHora> getContratos() {return contratos;}

    public void setName(String name) {this.name = name;}
    public void setWorkerLevel(WorkerLevel level) {this.level = level;}
    public void setBaseSalary(Double baseSalary) {this.baseSalary = baseSalary;}
    public void setDepartamento(Departamento departamento) {this.departamento = departamento;}

    // associação dos trabalhadores de uma lista
    public void addContrato(ContratoPorHora contrato) {
        contratos.add(contrato);
    }

    public void removeContrato(ContratoPorHora contrato) {
        contratos.remove(contrato);
    }

    public double income(int year, int month){
        double soma = baseSalary;
        Calendar cal = Calendar.getInstance();

        for (ContratoPorHora c : contratos) {
            cal.setTime(c.getData());
            int c_year  =  cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);
    
            if (year == c_year && month == c_month) {
                soma += c.totalValue();
            }
        }
        return soma;
    }


}
