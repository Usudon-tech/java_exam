import java.time.LocalDate;

public class Exam5 {
    public static void main(String[] args) {
        
    LocalDate mybirthday = LocalDate.of(2002, 4, 11);
    int year = mybirthday.getYear();
    int month = mybirthday.getMonthValue();
    int day = mybirthday.getDayOfMonth();
    
    System.out.println("私の誕生日は" + year + "年" + month + "月" + day + "日です");

    }
}
