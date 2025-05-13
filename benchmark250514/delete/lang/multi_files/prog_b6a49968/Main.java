import java.util.Date;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();
        Student student = new Student("John", currentDate);
        
        Date updatedDate = student.getUpdatedDate();
        
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Updated Date: " + formatter.format(updatedDate));
        
        /* read */ Date truncatedDate = student.getTruncatedDate(updatedDate);
        
        System.out.println("Truncated Date: " + formatter.format(truncatedDate));
    }
}