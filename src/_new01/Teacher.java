package _new01;

public class Teacher {
    private String name;
    private int age;
    private double salary;
    private String post;
    private double grade;

    public Teacher(String name, int age, double salary, String post, double grade) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.post = post;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void introduce(){
        System.out.print("信息 ：老师 " + getName() + " 年龄 "  + getAge());
        System.out.print(" 职位 " +getPost() + " 工资 " + getSalary());

    }
}
