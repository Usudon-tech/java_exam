package exam3;

public class SuperCar extends Car{
    @Override
    void run(){
        System.out.println("「ブオーン！" + name + "走ります」");
    }
}
