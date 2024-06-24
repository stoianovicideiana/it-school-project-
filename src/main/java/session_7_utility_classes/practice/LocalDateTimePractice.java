package session_7_utility_classes.practice;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateTimePractice {

    public static void main(String[] args) {
        //declar pentru a vedea data si ora
        LocalDateTime localDateTime = LocalDateTime.now();
        //System.out.println(localDateTime);

        //printLocalDateDecrement(localDateTime, 5L);
        LocalDateTime localDateTime2 = localDateTime.plusDays(2);
        printLocalDateTimeDifference(localDateTime, localDateTime2);
    }

    public static void printLocalDateDecrement(LocalDateTime localDateTime, long decrement) {
        System.out.println(localDateTime.minusHours(decrement));
    }

    public static void printLocalDateTimeDifference(LocalDateTime startLocalDateTime, LocalDateTime endLocalDateTime) {
        Duration duration = Duration.between(startLocalDateTime, endLocalDateTime);
        long hours = duration.toHours();
        long minutes = duration.toMinutes();
        long seconds = duration.toSeconds();

        System.out.printf("Time difference is %d hours, %d minutes, %d seconds", hours, minutes, seconds);
    }
}
