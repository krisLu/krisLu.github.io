package _new03;

import _new03.Employee;

public class Worker extends Employee {
    public Worker(String name, double daySal) {
        super(name, daySal);
    }

    @Override
    public void printSal() {
        System.out.println("工人");
        super.printSal();
    }
}
