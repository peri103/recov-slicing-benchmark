public class Main {
    public static void main(String[] args) {
        // Create an instance of EnumValueMap and perform write operation
        EnumValueMap enumValueMap = new EnumValueMap();
        enumValueMap.putValue(ExampleEnum.VALUE_ONE, "ExampleValue");

        // Create a Course object and add student scores
        Course course = new Course("Mathematics");
        course.addStudentScore("Alice", 95);
        course.addStudentScore("Bob", 88);

        // Display all student scores
        course.displayScores();

        // Perform read operation on EnumValueMap
        /* read */ String retrievedValue = enumValueMap.getValue(ExampleEnum.VALUE_ONE);
        System.out.println("Retrieved value from EnumValueMap: " + retrievedValue);

        // Additional logic to demonstrate complexity
        int aliceScore = course.getStudentScore("Alice");
        System.out.println("Alice's score in Mathematics: " + aliceScore);
    }
}