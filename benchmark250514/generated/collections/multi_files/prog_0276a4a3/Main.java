import java.util.Collection;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.multimap.TransformedMultiValuedMap;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        student1.addScore(95);
        student2.addScore(88);

        Course course = new Course("Math");
        course.addStudent(student1);
        course.addStudent(student2);

        course.printStudentScores();

        // Define a simple transformer that returns the input value as is
        Transformer<String, String> transformer = new Transformer<String, String>() {
            public String transform(String input) {
                return input;
            }
        };

        // Create a MultiValuedMap and wrap it with a TransformedMultiValuedMap
        MultiValuedMap<String, String> originalMap = new ArrayListValuedHashMap<>();
        TransformedMultiValuedMap<String, String> transformedMap = TransformedMultiValuedMap.transformedMap(originalMap, null, transformer);

        // Use the write method on the transformedMap
        transformedMap.put("key", "value");

        // Perform additional operations
        for (String key : transformedMap.keySet()) {
            Collection<String> values = transformedMap.get(key);
            for (String value : values) {
                System.out.println("TransformedMap Key: " + key + ", Value: " + value);
            }
        }

        // Use the read method on the transformedMap
        /* read */ Collection<String> values = transformedMap.get("key");

        // Print the values to verify the read operation
        for (String value : values) {
            System.out.println(value);
        }
    }
}