package _new06.houserent.view;


import _new06.houserent.domain.House;
import _new06.houserent.service.HouseService;
import _new06.houserent.utils.Utility;

/**
 * 1.显示界面
 * 2.接受用户输入
 * 3.调用HouseSService完成对房屋信息的各种操作
 *
 */
public class HouseView {

    private HouseService houseService = new HouseService(2);


    //修改房屋信息
    public void update(){
        System.out.println("======修改房屋信息========");
        System.out.println("请选择待修改的房间编号（-1表示退出）");
        int updateId = Utility.readInt();
        if(updateId == -1){
            System.out.println("=======你放弃修改房屋信息========");
            return;
        }


        //根据输入得到的updateId，查找对象
        House house = houseService.findById(updateId);
        if(house == null){
            System.out.println("=====房间信息不存在====");
            return;
        }
        System.out.println("姓名(" + house.getName() + ")");
        String name  = Utility.readString(8,"");//用户不修改该信息，则重置为空串
        if(!"".equals(name)){
            house.setName(name);
        }

        System.out.println("电话(" + house.getPhone() + ")");
        String  phone = Utility.readString(8);
        if(!"".equals(phone)){
            house.setPhone(phone);
        }

        System.out.println("地址(" + house.getAddress() + ")");
        String  address = Utility.readString(18);
        if(!"".equals(address)){
            house.setAddress(address);
        }
        System.out.println("租金(" + house.getRent() + ")");
        int  rent = Utility.readInt(-1);
        if(rent != -1){
            house.setRent(rent);
        }

        System.out.println("状态(" + house.getState() + ")");
        String  state = Utility.readString(3, "");
        if(!"".equals(state)){
            house.setState(state);
        }

        System.out.println("=====修改房屋信息成功======");



    }





//    查找方法
    public void findHouse(){
        System.out.println("==========查找房屋信息=========");
        System.out.println("请输入你要查找的id：");
        int findId = Utility.readInt();
//        调用方法
        House house = houseService.findById(findId);
        if(house != null){
            System.out.println(house);
        }else{
            System.out.println("==========id不存在===========");
        }



    }








//    编写退出方法
    public void exit(){
        char c = Utility.readConfirmSelection();
        if(c == 'Y'){
            loop = false;
        }


    }


//    编写delHouse()接受输入的id，调用Service的del方法
    public void deHouse(){
        System.out.println("=========删除房屋信息===========");
        System.out.print("请输入待删除的房屋编号(-1 退出)：");
        int delId = Utility.readInt();
        if(delId == -1){
            System.out.println("=========放弃删除房屋信息========");
            return;
        }
        char choise =  Utility.readConfirmSelection();
        if(choise == 'Y'){//确认删除
            if(houseService.del(delId)){
                System.out.println("============删除成功============");

            }else{
                System.out.println("==============房屋编号不存在删除失败===========");
            }

        }else{
            System.out.println("===============放弃删除房屋信息===========");
        }

    }

//    编写add House(),接受输入，创建House对象增加add方法
    public void addHouse(){
        System.out.println("=========增加房屋===========");
        System.out.print("姓名：");
        String name = Utility.readString(8);
        System.out.print("电话：");
        String phone = Utility.readString(12);
        System.out.print("地址：");
        String address = Utility.readString(16);
        System.out.print("月租：");
        int rent = Utility.readInt();
        System.out.print("当前状态：");
        String state = Utility.readString(3);
//        创建一个新的House对象,注意id是系统分配的
        House newHouse = new House(0, name, phone, address, rent, state);
        if(houseService.add(newHouse)){
            System.out.println("=======添加房屋成功==========");

        }else{
            System.out.println("==========增加房屋失败====== ");

        }
    }


//编写listHouse()显示房屋列表
    public void listHouses(){
        System.out.println("================房屋列表================");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(为出租/已出租)");
        House[] houses = houseService.list();//得到所有房屋信息
        for(int i = 0; i < houses.length; i++){
            if(houses[i]  != null){
                System.out.println(houses[i]);
            }

        }
        System.out.println("\n=============房屋列表显示完毕=============");

    }

    private  boolean loop = true;//控制显示菜单
    private char key =  ' ';//接受用户选择哪个菜单
//    显示主菜单
    public void  mainMenu(){


        do {
            System.out.println("=========房屋出租系统菜单==========");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 源");
            System.out.println("\t\t\t3 删 除 房 屋 信 息");
            System.out.println("\t\t\t4 修 改 房 屋  信 息");
            System.out.println("\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t6 退 出");
            System.out.println("请输入你的选择 ：1--6");
            key = Utility.readChar();
            switch (key){
                case '1':
                    addHouse();
                    break;
                case '2':
                    findHouse();
                    break;
                case '3':
                    deHouse();
                    break;
                case '4':
                    update();
                    break;
                case '5':
                   listHouses();
                    break;
                case '6':
                    exit();
                    break;


            }

        }while(loop);
    }
}
