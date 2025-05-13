import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        DateHandler dateHandler = new DateHandler();
        DateProcessor dateProcessor = new DateProcessor();

        // Set minutes to 30
        dateHandler.setMinutes(30);

        // Perform some unrelated operations
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateHandler.getDate());
        calendar.add(Calendar.HOUR, 5);
        Date futureDate = calendar.getTime();
        System.out.println("Future Date: " + futureDate);

        // Truncate the date
        Date truncatedDate = dateProcessor.truncateDate(dateHandler.getDate());

        // Print the truncated date
        dateProcessor.printDate(truncatedDate);

        // Further unrelated calculations
        calendar.setTime(new Date());
        calendar.add(Calendar.MONTH, 1);
        Date nextMonth = calendar.getTime();
        System.out.println("Date next month: " + nextMonth);
    }
}