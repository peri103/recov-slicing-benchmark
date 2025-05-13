import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.data.general.Dataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.chart.util.SortOrder;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Dataset dataset = new DefaultPieDataset();
        MultiplePiePlot plot = new MultiplePiePlot(dataset);

        /* write */ plot.setDataExtractOrder(SortOrder.ASCENDING);

        // Adding complexity with more operations
        Random random = new Random();
        int randomValue = random.nextInt(100);
        System.out.println("Random Value: " + randomValue);

        SortOrder[] sortOrders = SortOrder.values();
        for (SortOrder sortOrder : sortOrders) {
            System.out.println("Sort Order: " + sortOrder);
        }

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
            System.out.println("Current Sum: " + sum);
        }

        // Unrelated dataset manipulation
        DefaultPieDataset pieDataset = new DefaultPieDataset();
        pieDataset.setValue("Category 1", 45);
        pieDataset.setValue("Category 2", 30);
        pieDataset.setValue("Category 3", 25);

        double totalValue = 0;
        for (Comparable key : pieDataset.getKeys()) {
            Number value = pieDataset.getValue(key);
            totalValue += value.doubleValue();
        }
        System.out.println("Total Value: " + totalValue);

        /* read */ SortOrder order = plot.getDataExtractOrder();
        System.out.println("Data Extract Order: " + order);
    }
}