package java8Features.dateandtime;

import java.time.*;
import java.time.temporal.ChronoField;

public class NewAPIDemo {
    public static void main(String[] args) {

        //softwareExpiry();
        //gameTimeInDiffZones();
        calAge();

    }

    //software expiry time
    public static void softwareExpiry(){
        LocalDate expiryDate = LocalDate.of(2022,1,26);
        System.out.println(expiryDate); //2022-01-26

        LocalDate expiryDate1 = expiryDate.plusMonths(12);
        System.out.println("New Expiry Date "+ expiryDate1);

        //other methods
        System.out.println(expiryDate1.lengthOfMonth());

        // get returns an int

        LocalDate newExpiryDate = expiryDate1;
        System.out.println("year again: " + newExpiryDate.get(ChronoField.YEAR));
        System.out.println("month again: " + newExpiryDate.get(ChronoField.MONTH_OF_YEAR));
        System.out.println("day of month again: " + newExpiryDate.get(ChronoField.DAY_OF_MONTH));

    }

    //tv cricket time in different Time zone
    public static void gameTimeInDiffZones(){
        //LocalTime
        LocalTime time = LocalTime.of(9, 00, 00);
        System.out.println("\ntime -- hr: " + time.getHour());

        // LocalDate
        LocalDate gameStartDate = LocalDate.of(2017, Month.JULY, 03);

        // LocalDateTime
        LocalDateTime gameStartTime = LocalDateTime.of(gameStartDate, time);
        System.out.println("gameStartTime: " + gameStartTime);

        // TimeZone ==> ZoneId
        ZonedDateTime zonedGameStartTime = ZonedDateTime.of(gameStartTime, ZoneId.of("Europe/London"));
        System.out.println("zonedGameStartTime: " + zonedGameStartTime);

        ZonedDateTime indiaTime = zonedGameStartTime.withZoneSameInstant(ZoneId.of("Asia/Kolkata"));
        System.out.println("indiaTime: " + indiaTime);

        ZonedDateTime pst = zonedGameStartTime.withZoneSameInstant(ZoneId.of("America/Los_Angeles"));
        System.out.println("pst: " + pst);
    }


    //age calculation: btw two date
    public static  void calAge(){
        LocalDate birthDay = LocalDate.of(1998, Month.FEBRUARY, 18);
        LocalDate today = LocalDate.now(); // current date from system clock
        Period period = birthDay.until(today);
        System.out.println("\nComplete Age: " + period.toString());
        System.out.println("Age: " + period.getYears());

    }

    //interval time: interval btw two time
    public  static  void findTimeInterval(){

    }
}
