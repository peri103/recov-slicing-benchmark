import org.jfree.chart.axis.LogarithmicAxis;
import org.jfree.chart.axis.NumberAxis;

public class Main {
    public static void main(String[] args) {
        LogarithmicAxis logAxis = new LogarithmicAxis("Log Axis");
        NumberAxis numberAxis = new NumberAxis("Number Axis");
        
        /* write */ logAxis.setBase(10.0);
        
        numberAxis.setRange(0.0, 100.0);
        
        double rangeStart = numberAxis.getRange().getLowerBound();
        double rangeEnd = numberAxis.getRange().getUpperBound();
        
        for (double i = rangeStart; i <= rangeEnd; i += 10) {
            System.out.println("Range value: " + i);
        }
        
        double baseValue = logAxis.getBase();
        System.out.println("Base value of LogarithmicAxis: " + baseValue);
        
        numberAxis.setTickUnit(new org.jfree.chart.axis.NumberTickUnit(10.0));
        System.out.println("Tick unit: " + numberAxis.getTickUnit().getSize());
        
        double[] tickPositions = numberAxis.getTickUnit().getTickPositions(rangeStart, rangeEnd);
        for (double pos : tickPositions) {
            System.out.println("Tick position: " + pos);
        }
        
        /* read */ double retrievedBaseValue = logAxis.getBase();
        System.out.println("Retrieved base value: " + retrievedBaseValue);
    }
}