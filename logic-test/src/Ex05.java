import java.util.ArrayList;
import java.util.List;

public class Ex05 {
    public static void main(String[] args) {
        
        String[] num = { "soccer", "baseball", "jogging", "jogging", "soccer", "surfing", "surfing", "soccer", "surfing", "baseball", "boxing", "surfing", "soccer", "surfing", "jogging", "boxing", "jogging", "baseball", "soccer", "soccer" };

        int lenght = num.length;

        List<String> list = new ArrayList<>();

        int count = 0;

        List<Integer> int_count = new ArrayList<>();

        for(int i = 0; i < lenght; i++){ //スポーツの取り出し
            if(list.contains(num[i])){

            }else{
                list.add(num[i]);
                count++;
            }
        }

        for(int i = 0; i < count; i++){ //各スポーツ名のカウント
            int k = 0;
            for(int j = 0; j < lenght; j++)
                if(list.get(i).equals(num[j])){
                    k++;
                }
            int_count.add(k);
        }

        int max = 0;
        int max_count = 0;

        for(int i = 0; i < count; i++){
            if(max < int_count.get(i)){
                max = int_count.get(i);
                max_count = i;
            }
        }

        System.out.println("最も出現回数の多いスポーツは" + list.get(max_count) + "で、出現回数は" + max + "回です");
    }
}
