import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        
        // Add 5 years to the current date
        /* write */ Date newDate = DateUtils.addYears(date, 5);

        // Additional unrelated code to make the program more complex
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, 3); // Add 3 months to the original date
        Date threeMonthsLater = calendar.getTime();
        
        calendar.setTime(newDate);
        calendar.add(Calendar.DAY_OF_YEAR, 10); // Add 10 days to the new date
        Date tenDaysLater = calendar.getTime();
        
        // Print the dates
        System.out.println("Original Date: " + date);
        System.out.println("Three Months Later: " + threeMonthsLater);
        System.out.println("Ten Days Later: " + tenDaysLater);
        
        // Perform some calculations with dates
        long diffInMillies = Math.abs(tenDaysLater.getTime() - threeMonthsLater.getTime());
        long diffInDays = diffInMillies / (24 * 60 * 60 * 1000);
        System.out.println("Difference in days between 'Ten Days Later' and 'Three Months Later': " + diffInDays);

        // Truncate the new date to remove time components
        /* read */ Date truncatedDate = DateUtils.truncate(newDate, Calendar.DATE);
        
        System.out.println("Truncated Date (5 years later): " + truncatedDate);
    }
}