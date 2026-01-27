import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Ex04 {
    public static void main(String[] args) {
        Map m = Collections.synchronizedMap(new HashMap("key", "value"));
        
    }
}
