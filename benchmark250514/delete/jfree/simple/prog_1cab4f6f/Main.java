import org.jfree.chart.axis.LogarithmicAxis;

public class Main {
    public static void main(String[] args) {
        LogarithmicAxis logAxis = new LogarithmicAxis("Log Axis");
        /* write */ logAxis.setBase(10.0);
        /* read */ double base = logAxis.getBase();
        System.out.println(base);
    }
}