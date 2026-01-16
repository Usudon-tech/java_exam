public class Exam6 {
    public static void main(String[] args) {
        for(int i = 1; i <= 9; i++){
            for(int count = 1; count <= 9; count++){
                int sum = i * count;
                if(sum < 10){
                    System.out.print("  " + i * count);
                }
                else{
                    System.out.print(" " + i * count);
                }
            }
            System.out.println();
        }
    }
}
