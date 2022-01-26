package _new10;


/**
 * @author Kris
 * @version 1.0
 */


enum  Season {

//    public static final Season  SPRING = new Season("春天","温暖");

    SPRING("春天","温暖") ;
    private  String name;
    private String desc;

     private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
