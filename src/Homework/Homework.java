package Homework;

public class Homework {
    public static void main(String[] args) {
       int bankBalance= 500;
       bankBalance+=250;
       bankBalance-=100;

       System.out.println(bankBalance);

       //birthday
       int day =21;
       String month ="April";

       //page 6
        String firstName = "Andrei";
        String lastName ="Catalina";
        String fullName = firstName + " " + lastName;
        System.out.println("Hello, my name is " + fullName + ".");
        System.out.println("There are "+ (fullName.length()-1) + " letters in my name.");

        //page 7

        double fahrenheit = 47.6;

        double celsius= (fahrenheit-32)*5/9 ;

        System.out.println(celsius);

        // player

//        if (canSeePlayer) {
//            if (!playerPoweredUp) {
//                System.out.println("Attack!");
//            } else {
//                System.out.println("Run away!");
//            }
//        } else {
//            System.out.println("Wander.");
//        }


        //

        boolean isSnowing = false;
        boolean isRaining = true;
        double temperature = 60.0;

        if(isRaining == true || isSnowing==true || temperature<=50.0){
            System.out.println("Let’s stay home.");
        }else{
            System.out.println("Let’s go out!");
        }

        //

        double time = 20;
        String timeOfDay;

        if(time<12 && time>=5){
            timeOfDay = "morning";
        }else if(time>=12 && time<20){
            timeOfDay = "daytime";
        }else{
            timeOfDay = "night";
        }

        System.out.println(timeOfDay);

        //

        int weekday = 4;
        boolean holiday = true;

        if( weekday<=5 && holiday == false){
            System.out.println("Wake up at 7:00");
        }else{
            System.out.println("Sleep in!");
        }

        //


        int dayOfWeek = 2;
        String schedule;

        if(dayOfWeek==1){
            schedule ="Gym in the morning.";
        }else if(dayOfWeek==2){
            schedule = "Class after work.";
        }else if(dayOfWeek==3){
            schedule = "Meetings all day";
        } else if (dayOfWeek==4) {
            schedule = "Work from home.";
        }else if(dayOfWeek==5){
            schedule = "Game night after work.";
        }else if(dayOfWeek==6){
            schedule = "Free!";
        }else{
            schedule ="Free!";
        }
    }
}
