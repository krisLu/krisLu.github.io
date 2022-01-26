package _new12;

/**
 * @author Kris
 * @version 1.0
 */
class Test{
    public static void main(String[] args) {

        Car car = new Car(60);
        car.f1().flow();

    }
}
public class Car {
    private double temperature;

    public Car(double temperature) {
        this.temperature = temperature;
    }

    class Air{

        public void flow(){
            if( Car.this.temperature <=0) {
                System.out.println("打开暖气");
                System.out.println("车内的温度： " + Car.this.temperature);
            } else if (Car.this.temperature > 40) {
                System.out.println("打开冷气");
                System.out.println("车内的温度： " + Car.this.temperature);
            }else {
                System.out.println("关闭暖气");
                System.out.println("车内的温度： " + Car.this.temperature);
            }

        }
        }

    public Air f1(){
        return new Air();

    }
}
