package exercicio.funcionario;

public class Employee {

    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
        return grossSalary - tax;
    }

    public double increaseSalary(double percentage) {
       double calculation = grossSalary * percentage / 100;
       return calculation += netSalary();
    }

    public String toString() {
        return name
                + ","
                + " $ ";
    }
}
