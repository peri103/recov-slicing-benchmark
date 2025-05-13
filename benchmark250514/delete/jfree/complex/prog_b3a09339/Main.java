import org.jfree.chart.plot.Plot;
import org.jfree.data.general.Dataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.DefaultCategoryDataset;

public class Main {
    public static void main(String[] args) {
        Plot plot = new Plot() {
            private Dataset dataset;

            @Override
            public String getPlotType() {
                return "Custom Plot";
            }

            @Override
            public void setDataset(Dataset dataset) {
                this.dataset = dataset;
            }

            @Override
            public Dataset getDataset() {
                return this.dataset;
            }
        };

        DefaultPieDataset pieDataset = new DefaultPieDataset();
        pieDataset.setValue("Category 1", 43.2);
        pieDataset.setValue("Category 2", 27.9);
        pieDataset.setValue("Category 3", 29.0);

        DefaultCategoryDataset categoryDataset = new DefaultCategoryDataset();
        categoryDataset.addValue(1.0, "Row 1", "Column 1");
        categoryDataset.addValue(5.0, "Row 1", "Column 2");
        categoryDataset.addValue(3.0, "Row 1", "Column 3");

        /* write */ plot.setDataset(pieDataset);

        // Additional unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // Using another dataset
        plot.setDataset(categoryDataset);
        Dataset anotherRetrievedDataset = plot.getDataset();
        System.out.println("Another retrieved dataset: " + anotherRetrievedDataset);

        // More complex operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of first 5 numbers: " + product);

        /* read */ Dataset retrievedDataset = plot.getDataset();
        System.out.println("Retrieved dataset: " + retrievedDataset);
    }
}