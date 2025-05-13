import org.jfree.chart.axis.LogarithmicAxis;

public class LogarithmicAxisWrapper {
    private LogarithmicAxis axis;

    public LogarithmicAxisWrapper(String label) {
        axis = new LogarithmicAxis(label);
    }

    public void setAxisBase(double base) {
        /* write */ axis.setBase(base);
    }

    public double calculateLog(double value) {
        return axis.calculateLog(value);
    }

    public LogarithmicAxis getAxis() {
        return axis;
    }
}
