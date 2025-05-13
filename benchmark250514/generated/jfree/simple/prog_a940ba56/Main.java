import org.jfree.chart.plot.PiePlot;

public class Main {
    public static void main(String[] args) {
        PiePlot piePlot = new PiePlot();
        /* write */ piePlot.setMaximumLabelWidth(0.2);
        /* read */ double maxLabelWidth = piePlot.getMaximumLabelWidth();
        System.out.println(maxLabelWidth);
    }
}