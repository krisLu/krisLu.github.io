package _new13;

/**
 * @author Kris
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
//        枚举值的switch使用
        Color green = Color.GREEN;
        green.show();
        switch (green){
            case YELLOW :
                System.out.println("匹配到缓则");
                break;
            case RED:
                System.out.println("匹配到红色");
                break;
            case BLUE:
                System.out.println("匹配到蓝色");
                break;
            case BLACK:
                System.out.println("匹配黑色");
                break;
            case GREEN:
                System.out.println("匹配到lv色");
                break;
        }
    }
}
enum Color implements f1{
    RED(255,0,0),
    BLUE(0,0,255),
    BLACK(0,0,0),
    YELLOW(255,255,0),
    GREEN(0,255,0);
    private int redValue;
    private int greenValue;
    private int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    public int getRedValue() {
        return redValue;
    }

    public int getGreenValue() {
        return greenValue;
    }

    public int getBlueValue() {
        return blueValue;
    }



    @Override
    public void show() {
        System.out.println(  "Color{" +
                "redValue=" + redValue +
                ", greenValue=" + greenValue +
                ", blueValue=" + blueValue +
                '}');
    }
}
interface f1{
    void show();
}