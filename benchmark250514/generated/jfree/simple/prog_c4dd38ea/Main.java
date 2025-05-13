import org.jfree.chart.plot.PiePlot;

public class Main {
    public static void main(String[] args) {
        PiePlot plot = new PiePlot();
        /* write */ plot.setMaximumLabelWidth(0.25);
        /* read */ double maxLabelWidth = plot.getMaximumLabelWidth();
        System.out.println(maxLabelWidth);
    }
}