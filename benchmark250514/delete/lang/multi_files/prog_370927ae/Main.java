import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Initialize current date
        Date currentDate = new Date();

        // Create a DateOperations instance
        DateOperations dateOps = new DateOperations(currentDate);
        
        // Add weeks to the date
        dateOps.addWeeks(1);

        // Create a student and add attendance date
        Student student = new Student("John Doe");
        student.addAttendanceDate(dateOps.getDate());

        // Perform unrelated operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);

        // Print attendance dates
        System.out.println("Attendance dates for " + student.getName() + ":");
        for (Date date : student.getAttendanceDates()) {
            System.out.println(date);
        }

        // Get and print the truncated date
        /* read */ Date truncatedDate = dateOps.getTruncatedDate();
        System.out.println("Truncated date: " + truncatedDate);
    }
}