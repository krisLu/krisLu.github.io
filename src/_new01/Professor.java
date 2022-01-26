package _new01;

 public class Professor extends  Teacher{

     public Professor(String name, int age, double salary, String post, double grade) {
         super(name, age, salary, post, grade);
     }

     @Override
     public void introduce() {
         System.out.println("这是教授的信息");
         super.introduce();
     }
 }
