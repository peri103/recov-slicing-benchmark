import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a student and add details
        Student student = new Student("Alice");
        student.addDetail("age", "20");
        student.addDetail("major", "Computer Science");
        
        System.out.println("Student: " + student.getName());
        System.out.println("Age: " + student.getDetail("age"));
        System.out.println("Major: " + student.getDetail("major"));

        // Create a DataContainer and write data
        DataContainer dataContainer = new DataContainer();
        dataContainer.writeData("key", 42);

        // Perform additional operations
        HashMap<String, String> additionalDetails = new HashMap<>();
        additionalDetails.put("hobby", "Reading");
        additionalDetails.put("favoriteColor", "Blue");

        for (String key : additionalDetails.keySet()) {
            System.out.println(key + ": " + additionalDetails.get(key));
        }

        // Read the data from the DataContainer
        /* read */ Integer value = dataContainer.readData("key");

        // Output the value
        System.out.println("Read value: " + value);
    }
}