package _new;

public class test {
    public static void main(String[] args) {
        Person[] p = new Person[3];
        p[0] = new Person("陆柏毅",60,"嗯嗯");
        p[1] = new Person("陆柏2",30,"嗯");
        p[2] = new Person("陆柏3",40,"q嗯");
        for(int i = 0; i < p.length ; i++){
            System.out.println(p[i]);
        }
        Person temp = null;
        for(int i = 0; i < p.length - 1 ; i++ ){
            for(int j = 0; j < p.length  - 1 ; j++){

                if(p[i].getAge() < p[i + 1].getAge()){
                    temp = p[i];
                    p[i ] = p[i + 1];
                    p[i + 1] = temp ;

                }

            }
        }
        for(int i = 0; i < p.length; i++){
            System.out.println(p[i]);
        }

    }
}
