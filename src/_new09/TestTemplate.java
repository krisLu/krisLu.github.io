package _new09;

public class TestTemplate {
    public static void main(String[] args) {

        Sub sub = new Sub();
        sub.caleTimes();

    }
}
abstract  class Template{
    public abstract void job();

    public void caleTimes(){
        long start = System.currentTimeMillis();
        job();
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - start));
    }
}

 class Sub extends Template{

    @Override
   public void caleTimes() {
        super.caleTimes();
    }

    @Override
    public void job() {
       long num = 0;
       for(long i  = 1; i <= 800000; i++){
           num += i;

       }
    }
}
