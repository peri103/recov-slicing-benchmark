import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();
        
        DateManipulator dateManipulator = new DateManipulator(currentDate);
        
        // Add days to the current date
        Date futureDate = dateManipulator.addDaysToDate(5);
        
        // Create an event with the future date
        Event futureEvent = new Event("Future Event", futureDate);
        System.out.println("Event Name: " + futureEvent.getName());
        System.out.println("Event Date: " + futureEvent.getDate());

        // Perform some unrelated operations
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        calendar.add(Calendar.MONTH, 1);
        Date oneMonthAhead = calendar.getTime();
        System.out.println("One month ahead: " + oneMonthAhead);
        
        // Truncate the future date
        Date truncatedDate = dateManipulator.truncateDate(futureDate);
        
        // Print the truncated date
        System.out.println("Truncated future date: " + truncatedDate);
    }
}