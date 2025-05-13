import org.jfree.chart.axis.PeriodAxis;
import org.jfree.data.time.Day;

public class Main {
    public static void main(String[] args) {
        PeriodAxis axis = new PeriodAxis("Sample Axis");
        Day lastDay = new Day(12, 10, 2023);
        
        /* write */ axis.setLast(lastDay);
        /* read */ Day readDay = axis.getLast();
        
        System.out.println("Last period set: " + readDay);
    }
}