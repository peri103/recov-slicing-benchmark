import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize a Date object
        Date date = new Date();

        // Create a Calendar instance and set it to the current date
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        // Round the date to the nearest hour
        /* write */ Date roundedDate = DateUtils.round(calendar.getTime(), Calendar.HOUR);

        // Perform some unrelated operations
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("Current Date: " + sdf.format(date));

        // Create an ArrayList to store formatted dates
        ArrayList<String> formattedDates = new ArrayList<>();
        formattedDates.add(sdf.format(date));
        formattedDates.add(sdf.format(roundedDate));

        // Add more operations
        for (int i = 0; i < 5; i++) {
            Calendar tempCal = Calendar.getInstance();
            tempCal.setTime(date);
            tempCal.add(Calendar.DATE, i);
            formattedDates.add(sdf.format(tempCal.getTime()));
        }

        // Truncate the rounded date to the nearest hour
        /* read */ Date truncatedDate = DateUtils.truncate(roundedDate, Calendar.HOUR);

        // Print the truncated date
        System.out.println("Truncated Date: " + sdf.format(truncatedDate));

        // Print all formatted dates
        for (String formattedDate : formattedDates) {
            System.out.println("Formatted Date: " + formattedDate);
        }
    }
}