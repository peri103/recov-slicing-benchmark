public class Main {
    public static void main(String[] args) {
        MultiKeyValueStore store = new MultiKeyValueStore();
        Course course = new Course("Computer Science");

        course.addStudent("001", "Alice");
        course.addStudent("002", "Bob");
        course.displayStudents();

        store.putValue("key1", "key2", 42);

        // Adding more values to the store
        store.putValue("key3", "key4", 84);
        store.putValue("key5", "key6", 126);

        // Performing operations on the store
        Integer retrievedValue1 = store.getValue("key3", "key4");
        System.out.println("Retrieved Value 1: " + retrievedValue1);

        Integer retrievedValue2 = store.getValue("key5", "key6");
        System.out.println("Retrieved Value 2: " + retrievedValue2);

        /* read */ Integer originalValue = store.getValue("key1", "key2");
        System.out.println("Original Value from write-read pair: " + originalValue);
    }
}