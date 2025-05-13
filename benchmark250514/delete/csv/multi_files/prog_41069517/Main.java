public class Main {
    public static void main(String[] args) {
        String csvData = "name,age\nJohn,30\nJane,25";
        CSVHandler csvHandler = new CSVHandler(csvData);

        // Simulate some complex operations
        int sumOfAges = 0;
        for (int age : csvHandler.getAgesList()) {
            sumOfAges += age;
        }
        System.out.println("Sum of ages: " + sumOfAges);

        // Additional logic
        String sampleName = "John";
        if (csvHandler.getNamesList().contains(sampleName)) {
            System.out.println(sampleName + " is in the list.");
        }

        // More unrelated operations
        for (String name : csvHandler.getNamesList()) {
            System.out.println("Processing name: " + name);
        }

        // Check if a specific header is mapped
        CSVRecord firstRecord = csvHandler.getFirstRecord();
        /* read */
        boolean isMapped = firstRecord.isMapped("name");
        System.out.println("Is 'name' mapped: " + isMapped);
    }
}