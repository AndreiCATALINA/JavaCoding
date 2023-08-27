package datetime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DurationPeriodEx {
    public static void main(String[] args) {

        LocalDateTime pastDateTime = LocalDateTime.of(2013, Month.AUGUST,17,21,13,30,0);
        LocalDateTime currentDateTime = LocalDateTime.now();

        System.out.println(Duration.ofMinutes(300).toHours());
        System.out.println("Durata dintre timpul trecut si timpul prezent este: "+Duration.between(pastDateTime,currentDateTime));
        System.out.println("Perioada dintre trecut si prezent este: "+ Period.between(pastDateTime.toLocalDate(),currentDateTime.toLocalDate()));

        System.out.println(Period.ofMonths(3).withDays(15));


        System.out.println("-----------------------------------");

        String dateTimeFormat = currentDateTime.format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss a"));
        System.out.println(dateTimeFormat);

        String pastDateTimeFormat = pastDateTime.format(DateTimeFormatter.ofPattern("hh:mm:ss a yyyy.MMM.dd"));
        System.out.println(pastDateTimeFormat);

    }
}
