package _new02;

public class test {
    public static void main(String[] args) {
        manager manage = new manager("刘备", 100, 20, 1.2);
//        设置奖金
        manage.setBonus(3000);
//        打印工资
        manage.printSal();

        Worker worker = new Worker("关羽",50,10,1.0);
        worker.setBonus(0);
        worker.printSal();

    }
}
