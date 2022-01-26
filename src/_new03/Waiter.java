package _new03;

import _new02.Employee;

public class Waiter extends Employee {
    public Waiter(String name, double daySal, int workDays, double grade) {
        super(name, daySal, workDays, grade);
    }

    @Override
    public void printSal() {
        super.printSal();
    }
}
