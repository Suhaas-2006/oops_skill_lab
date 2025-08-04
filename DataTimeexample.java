
import java.time.*;
import java.time.format.DateTimeFormatter;
public class DateTimeexample {
		public static void main(String[] args) {
		    LocalDate currentDate = LocalDate.now();
		    LocalDateTime currentDateTime = LocalDateTime.now();
		LocalDate birthDate = LocalDate.of(2005, Month.JANUARY, 1);
	        System.out.println("Birth Date: " + birthDate);


	        LocalDate futureDate = currentDate.plusDays(10);
	        System.out.println("Date after 10 days: " + futureDate);


	        Period age = Period.between(birthDate, currentDate);
	        System.out.println("Age: " + age.getYears() + " years");


	        Duration duration = Duration.between(LocalTime.of(8, 0), LocalTime.of(16, 00));
	        System.out.println("Work Duration: " + duration.toHours() + " hours");

	        
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
	        String formattedDate = currentDateTime.format(formatter);
	        System.out.println("Formatted DateTime: " + formattedDate);

	        
	        String dateStr = "29-07-2025 10:30";
	        LocalDateTime parsedDateTime = LocalDateTime.parse(dateStr, formatter);
	        System.out.println("Parsed DateTime: " + parsedDateTime);

	        
	        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
	        System.out.println("Zoned DateTime (Asia/Kolkata): " + zonedDateTime);
	        
	        LocalDate date2 = LocalDate.of(1947,8,15);
	    System.out.println("the independece day of India :"+date2);
	    
	        
		}
	}

