import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize a date object
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.OCTOBER, 15, 10, 30, 45);
        Date date = calendar.getTime();

        // Round the date to the nearest hour
        /* write */ Date roundedDate = DateUtils.round(date, Calendar.HOUR);

        // Perform some unrelated operations to make the program more complex
        ArrayList<Date> dateList = new ArrayList<>();
        dateList.add(date);
        dateList.add(new Date());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        for (Date d : dateList) {
            System.out.println("Formatted Date: " + sdf.format(d));
        }

        // Add more complexity by manipulating the calendar object
        calendar.add(Calendar.DAY_OF_MONTH, 5);
        Date futureDate = calendar.getTime();
        System.out.println("Future Date: " + sdf.format(futureDate));

        // Truncate the date to the nearest hour
        /* read */ Date truncatedDate = DateUtils.truncate(roundedDate, Calendar.HOUR);

        // Print the truncated date
        System.out.println("Truncated Date: " + sdf.format(truncatedDate));

        // Further manipulate the calendar to show different date manipulations
        calendar.add(Calendar.MONTH, -2);
        Date pastDate = calendar.getTime();
        System.out.println("Past Date: " + sdf.format(pastDate));
    }
}