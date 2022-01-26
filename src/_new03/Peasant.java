package _new03;

import _new03.Employee;

public class Peasant extends Employee {

    public Peasant(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void printSal() {
        System.out.println("农民");
        super.printSal();
    }
}

