import org.jfree.chart.axis.DateAxis;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        DateAxis dateAxis = new DateAxis();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        
        /* write */ dateAxis.setDateFormatOverride(dateFormat);
        /* read */ SimpleDateFormat readFormat = (SimpleDateFormat) dateAxis.getDateFormatOverride();
        
        System.out.println(readFormat.toPattern());
    }
}