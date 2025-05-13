import org.jfree.chart.axis.LogarithmicAxis;

public class LogarithmicAxisHandler {
    private LogarithmicAxis axis;

    public LogarithmicAxisHandler(String axisName) {
        axis = new LogarithmicAxis(axisName);
    }

    public void setBase(double base) {
        /* write */ axis.setBase(base);
    }

    public double getBase() {
        return axis.getBase();
    }
}