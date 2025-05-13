import org.jfree.chart.axis.DateAxis;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

public class Main {
    public static void main(String[] args) {
        DateAxis dateAxis = new DateAxis();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        /* write */ dateAxis.setDateFormatOverride(dateFormat);

        /* read */ DateFormat readFormat = dateAxis.getDateFormatOverride();
        System.out.println(readFormat.format(new java.util.Date()));
    }
}