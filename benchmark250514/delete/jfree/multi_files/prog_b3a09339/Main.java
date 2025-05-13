public class Main {
    public static void main(String[] args) {
        DataHandler dataHandler = new DataHandler();

        // Initialize datasets
        dataHandler.initializePieDataset();

        // Additional unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // Use another dataset
        dataHandler.initializeCategoryDataset();
        
        // More complex operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of first 5 numbers: " + product);

        // Retrieve dataset
        CustomPlot plot = dataHandler.getPlot();
        /* read */ Dataset retrievedDataset = plot.getDataset();
        System.out.println("Retrieved dataset: " + retrievedDataset);
    }
}