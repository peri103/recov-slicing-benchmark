import org.jfree.chart.LegendItem;

public class Main {
    public static void main(String[] args) {
        LegendItem legendItem = new LegendItem("Sample Legend", "Description", "ToolTip", "URL", null, null);
        /* write */ legendItem.setSeriesIndex(5);
        /* read */ int seriesIndex = legendItem.getSeriesIndex();
        System.out.println(seriesIndex);
    }
}