package datetime;

import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeEx {
    public static void main(String[] args) {

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);

        String format = currentDateTime.getDayOfMonth()+"/"+ currentDateTime.getMonthValue()+"/"+currentDateTime.getYear();
        System.out.println(format);

        LocalDateTime anotherDateTime = LocalDateTime.of(2023, Month.APRIL,21,5,24,16,0);
        System.out.println(anotherDateTime);
    }
}
