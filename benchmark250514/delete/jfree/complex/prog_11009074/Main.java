import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.TickUnit;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.DateTickUnit;

public class Main {
    public static void main(String[] args) {
        NumberAxis numberAxis = new NumberAxis();
        TickUnit tickUnit = new TickUnit(10.0);
        
        /* write */ numberAxis.setTickUnit(tickUnit);

        // Additional code for complexity
        DateAxis dateAxis = new DateAxis();
        DateTickUnit dateTickUnit = new DateTickUnit(DateTickUnit.DAY, 1);
        dateAxis.setTickUnit(dateTickUnit);
        
        double value = numberAxis.getLowerBound();
        numberAxis.setRange(value, value + 100);
        
        double[] data = new double[10];
        for (int i = 0; i < data.length; i++) {
            data[i] = numberAxis.getLowerBound() + i * numberAxis.getTickUnit().getSize();
        }

        DateTickUnit retrievedDateTickUnit = dateAxis.getTickUnit();
        System.out.println("Date Tick Unit: " + retrievedDateTickUnit.getSize());
        
        /* read */ TickUnit retrievedTickUnit = numberAxis.getTickUnit();
        System.out.println("Tick Unit: " + retrievedTickUnit.getSize());

        for (double d : data) {
            System.out.println("Data Value: " + d);
        }
    }
}