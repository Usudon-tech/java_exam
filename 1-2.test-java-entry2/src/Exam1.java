public class Exam1 {
    public static void main(String[] args) {
        int totalScare = 100;
        if(totalScare >= 0 && totalScare < 80){
            System.out.println("追試です");
        }
        else if(totalScare >= 80 && totalScare < 100){
            System.out.println("合格です");
        }
        else if(totalScare == 100){
            System.out.println("満点です");
        }
        else{
            System.out.println("存在しない点数です");
        }
    }
}
