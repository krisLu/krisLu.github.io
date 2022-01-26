package _new06.houserent.service;
import _new06.houserent.domain.House;
/**
 * HouseService.java
 * 1.相应HouseView的调用
 * 2.完成对房屋信息的各种操作（增删改查）
 */
public class HouseService {
    private House[] houses;//存放House对象
    private int houseNums = 1;//记录当前有多少个房屋信息
    private int idCounter = 1;//记录当前的id增长到哪个值

    public HouseService(int size){
        //new houses
        houses = new House[size];//当创建HOuseService对象，指定数组大小
        houses[0] = new House(1,"jack","112","海淀区",2000,"未出租");

    }
//    seek方法
    public House findById(int findId){
        //遍历
        for (int i = 0; i < houseNums; i++){
            if(findId == houses[i].getId()){
                return houses[i];
            }
        }
        return null;
    }




//    del方法，删除一个房屋信息（对象）
    public boolean del(int delId){
        //应该先找到要删除的房屋信息对应的下标
        //**下标和房屋的编号不是一回事
        int index = -1;
        for(int i = 0 ; i < houseNums; i++){
            if(delId == houses[i].getId()){//要删除的房屋（id)，是数组下标为i的元素
                index = i;//使用index记录

            }
        }
        if(index == -1){
            //数组中不存在delId
            return false;
        }

//        如果找到了  index = i;删除该单元，其后边的元素依次向前移，最后的元素置空
        for (int i = index; i < houseNums - 1 ; i++){
            houses[i] = houses[i + 1] ;
        }
        houses[--houseNums - 1] = null;//把当前存在的房屋信息的最后一个设置null
        return  true;





    }


//    add方法，添加新对象，返回boolean
    public boolean add(House newHouse){
//        判断是否还可以继续添加（我们暂时不考虑数组扩容的问题）
        if(houseNums >= houses.length){
            System.out.println("数组已满不能再添加了");
            return false;
        }
//把newHouse对象加入到最后
        houses[houseNums++] = newHouse;

//        需要设计一个id自增长的机制
        newHouse.setId(++idCounter);
        return true;

    }
//

//    list方法，返回houses
    public House[] list(){
        return houses;
    }


}
