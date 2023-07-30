package Lablesson3;

public class Employee {
    private String name;
    private Double basicSalary,bonus;

    public Employee(String name,double basicSalary,double bonus){
        this.name=name;
        this.basicSalary=basicSalary;
        this.bonus=bonus;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setSalary(Double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public Double getBasicSalary() {
        return basicSalary;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

    public Double getBonus() {
        return bonus;
    }

    public double calculateBonusAmount(){
        return basicSalary+bonus;
    }
}
