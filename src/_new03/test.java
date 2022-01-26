package _new03;

import _new03.Worker;

public class test {
    public static void main(String[] args) {
        Worker jack = new Worker("jack", 1000);
        jack.printSal();

        Peasant smith = new Peasant("smith", 20000);
        smith.printSal();


        Teacher teacher = new Teacher("顺平 ", 2000);
        teacher.setAddDay(360);
        teacher.setAddSal(1000);
        teacher.printSal();

        Scientist scientist = new Scientist("终南山", 20000);
        scientist.setBonus(2000000);
        scientist.printSal();

    }
}
