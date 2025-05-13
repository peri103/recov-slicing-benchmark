import org.jfree.chart.axis.LogarithmicAxis;

public class Main {
    public static void main(String[] args) {
        LogarithmicAxis axis = new LogarithmicAxis("Sample Axis");
        /* write */ axis.setBase(10.0);
        /* read */ double base = axis.getBase();
        System.out.println(base);
    }
}