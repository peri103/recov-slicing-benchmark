import org.jfree.chart.plot.PiePlot;

public class Main {
    public static void main(String[] args) {
        PiePlot plot = new PiePlot();
        /* write */ plot.setSectionOutlinesVisible(true);
        /* read */ boolean isVisible = plot.getSectionOutlinesVisible();
        System.out.println(isVisible);
    }
}