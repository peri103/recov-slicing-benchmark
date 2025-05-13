import org.jfree.chart.plot.RingPlot;

public class Main {
    public static void main(String[] args) {
        RingPlot ringPlot = new RingPlot();
        /* write */ ringPlot.setSectionDepth(0.5);
        /* read */ double sectionDepth = ringPlot.getSectionDepth();
        System.out.println(sectionDepth);
    }
}