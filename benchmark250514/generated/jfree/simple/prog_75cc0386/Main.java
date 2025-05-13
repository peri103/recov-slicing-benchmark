import org.jfree.chart.axis.DateAxis;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        // Initialize a DateAxis instance
        DateAxis dateAxis = new DateAxis();
        
        // Create a SimpleDateFormat object to set as the date format override
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        
        // Use the write method to set the date format override
        /* write */ dateAxis.setDateFormatOverride(dateFormat);
        
        // Use the read method to get the date format override
        /* read */ SimpleDateFormat resultFormat = (SimpleDateFormat) dateAxis.getDateFormatOverride();
        
        // Print the pattern of the retrieved date format to verify it matches the written value
        System.out.println(resultFormat.toPattern());
    }
}