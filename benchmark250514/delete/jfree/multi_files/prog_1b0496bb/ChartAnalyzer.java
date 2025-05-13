import org.jfree.chart.plot.PiePlot;

public class ChartAnalyzer {
    private PiePlot piePlot;

    public ChartAnalyzer(PiePlot piePlot) {
        this.piePlot = piePlot;
    }

    public void analyze() {
        boolean circular = piePlot.isCircular();
        boolean ignoreNulls = piePlot.getIgnoreNullValues();
        System.out.println("PiePlot is circular: " + circular);
        System.out.println("PiePlot ignores null values: " + ignoreNulls);
        
        /* read */ boolean isVisible = piePlot.getSectionOutlinesVisible();
        System.out.println("Section outlines visible: " + isVisible);
    }
}
