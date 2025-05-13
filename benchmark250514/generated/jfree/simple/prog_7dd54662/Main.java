import org.jfree.chart.axis.DateAxis;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        // Initialize the DateAxis object
        DateAxis dateAxis = new DateAxis("Date Axis");

        // Create a SimpleDateFormat object
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        // Write operation: set the date format override
        /* write */ dateAxis.setDateFormatOverride(dateFormat);

        // Read operation: get the date format override
        /* read */ SimpleDateFormat readDateFormat = (SimpleDateFormat) dateAxis.getDateFormatOverride();

        // Print the result to verify
        System.out.println("Date format: " + readDateFormat.toPattern());
    }
}