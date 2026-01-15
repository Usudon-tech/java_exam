public class Exam3 {
    public static void main(String[] args) {
        int goots1 = 200;
        int goots2 = 250;
        final double TAX = 0.1;
        int sum = goots1 * 3 + goots2 * 4;
        double sum_tax = sum * TAX;
        int answer = sum + (int)sum_tax;
        System.out.println("小計\n" + sum);
        System.out.println("消費税\n" + (int)sum_tax);
        System.out.println("合計金額\n" + answer);

    }
}
