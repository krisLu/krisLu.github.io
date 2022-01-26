package _new08;

public class Test {
    public static void main(String[] args) {
        Manager jack = new Manager("jack", "999", 500000);
        jack.setBonus(8000);
        jack.work();
        CommonEmployee tom = new CommonEmployee("tom", "s", 70707070);
        tom.work();

    }

}

abstract class Employee{
    private String name;
    private String id;
    private double salary;

    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void work();
}
class Manager extends Employee{
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, String id, double salary) {
        super(name, id, salary);

    }

    @Override
    public void work() {
        System.out.println("经理" + getName() + "工作中");

    }
}

class CommonEmployee extends Employee{
    public CommonEmployee(String name, String id, double salary) {
        super(name, id, salary);
    }


    @Override
    public void work() {
        System.out.println("普通员工" + getName() + "工作中");
    }
}