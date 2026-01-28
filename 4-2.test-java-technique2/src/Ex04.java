import java.util.HashMap;

public class Ex04 {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();

        map.put("沖縄", "那覇");
        map.put(null, null);

        System.out.println(map.get("沖縄"));
    }
}
