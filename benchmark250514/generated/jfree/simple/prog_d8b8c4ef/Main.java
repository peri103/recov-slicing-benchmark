import org.jfree.chart.plot.PiePlot;

public class Main {
    public static void main(String[] args) {
        PiePlot piePlot = new PiePlot();
        /* write */ piePlot.setSectionOutlinesVisible(true);
        /* read */ boolean outlinesVisible = piePlot.getSectionOutlinesVisible();
        System.out.println(outlinesVisible);
    }
}