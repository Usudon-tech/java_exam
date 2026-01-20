public class Exam3 {
    static class student{
        static int energy;
        public student(int energy){
            energy = 50;
        }
        static void sleep(){
            energy += 50;
            if(energy >= 100){
                energy = 100;
            }
            System.out.println("寝ました。エネルギーが" + energy + "になりました");
            if(energy == 100){
                System.out.println("フルパワー！");
            }
        }
        static void study(){
            energy -= 30;
            if(energy <= 0){
                energy = 0;
            }
            System.out.println("勉強しました。エネルギーが" + energy + "になりました。");
            if(energy == 0){
                System.out.println("寝てください");
            }
        }
    }
    public static void main(String[] args) {
        student.study();
        student.study();
        student.sleep();
        student.sleep();
    }
}
