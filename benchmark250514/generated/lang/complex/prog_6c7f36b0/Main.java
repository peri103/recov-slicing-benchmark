import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        // Initialize a Date object with the current date
        Date date = new Date();
        
        // Add 1 week to the current date
        /* write */ Date newDate = DateUtils.addWeeks(date, 1);
        
        // Perform some unrelated date manipulations
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(newDate);
        calendar.add(Calendar.DAY_OF_YEAR, 5);
        Date fiveDaysLater = calendar.getTime();
        
        // Print the modified date
        System.out.println("Date after adding 5 days: " + fiveDaysLater);
        
        // More date manipulations
        calendar.add(Calendar.MONTH, 2);
        Date twoMonthsLater = calendar.getTime();
        System.out.println("Date after adding 2 months: " + twoMonthsLater);
        
        // Truncate the newDate to the nearest semi-month
        /* read */ Date truncatedDate = DateUtils.truncate(newDate, DateUtils.SEMI_MONTH);
        
        // Print the truncated date
        System.out.println("Truncated Date: " + truncatedDate);
        
        // Additional complexity: Calculate the difference in days between two dates
        long diffInMillies = Math.abs(twoMonthsLater.getTime() - fiveDaysLater.getTime());
        long diffInDays = diffInMillies / (24 * 60 * 60 * 1000);
        System.out.println("Difference in days: " + diffInDays);
        
        // Further manipulation: Check if the year is a leap year
        calendar.setTime(truncatedDate);
        int year = calendar.get(Calendar.YEAR);
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println("Is the year " + year + " a leap year? " + isLeapYear);
    }
}