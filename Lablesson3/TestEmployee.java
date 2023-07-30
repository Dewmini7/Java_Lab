package Lablesson3;

public class TestEmployee {
    public static void main(String[] args) {
        Employee e1=new Employee("Bogdan",50000.0,10000.0);
        System.out.println("Employee name "+ e1.getName());
        System.out.println("Basic Salary "+ e1.getBasicSalary());
        System.out.println("bonus "+e1.getBonus());

        double bonusAmount= e1.calculateBonusAmount();
        System.out.println("bonus amount "+bonusAmount);
    }

}
