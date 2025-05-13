import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();
        
        // Use DateManipulator to modify the date
        DateManipulator manipulator = new DateManipulator();
        manipulator.addMonthToDate(currentDate);
        
        // Retrieve the modified date
        Date modifiedDate = manipulator.getModifiedDate();
        
        // Use DateTruncator to truncate the modified date
        DateTruncator truncator = new DateTruncator();
        Date truncatedDate = truncator.truncateDate(modifiedDate);
        
        // Output the truncated date
        System.out.println("Truncated Date: " + truncatedDate);
    }
}