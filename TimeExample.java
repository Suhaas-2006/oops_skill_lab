
import java.time.*;
public class TimeExample {
	    public static void main(String[] args) {

	        LocalDate today = LocalDate.now();
	        System.out.println("Today's date: " + today);


	        LocalTime timeNow = LocalTime.now();
	        System.out.println("Current time: " + timeNow);


	        LocalDateTime dateTimeNow = LocalDateTime.now();
	        System.out.println("Current date and time: " + dateTimeNow);


	        ZonedDateTime indiaTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
	        System.out.println("Zoned date and time (India): " + indiaTime);


	        Instant instantNow = Instant.now();
	        System.out.println("Current instant (UTC): " + instantNow);


	        LocalTime start = LocalTime.of(9, 0);
	        LocalTime end = LocalTime.of(10, 30);
	        Duration duration = Duration.between(start, end);
	        System.out.println("Duration: " + duration.toMinutes() + " minutes");


	        LocalDate birthDate = LocalDate.of(2000, 1, 1);
	        Period period = Period.between(birthDate, today);
	        System.out.println("Period: " + period.getYears() + " years and " + period.getMonths() + " months");
	    }
	}



