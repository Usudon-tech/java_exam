package exam3;

class EcoCar extends Car{
    @Override
    void run(){
        System.out.println("「シーン！" + name + "が走ります」");
    }
}
