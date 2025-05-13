import org.jfree.chart.title.TextTitle;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

public class Main {
    public static void main(String[] args) {
        // Create a TextTitle object
        TextTitle textTitle = new TextTitle();

        // Set the text of the TextTitle
        /* write */ textTitle.setText("Hello, World!");

        // Create a dataset for the chart
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1, "Series1", "Category1");
        dataset.addValue(5, "Series1", "Category2");
        dataset.addValue(3, "Series1", "Category3");

        // Create a chart using the dataset
        JFreeChart chart = ChartFactory.createBarChart(
                "Sample Chart",
                "Category",
                "Value",
                dataset
        );

        // Set the title of the chart using the TextTitle
        chart.setTitle(textTitle);

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Access the text of the TextTitle and print it
        /* read */ String text = textTitle.getText();
        System.out.println("Chart Title: " + text);

        // Further unrelated operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);
    }
}