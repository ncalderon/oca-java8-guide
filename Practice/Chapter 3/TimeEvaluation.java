import java.time.*;

public class TimeEvaluation {
	public static void main (String ... args) {
		System.out.println(LocalDate.now());		
		System.out.println(LocalTime.now());		
		System.out.println(LocalDateTime.now());
		LocalDate date1 = LocalDate.of(2016, Month.APRIL, 30);
		System.out.println(date1);		

	}

}