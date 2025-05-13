import org.apache.commons.csv.CSVRecord;

public class Main {
    public static void main(String[] args) {
        // Using CSVFormatWrapper
        CSVFormatWrapper formatWrapper = new CSVFormatWrapper();
        formatWrapper.applyIgnoreHeaderCase();

        // Dummy CSVRecord object for demonstration
        CSVRecord record = new CSVRecord() {
            @Override
            public boolean isMapped(String name) {
                return true; // Simulate the record being mapped
            }
        };

        // Using CSVRecordWrapper
        CSVRecordWrapper recordWrapper = new CSVRecordWrapper(record);
        boolean isMapped = recordWrapper.checkHeaderMapped("headerName");
        System.out.println("Is header mapped: " + isMapped);

        // Student information
        Student student = new Student("Alice", "30", "alice@example.com");
        student.printInfo();
    }
}