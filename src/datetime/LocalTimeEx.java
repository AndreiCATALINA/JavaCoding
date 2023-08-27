package datetime;

import java.time.LocalTime;

public class LocalTimeEx {

    public static void main(String[] args) {

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        LocalTime finalCourseTime = currentTime.now().withMinute(0).withSecond(0).withHour(16).withNano(0);
        System.out.println(finalCourseTime);
        System.out.println("Peste 5 ore va fi "+ currentTime.plusHours(5).withNano(0));

        String timeFormat = finalCourseTime.getHour()+"-"+finalCourseTime.getMinute()+"-"+finalCourseTime.getSecond();
        System.out.println(timeFormat);
    }

}
