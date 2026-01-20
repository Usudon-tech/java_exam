public class Exam1 {
    static class Car{
        static int speed;
        void run(){
            speed += 50;
            System.out.println("走りました。スピードが" + speed + "km/hになりました。");
            if(speed >= 120){
                System.out.println("スピードの出しすぎです");
            }
        }
    }
    public static void main(String[] args) {
        Car car = new Car();
        car.run();
        car.run();
        car.run();
    }
}
