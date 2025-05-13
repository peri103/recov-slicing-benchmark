import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        
        DateManager dateManager = new DateManager(date);
        dateManager.addHoursToDate(5);
        
        Date truncatedDate = dateManager.truncateDate();
        
        System.out.println("Original Date: " + date);
        System.out.println("Truncated Date: " + truncatedDate);
    }
}