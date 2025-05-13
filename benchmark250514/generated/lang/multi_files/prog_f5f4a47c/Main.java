import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();
        DateHandler dateHandler = new DateHandler(currentDate);

        // Use the ceilingDate from DateHandler
        Date ceilingDate = dateHandler.getCeilingDate();

        // Create a DateTruncator using the ceilingDate
        DateTruncator dateTruncator = new DateTruncator(ceilingDate);

        // Retrieve and print the truncatedDate
        Date truncatedDate = dateTruncator.getTruncatedDate();
        System.out.println("Ceiling Date: " + ceilingDate);
        System.out.println("Truncated Date: " + truncatedDate);

        // Additional complexity with a list of dates
        List<Date> dateList = new ArrayList<>();
        dateList.add(currentDate);
        dateList.add(ceilingDate);
        dateList.add(truncatedDate);

        for (Date date : dateList) {
            System.out.println("Date in List: " + date);
        }
    }
}