package Listas.exercicio.src.entities;

public class Funcionario {
    
    private Integer id;
    private String name;
    private Double salario;


    public Funcionario(Integer id, String name, Double salario) {
        super();
        this.id = id;
        this.name = name;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }


    // MÉTODO DE AUMENTO DE SALÁRIO
    public void aumentoSalario(double perc) {
        this.salario += (this.salario * (perc / 100));
    }

    @Override
    public String toString() {
        return id + ", " + name + ", " + String.format("%.2f", salario);
    }

}
