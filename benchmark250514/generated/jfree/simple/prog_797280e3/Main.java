import org.jfree.chart.axis.PeriodAxis;
import org.jfree.data.time.Day;

public class Main {
    public static void main(String[] args) {
        PeriodAxis periodAxis = new PeriodAxis("Sample Axis");
        Day day = new Day(1, 1, 2023);
        
        /* write */ periodAxis.setFirst(day);
        /* read */ Day firstDay = (Day) periodAxis.getFirst();
        
        System.out.println("First day set in PeriodAxis: " + firstDay);
    }
}