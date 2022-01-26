package _new02;

public class Employee {


    //属性
    //员工属性：姓名，单日工资，工作天数
    private String name;
    private double daySal;
    private int workDays;
//    等级
    private  double grade;

    public Employee(String name, double daySal, int workDays, double grade) {
        this.name = name;
        this.daySal = daySal;
        this.workDays = workDays;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDaySal() {
        return daySal;
    }

    public void setDaySal(double daySal) {
        this.daySal = daySal;
    }

    public int getWorkDays() {
        return workDays;
    }

    public void setWorkDays(int workDays) {
        this.workDays = workDays;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
//    方法名priintSal(){}
    public void printSal(){
        System.out.println("员工：" + name );
        System.out.println( name + " 工资 =" + daySal * workDays *grade);
    }
}
