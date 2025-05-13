import org.jfree.chart.axis.LogarithmicAxis;

public class AxisManager {
    private LogarithmicAxisWrapper axisWrapper;

    public AxisManager(String label) {
        axisWrapper = new LogarithmicAxisWrapper(label);
    }

    public void configureAxisBase(double base) {
        axisWrapper.setAxisBase(base);
    }

    public double getAxisBase() {
        LogarithmicAxis axis = axisWrapper.getAxis();
        /* read */ return axis.getBase();
    }

    public double computeLogarithm(double value) {
        return axisWrapper.calculateLog(value);
    }
}
