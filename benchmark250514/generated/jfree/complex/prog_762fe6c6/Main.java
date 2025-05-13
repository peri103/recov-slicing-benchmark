import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DatasetChangeEvent;
import org.jfree.data.general.DatasetChangeListener;
import org.jfree.data.general.DatasetGroup;

public class Main {
    public static void main(String[] args) {
        // Initialize the dataset
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1, "Row1", "Column1");
        dataset.addValue(2, "Row2", "Column2");

        // Create an instance of MultiplePiePlot
        MultiplePiePlot plot = new MultiplePiePlot();

        // Use the write method to set the dataset
        /* write */ plot.setDataset(dataset);

        // Add a dataset change listener to the plot
        plot.getDataset().addChangeListener(new DatasetChangeListener() {
            @Override
            public void datasetChanged(DatasetChangeEvent event) {
                System.out.println("Dataset changed: " + event.getDataset());
            }
        });

        // Perform operations with the dataset
        DatasetGroup group = new DatasetGroup("Group1");
        dataset.setGroup(group);
        dataset.addValue(3, "Row3", "Column3");

        // Retrieve the dataset group
        DatasetGroup retrievedGroup = dataset.getGroup();
        System.out.println("Dataset Group: " + retrievedGroup.getID());

        // Additional unrelated operations
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 5 is: " + sum);

        // Use the read method to get the dataset
        /* read */ DefaultCategoryDataset retrievedDataset = (DefaultCategoryDataset) plot.getDataset();

        // Verify the dataset is correctly retrieved
        System.out.println(retrievedDataset.getValue("Row1", "Column1"));
        System.out.println(retrievedDataset.getValue("Row2", "Column2"));
        System.out.println(retrievedDataset.getValue("Row3", "Column3"));
    }
}