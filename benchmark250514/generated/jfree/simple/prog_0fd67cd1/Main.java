import org.jfree.chart.plot.PiePlot;

public class Main {
    public static void main(String[] args) {
        PiePlot plot = new PiePlot();
        /* write */ plot.setLabelGap(0.05);
        /* read */ double labelGap = plot.getLabelGap();
        System.out.println(labelGap);
    }
}