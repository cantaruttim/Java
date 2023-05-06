package entities;

public class employee {
	
	public String name;
	public double GrossSalary;
	public double tax;
	
	public double NetSalary() {
		return GrossSalary - tax;
		
	}
	
	public double IncreaseSalary(double percentage) {
		
		return GrossSalary += GrossSalary * percentage / 100;
	}
	
	
	public String toString() {
		return name
				+ ", $ "
				+ String.format("%.2f", NetSalary());
	}
	

}
