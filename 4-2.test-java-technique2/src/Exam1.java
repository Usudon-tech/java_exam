import java.util.ArrayList;

public class Exam1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("後藤");
        list.add("山田");
        list.add("佐藤");
        list.add("田中");

        for(String e : list){
            System.out.println(e);
        }
    }
}
