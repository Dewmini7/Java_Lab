package Lablesson4;

public class TestEmployee {
    public static void main(String[] args) {
        Employee bogdan=new Employee();
        Employee bird=new Employee();

        bogdan.setEmpID(101);
        bogdan.setEmpName("Mr.Bogdan");
        bogdan.setEmpDesignation("Software Engineer ");

        bird.setEmpID(102);
        bird.setEmpName("Mr.Bird");
        bird.setEmpDesignation("Software Engineer");


        System.out.println("ID"+bogdan.getEmpID());
        System.out.println("Name"+bogdan.getEmpName());
        System.out.println("Designation"+bogdan.getEmpDesignation());


        System.out.println("ID"+bird.getEmpID());
        System.out.println("Name"+bird.getEmpName());
        System.out.println("Designation"+bird.getEmpDesignation());




    }


}
