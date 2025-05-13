import org.jfree.chart.axis.DateAxis;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        DateAxis dateAxis = new DateAxis();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        
        /* write */ dateAxis.setDateFormatOverride(dateFormat);

        // Additional complex operations
        ArrayList<DateFormat> dateFormats = new ArrayList<>();
        dateFormats.add(dateFormat);
        dateFormats.add(new SimpleDateFormat("MM-dd-yyyy"));
        dateFormats.add(new SimpleDateFormat("dd/MM/yyyy"));

        HashMap<String, DateFormat> formatMap = new HashMap<>();
        formatMap.put("ISO", dateFormats.get(0));
        formatMap.put("US", dateFormats.get(1));
        formatMap.put("EU", dateFormats.get(2));

        for (String key : formatMap.keySet()) {
            DateFormat format = formatMap.get(key);
            System.out.println("Format for " + key + ": " + format.format(new java.util.Date()));
        }

        // More operations to increase complexity
        ArrayList<String> dateStrings = new ArrayList<>();
        dateStrings.add("2023-10-10");
        dateStrings.add("10-11-2023");
        dateStrings.add("12/10/2023");

        for (String dateStr : dateStrings) {
            System.out.println("Processing date string: " + dateStr);
        }

        /* read */ DateFormat readFormat = dateAxis.getDateFormatOverride();
        System.out.println("Read format: " + readFormat.format(new java.util.Date()));
    }
}