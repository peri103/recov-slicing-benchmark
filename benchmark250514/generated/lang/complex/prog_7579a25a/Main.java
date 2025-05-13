import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize a calendar to a specific date
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.JANUARY, 15); // Setting date to January 15, 2023
        Date date = calendar.getTime();

        // Use the setMonths method to change the month
        /* write */ date = DateUtils.setMonths(date, Calendar.MARCH); // Change month to March

        // Create a list to store dates
        List<Date> dateList = new ArrayList<>();
        dateList.add(date);

        // Add more dates with different manipulations
        calendar.set(2024, Calendar.FEBRUARY, 10);
        Date anotherDate = calendar.getTime();
        anotherDate = DateUtils.setYears(anotherDate, 2025);
        dateList.add(anotherDate);

        calendar.set(2025, Calendar.DECEMBER, 25);
        Date holidayDate = calendar.getTime();
        holidayDate = DateUtils.addDays(holidayDate, 5);
        dateList.add(holidayDate);

        // Perform some operations on the list
        for (Date d : dateList) {
            System.out.println("Original Date: " + d);
            Date roundedDate = DateUtils.round(d, Calendar.MONTH);
            System.out.println("Rounded Date: " + roundedDate);
        }

        // Use the truncate method to truncate the date to the start of the month
        /* read */ Date truncatedDate = DateUtils.truncate(date, Calendar.MONTH);

        // Print the truncated date
        System.out.println("Truncated Date: " + truncatedDate);

        // Calculate the difference in days between the first and last date
        long diffInMillis = dateList.get(dateList.size() - 1).getTime() - dateList.get(0).getTime();
        long diffInDays = diffInMillis / (1000 * 60 * 60 * 24);
        System.out.println("Difference in days between first and last date: " + diffInDays);
    }
}