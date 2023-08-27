package OOP.staticmetods;

public class MyPrinter {

    public static void printNumber(int number){
        System.out.println("Numarul este "+ number);

    };

    public static String formatTime(int seconds){
        int minutes =0;
        int hour=0;

        if(seconds>=60) {
            minutes = seconds / 60;
            seconds = seconds%60;

            if(minutes>=60){
                hour = minutes / 60;
                minutes = minutes%60;

            }

        }
        return String.format("%sH %sMin %sSec",hour,minutes,seconds);
    };
}
