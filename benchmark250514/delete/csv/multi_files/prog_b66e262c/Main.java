public class Main {
    public static void main(String[] args) {
        // Initialize CSV handler
        String csvData = "Name, Age\nJohn, 30\nJane, 25";
        CSVHandler csvHandler = new CSVHandler(csvData);

        // Process data
        DataProcessor dataProcessor = new DataProcessor();
        dataProcessor.printNames();
        int sum = dataProcessor.calculateSum();
        System.out.println("Sum of numbers from 1 to 10 is: " + sum);
        dataProcessor.printNumbers();

        // Read comment from CSV
        CSVRecord record = csvHandler.getFirstRecord();
        /* read */ String comment = record.getComment();
        System.out.println("CSV Comment: " + comment);
    }
}