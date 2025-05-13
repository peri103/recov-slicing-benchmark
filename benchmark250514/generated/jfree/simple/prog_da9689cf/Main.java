import org.jfree.chart.LegendItem;

public class Main {
    public static void main(String[] args) {
        LegendItem legendItem = new LegendItem("Example");
        /* write */ legendItem.setSeriesIndex(5);
        /* read */ int seriesIndex = legendItem.getSeriesIndex();
        System.out.println(seriesIndex);
    }
}