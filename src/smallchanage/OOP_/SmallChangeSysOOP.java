package smallchanage.OOP_;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 该类是完成零钱通的各个功能
 * 使用OOP
 * 将各个功能对应一个方法
 */
public class SmallChangeSysOOP {
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String key  = "";

    //    2.完成零钱通明细
    //        思路：(1)可以把收益入账和消费保存到数组（2）可以使用对象（3）简单可以shiyong String
    String details = "--------零钱通明细----------";

    //    3.完成收益入账，完成功能驱动程序员增加新的变化和代码
    double money = 0;
    double balance = 0;
    Date date = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy--MM--dd HH:mm");//更改日期格式
    String note = "";


    public void mainMenu() {
        do{
            System.out.println("\n==============零钱通菜单===========");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退出");
            System.out.println("请选择（1-4）");
            key = scanner.next();

            //            使用switch 分支控制
            switch (key){
                case "1" :
                    this.detail();
                    break;
                case "2" :
                    this.income();
                    break;

                case "3" :
                   this.pay();
                    break;
                case "4" :
                 this.exit();
                 break;
                default :
                    System.out.println("选择有误，请选择退出");

            }

        }while(loop);
    }
    public void detail(){
        System.out.println(details);


    }
    public void income(){
        System.out.println("收益入账金额");
        money = scanner.nextDouble();
        //                    money 的值范围应该校验--> 一会在完善
//                         找不到正确的金额条件
        if(money <= 0){
            System.out.println("收益入账金额需要大于0");
            return;
        }

        balance += money;

        date = new Date();
        details  += "\n收益入账\t" + money + "\t" + sdf.format(date) + "\t" + balance;


    }
    public void pay (){
        System.out.println("消费金额");
        money = scanner.nextDouble();
        //                    money的值范围需要校验-->一会完善
        if(money <= 0 || money > balance){
            System.out.println("你的消费金额应该在0 -" + balance);
        return ;
        }

        System.out.println("消费说明：");
        note = scanner.next();
        balance  -= money;
        //                    拼接信息到details
        date = new Date();//获取当前日期
        details +=  "\n" + note + "\t"+ money + "\t" +  sdf.format(date) + "\t" + balance;





    }
    public void exit(){
        System.out.println("4 退出");
//                        用户输入4时，我们再次确认一下。必须输入y/s其他则是错误
//                        1.定义一个变量choice，接受用户输入
//                1
//                2.使用while + break,来处理接收到输入时y 或者n

        String choice = "";
        while(true){
            System.out.println("你要退出吗?  y / s");
            choice = scanner.next();
            if("y".equals(choice) ||"n".equals(choice)){
                break;
            }
        }
//                        当用户退出while，进行判断
        if(choice.equals("y") ){
            loop = false;
        }else if("n".equals(choice)){
            return;
        }


    }
    }
