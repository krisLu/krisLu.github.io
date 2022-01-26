package _new10;

import java.sql.SQLOutput;

/**
 * @author Kris
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Test {
    public static void main(String[] args) {
        Week[] weeks = Week.values();
        for (Week week : weeks) {
            System.out.println(week);

        }
    }}
enum Week{
    MONDAY("星期一"),THUSDAY("星期二"),WEDNESDAY("星期三");
    private String name;

    private Week(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}