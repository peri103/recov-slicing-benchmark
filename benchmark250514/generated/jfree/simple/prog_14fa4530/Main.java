import org.jfree.chart.plot.PiePlot;

public class Main {
    public static void main(String[] args) {
        PiePlot plot = new PiePlot();
        /* write */ plot.setMaximumLabelWidth(0.15);
        /* read */ double value = plot.getMaximumLabelWidth();
        System.out.println(value);
    }
}