public class Exam4 {
    class Calculation{
        static int addition(int num1, int num2){
            int num = num1 + num2;
            return num;
        }
        static int subtraction(int num1, int num2){
            int num = num1 - num2;
            return num;
        }
        static int multiplication(int num1, int num2){
            int num = num1 * num2;
            return num;
        }
        static int division(int num1, int num2){
            int num = num1 / num2;
            return num;
        }
        static int remainder(int num1, int num2){
            int num = num1 % num2;
            return num;
        }
    }
    public static void main(String[] args) {
        int addition = Calculation.addition(5, 3);
        System.out.println("足し算結果 :" + addition);
        int subtraction = Calculation.subtraction(5, 3);
        System.out.println("引き算結果 :" + subtraction);
        int multiplication = Calculation.multiplication(5, 3);
        System.out.println("掛け算結果 :" + multiplication);
        int division = Calculation.division(5, 3);
        System.out.println("割り算結果 :" + division);
        int remainder = Calculation.remainder(5, 3);
        System.out.println("剰余算結果 :" + remainder);
    }
}
