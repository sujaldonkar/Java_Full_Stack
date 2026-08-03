import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateAndTime {

	public static void main(String[] args) {
		LocalDateTime today=LocalDateTime.now().minusMonths(2);
		System.out.println(today);
		today.getMonth();

	}

}
