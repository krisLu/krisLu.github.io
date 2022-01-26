package _new03;

public class Employee {
    private String name;
    private double   salary;
    private int workDay = 12;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkDay() {
        return workDay;
    }

    public void setWorkDay(int workDay) {
        this.workDay = workDay;
    }
//    打印全年工资
    public void printSal(){
        System.out.println("名字 ：" + getName() + " 工资 = " + getWorkDay() * getSalary() );
    }
}
