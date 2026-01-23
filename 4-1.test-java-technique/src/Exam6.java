import java.time.LocalDateTime;
//import java.util.Formatter;

public class Exam6 {
    public static void main(String[] args) {
        LocalDateTime birthday = LocalDateTime.of(1543, 02, 10, 05, 12);
        System.out.println("徳川家康の誕生日は" + birthday + "です");
        birthday = birthday.plusYears(1);
        birthday = birthday.plusMonths(2);
        birthday = birthday.plusDays(3);
        birthday = birthday.plusHours(4);
        birthday = birthday.plusMinutes(5);
        System.out.println("1年2ヶ月3日4時間5分後は" + birthday + "です");
    
        //Formatter formatter = new Formatter();
    }
}
