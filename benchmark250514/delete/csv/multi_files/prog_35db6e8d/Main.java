public class Main {
    public static void main(String[] args) {
        // Configure CSV settings
        CSVConfiguration csvConfig = new CSVConfiguration();
        csvConfig.configure();

        // Handle CSV records
        CSVRecordHandler csvRecordHandler = new CSVRecordHandler();
        boolean isMapped = csvRecordHandler.isHeaderMapped("header1");
        System.out.println("Is 'header1' mapped: " + isMapped);

        // Create and display student details
        Student student = new Student("Alice", 20, "Computer Science");
        System.out.println(student.getDetails());

        // Simulate some data processing logic
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum of first 5 numbers: " + sum);
    }
}