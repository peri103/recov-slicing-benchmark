import org.jfree.chart.plot.PiePlot;

public class Main {
    public static void main(String[] args) {
        PiePlot piePlot = new PiePlot();
        /* write */ piePlot.setLabelGap(0.05);
        /* read */ double labelGap = piePlot.getLabelGap();
        System.out.println(labelGap);
    }
}