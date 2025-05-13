import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();
        DateHandler dateHandler = new DateHandler(currentDate);
        dateHandler.addDaysToCurrentDate(5);
        
        DateTruncator dateTruncator = new DateTruncator();
        Date truncatedDate = dateTruncator.truncateDate(dateHandler.getNewDate());
        
        System.out.println("Original Date: " + currentDate);
        System.out.println("New Date: " + dateHandler.getNewDate());
        System.out.println("Truncated Date: " + truncatedDate);
    }
}