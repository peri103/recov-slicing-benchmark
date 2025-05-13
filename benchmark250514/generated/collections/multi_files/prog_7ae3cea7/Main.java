public class Main {
    public static void main(String[] args) {
        DataProcessor processor = new DataProcessor();
        processor.processData();

        int sum = processor.getSumOfValues("anotherKey");
        System.out.println("Sum of values for 'anotherKey': " + sum);

        /* read */ Integer value = processor.getValue("key");
        System.out.println("Read value: " + value);
    }
}