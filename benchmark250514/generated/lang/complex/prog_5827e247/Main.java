import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();
        
        // Use DateUtils to add 5 years to the current date
        /* write */ Date futureDate = DateUtils.addYears(currentDate, 5);

        // Perform some unrelated operations to make the program more complex
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        calendar.add(Calendar.MONTH, 2);
        Date twoMonthsLater = calendar.getTime();
        
        // Calculate the difference in days between the current date and the date two months later
        long differenceInMillis = twoMonthsLater.getTime() - currentDate.getTime();
        long differenceInDays = differenceInMillis / (24 * 60 * 60 * 1000);
        System.out.println("Days between current date and two months later: " + differenceInDays);

        // Perform another operation: add 10 days to the future date
        Date tenDaysLater = DateUtils.addDays(futureDate, 10);
        System.out.println("Future Date plus 10 days: " + tenDaysLater);

        // Truncate the date to remove time information
        /* read */ Date truncatedDate = DateUtils.truncate(futureDate, Calendar.DATE);
        
        System.out.println("Future Date: " + futureDate);
        System.out.println("Truncated Date: " + truncatedDate);

        // More operations to increase complexity: add 3 hours to the truncated date
        Date threeHoursLater = DateUtils.addHours(truncatedDate, 3);
        System.out.println("Truncated Date plus 3 hours: " + threeHoursLater);

        // Calculate the difference in hours between the truncated date and three hours later
        long differenceInHours = (threeHoursLater.getTime() - truncatedDate.getTime()) / (60 * 60 * 1000);
        System.out.println("Hours between truncated date and three hours later: " + differenceInHours);
    }
}