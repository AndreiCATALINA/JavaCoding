package datetime;

import java.time.LocalDate;

public class LocalDateEx {
    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        LocalDate futureDate = LocalDate.of(2023,10,20);
        System.out.println(futureDate);

        String formatDate = currentDate.getDayOfMonth()+"/"+currentDate.getMonth()+"/"+currentDate.getYear();
        System.out.println(formatDate);

    }
}
