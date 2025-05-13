import com.google.common.collect.ImmutableBiMap;

public class Main {
    public static void main(String[] args) {
        // Create a BiMapBuilder and add an entry
        BiMapBuilder builder = new BiMapBuilder();
        builder.addEntry("key1", 1);

        // Build the ImmutableBiMap
        ImmutableBiMap<String, Integer> biMap = builder.build();

        // Create a BiMapReader to read from the ImmutableBiMap
        BiMapReader reader = new BiMapReader(biMap);
        Integer value = reader.getValue("key1");
        System.out.println("Value from biMap: " + value);

        // Create a Student object and print details
        Student student = new Student("Alice", 20, "Computer Science");
        System.out.println(student.getDetails());

        // Additional calculations
        int factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of 5: " + factorial);
    }
}