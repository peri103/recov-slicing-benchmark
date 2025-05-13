import org.jfree.chart.plot.RingPlot;

public class Main {
    public static void main(String[] args) {
        RingPlot plot = new RingPlot();
        /* write */ plot.setSectionDepth(0.5);
        /* read */ double sectionDepth = plot.getSectionDepth();
        System.out.println(sectionDepth);
    }
}