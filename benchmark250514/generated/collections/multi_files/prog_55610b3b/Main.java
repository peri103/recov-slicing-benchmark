public class Main {
    public static void main(String[] args) {
        DataStorage dataStorage = new DataStorage();
        FruitCounter fruitCounter = new FruitCounter();

        // Initialize fruit counts
        fruitCounter.addFruit("apple", 5);
        fruitCounter.addFruit("banana", 3);
        fruitCounter.addFruit("orange", 10);

        // Update fruit counts
        fruitCounter.addFruit("banana", 1);
        fruitCounter.addFruit("grape", 7);
        fruitCounter.addFruit("apple", 2);

        // Print total fruits
        System.out.println("Total count of fruits: " + fruitCounter.getTotalFruits());

        // Store and retrieve data
        dataStorage.storeData("key", "value");

        // Simulate some operations
        for (int i = 0; i < 1000; i++) {
            if (i % 2 == 0) {
                dataStorage.storeData("tempKey" + i, "tempValue" + i);
            }
        }

        /* read */ String value = dataStorage.retrieveData("key");
        System.out.println("Retrieved value from map: " + value);

        // Print fruit counts
        fruitCounter.printFruitCounts();
    }
}