import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date birthDate = new Date();
        Student student = new Student("John Doe", birthDate);
        
        // Add days to student's birth date
        Date newDate = student.addDaysToBirthDate(5);
        
        // Use DateTruncator to truncate the date
        DateTruncator truncator = new DateTruncator();
        Date truncatedDate = truncator.truncateToSemiMonth(newDate);
        
        // Output the truncated date
        System.out.println("Truncated Date for " + student.getName() + ": " + truncatedDate);
    }
}