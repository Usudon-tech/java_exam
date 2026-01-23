package exam3;
/*public interface Car {
    public void run();    
}*/

/*interface Airplane {
    public void fly();
}

interface TimeMachine{
    public void timeTravel();
}*/

/*class DeLorean implements Car{
    @Override
    public void run(){
        System.out.println("デロリアンが走る！");
    }
    public void fly(){
        System.out.println("デロリアンが飛ぶ");
    }
    public void timeTravel(){
        System.out.println("デロリアンがタイムテレポート！");
    }
    public void engineStart(){
        run();
        fly();
        timeTravel();
    }
}*/


public class Exam3 {
    public static void main(String[] args) {
        DeLorean deLorean = new DeLorean();
        deLorean.engineStart();
    }
}
