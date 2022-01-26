package _new07;

public class state_ {
    public static void main(String[] args) {
        Child child1 = new Child("lubaiyi");
        child1.join();
        child1.count++;

        Child child2 = new Child("l2");
        child2.join();
        child2.count++;

        Child child3 = new Child("l3");
        child3.join();
        child3.count++;



        System.out.println("共有"+ Child.count + "个小孩加入游戏");




    }
}


class Child{
    private String name;

//    定义了一个静态变量 count 计数器。
//    该变量最大的特点就是会被Child 类的所有对象共享
    public static int count = 0;

    public Child(String name) {
        this.name = name;
    }

    public void join(){
        System.out.println(name + " 加入了游戏 ");
    }
}
