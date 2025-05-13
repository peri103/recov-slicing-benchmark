public class Main {
    public static void main(String[] args) {
        CustomMap customMap = new CustomMap();
        customMap.addEntry("key", 42);

        DataProcessor processor = new DataProcessor(customMap);
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            customMap.addEntry("key" + i, i * 10);
            sum += processor.getValue("key" + i);
        }
        
        System.out.println("Sum of dynamic keys: " + sum);

        /* read */ int value = processor.getValue("key");
        System.out.println("Value for 'key': " + value);
    }
}