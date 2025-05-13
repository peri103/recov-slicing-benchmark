import org.jfree.chart.labels.StandardXYItemLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;

public class Main {
    public static void main(String[] args) {
        // Original write-read pair
        StandardXYItemLabelGenerator labelGenerator = new StandardXYItemLabelGenerator();
        /* write */ labelGenerator.setFormatString("Value: {0}");
        
        // Adding complexity with other label generators
        StandardPieSectionLabelGenerator pieLabelGenerator = new StandardPieSectionLabelGenerator();
        pieLabelGenerator.setFormatString("{0} = {1}");
        
        StandardCategoryItemLabelGenerator categoryLabelGenerator = new StandardCategoryItemLabelGenerator();
        categoryLabelGenerator.setFormatString("{2}");

        // Performing some operations with pieLabelGenerator
        String pieFormat = pieLabelGenerator.getFormatString();
        System.out.println("Pie Format: " + pieFormat);

        // Performing operations with categoryLabelGenerator
        String categoryFormat = categoryLabelGenerator.getFormatString();
        System.out.println("Category Format: " + categoryFormat);

        // Additional unrelated computations
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);

        // Complex operation with arrays
        int[][] matrix = {{1, 2}, {3, 4}};
        int product = 1;
        for (int[] row : matrix) {
            for (int element : row) {
                product *= element;
            }
        }
        System.out.println("Product of matrix elements: " + product);

        // Final read operation from the original pair
        /* read */ String formatString = labelGenerator.getFormatString();
        System.out.println("XY Format: " + formatString);
    }
}