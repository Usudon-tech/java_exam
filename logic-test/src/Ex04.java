public class Ex04 {

    public static void main(String[] args) {
        int year = 2100;

        if(problem1(year)){
            if(problem2(year)){
                if(problem3(year)){
                    System.out.println(year + "年はうるう年です");
                }else{
                    System.out.println(year + "年はうるう年ではありません");
                }
            }else{
                System.out.println(year + "年はうるう年ではありません");
            }
        }else{
            System.out.println(year + "年はうるう年ではありません");
        }
    }

    static boolean problem1(int year){
        if(year % 4 == 0){
            return true;
        }else{
            return false;
        }
    }

    static boolean problem2(int year){
        if(year % 100 == 0){
            return true;
        }
        else{
            return false;
        }
    }

    static boolean problem3(int year){
        if(year % 400 == 0){
            return true;
        }else{
            return false;
        }
    }
}
