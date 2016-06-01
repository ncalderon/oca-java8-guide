import java.time.*;

class PeriodEvaluation {
	public static void main (String ... args) {
		Period wrong = Period.ofYears(1).ofWeeks(1);
		System.out.println(wrong);
		Period wrong2 = Period.ofYears(1);
		wrong2 = Period.ofWeeks(2);
		System.out.println(wrong2);
		
	}


}