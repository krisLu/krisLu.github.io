package _new11;

import java.awt.event.HierarchyBoundsAdapter;

/**
 * @author Kris
 * @version 1.0
 */
public interface Vehicles {
    void work();

}
class Horse implements Vehicles{
    @Override
    public void work() {
        System.out.println("使用马");
    }
}
class Boat implements  Vehicles{
    @Override
    public void work() {
        System.out.println("使用船");
    }
}
class Air implements Vehicles{
    @Override
    public void work() {
        System.out.println("使用飞机");
    }
}
class  VehiclesFactory{
    private  static Horse house  = new Horse();
    private VehiclesFactory(){

    }


    public static  Horse  getHorse(){
        return house;
    }
    public static Boat getBoat(){
       return new Boat();
    }
    public static Air getAir(){
        return new Air();
    }
}
class Person{
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }
//    判断传入的参数是否已经存在
    public void passRiver(){
        if(!(vehicles instanceof  Boat)){
         vehicles = VehiclesFactory.getBoat();
        }vehicles.work();
    }
    public void  common() {
        if (!(vehicles instanceof Horse)) {
            vehicles = VehiclesFactory.getHorse();
        }
        vehicles.work();
    }
    public void passH(){
        if(!(vehicles instanceof Air)){
            vehicles = VehiclesFactory.getAir();
        }
        vehicles.work();
    }

}
class Test{
    public static void main(String[] args) {
        Person person = new Person("唐僧",new Horse());
        person.common();
        person.passRiver();
        person.passH();


    }
}