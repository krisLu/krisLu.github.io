package _new02;

public class manager extends Employee {

//   特有属性
    private double bonus;
//  创建manager对象时；奖金并不确定，在构造器中不给奖金，可以通过set赋值4
    public manager(String name, double daySal, int workDays, double grade) {
        super(name, daySal, workDays, grade);
    }

//    方法：重写print方法
    @Override
    public void printSal() {
//        重写
        System.out.println("经理 " + getName() + " 工资是 =" + (bonus + getDaySal() * getWorkDays() * getGrade()));
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
