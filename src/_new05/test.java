package _new05;

public class test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("张飞", "男", 30, 5);
        teacher.printInfo();


        Student student = new Student("小明", "男", 15, "00023102");
        student.printInfo();


//        定义多态数组
        Person[] person = new Person[4];
        person[0] = new Student("jack", "男", 10, "0001");
        person[1] = new Student("mary", "女", 20, "0002");
        person[2] = new Teacher("smith", "男", 36, 5);
        person[3] = new Teacher("scott", "男", 26, 1);

        test test = new test();
        test.bubbleSort(person);

        System.out.println("----排序后的数组-----");
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);

        }

    }

    //    向下转型和类型判断
    public void test(Person p) {
        if (p instanceof Student) {
            ((Student) p).study();
        } else if (p instanceof Teacher) {
            ((Teacher) p).teach();
        } else {
            System.out.println("do nothing....");
        }

    }


    public void bubbleSort(Person[] person) {
        Person temp = null;

        for (int i = 0; i < person.length - 1; i++) {
            for (int j = 0; j < person.length - 1 - i; j++) {
                if (person[j].getAge() < person[j + 1].getAge()) {
                    temp = person[j];
                    person[j] = person[j + 1];
                    person[j + 1] = temp;
                }

            }
        }
    }
}
