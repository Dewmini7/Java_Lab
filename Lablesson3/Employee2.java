package Lablesson3;

public class Employee2 {
    private String name;
    private int age;
    private Double salary;

    // Modified code for replace the setter using a constructor
    public Employee2(String name,int age,double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

}

