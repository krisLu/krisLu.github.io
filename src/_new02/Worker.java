package _new02;

public class Worker extends Employee{
    private double bonus;

    public Worker(String name, double daySal, int workDays, double grade, double bonus) {
        super(name, daySal, workDays, grade);
        this.bonus = bonus;
    }

    public Worker(String name, double daySal, int workDays, double grade) {
        super(name, daySal, workDays, grade);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void printSal() {
        System.out.println("普通员工"+ getName());
        System.out.println("名字：" + getName() + " 工资 = " + (getBonus() +getGrade() * getWorkDays() * getDaySal()));
    }
}
