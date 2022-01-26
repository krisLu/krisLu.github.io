package _new03;

import _new03.Employee;

public class Teacher extends Employee {
    public Teacher(String name, double salary) {
        super(name, salary);
    }

    private double addSal;
    private int addDay;



    public double getAddSal() {
        return addSal;
    }

    public void setAddSal(double addSal) {
        this.addSal = addSal;
    }

    public int getAddDay() {
        return addDay;
    }

    public void setAddDay(int addDay) {
        this.addDay = addDay;
    }

    @Override
    public void printSal() {
        System.out.println("老师");
        System.out.println("名字：" + getName() + "工资 = " +
                (getAddDay()*getAddSal() +getSalary() * getWorkDay()) );

    }
}
