public class Exam5 {
    static void addition(int num1, int num2){
        System.out.println("足し算の結果:" + (num1 + num2));
    }
    static void subtraction(int num1, int num2){
        System.out.println("引き算の結果:" + (num1 - num2));
    }
    static void multiplication(int num1, int num2){
        System.out.println("掛け算の結果:" + num1 * num2);
    }
    static void division(int num1, int num2){
        System.out.println("割り算の結果:" + num1 / num2);
    }
    static void remainder(int num1, int num2){
        System.out.println("剰除算結果:" + num1 % num2);
    }

    public static void main(String[] args) {
        addition(5, 3);
        subtraction(5, 3);
        multiplication(5, 3);
        division(5, 3);
        remainder(5, 3);
    }
}
