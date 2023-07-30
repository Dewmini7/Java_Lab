package Lablesson5;

public class MyFirstInterface {
    int x=0; // This is equivalent to public static final int x = 0;

    void display() {

    }
}

class InterfaceImplemented extends MyFirstInterface {
    @Override
    public void display() {
        // This will not compile because x is final
        // x = 10;
        System.out.println("The value of x is: " + x);
    }
}


