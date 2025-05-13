import org.jfree.chart.LegendItem;

public class Main {
    public static void main(String[] args) {
        LegendItem legendItem = new LegendItem("Initial Label");
        /* write */ legendItem.setLabel("Updated Label");
        /* read */ String label = legendItem.getLabel();
        System.out.println(label);
    }
}