package _new03;

import _new03.Employee;

public class Scientist extends Employee {
    public Scientist(String name, double salary) {
        super(name, salary);
    }

    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void printSal() {
        System.out.println("科学家");
        System.out.println("名字 :" + getName() + "工资 = " + (bonus + getSalary() * getWorkDay()));
    }
}
