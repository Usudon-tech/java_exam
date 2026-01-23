package exam3;

public class DeLorean implements Car{
    @Override
    public void run(){
        System.out.println("デロリアンが走る！");
    }
    public void engineStart(){
        run();
    }
}