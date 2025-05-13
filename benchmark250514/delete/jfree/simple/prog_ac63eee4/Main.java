import org.jfree.chart.axis.PeriodAxis;
import org.jfree.data.time.RegularTimePeriod;

public class Main {
    public static void main(String[] args) {
        RegularTimePeriod period = RegularTimePeriod.createInstance(java.util.Date.class, new java.util.Date(), java.util.TimeZone.getDefault());
        PeriodAxis periodAxis = new PeriodAxis("Period Axis");
        
        /* write */ periodAxis.setFirst(period);
        /* read */ RegularTimePeriod firstPeriod = periodAxis.getFirst();
        
        System.out.println(firstPeriod);
    }
}