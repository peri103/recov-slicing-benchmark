public class Main {
    public static void main(String[] args) {
        Store store = new Store("Fresh Fruits");
        store.stockFruit("apple", 10);
        store.addAdditionalStock("banana", 5);

        int bananaStock = store.getAdditionalStock("banana");
        System.out.println("Additional banana stock: " + bananaStock);

        /* read */ int appleCount = store.getFruitCount("apple");
        System.out.println("Count of apple in inventory: " + appleCount);

        int orangeStock = store.getAdditionalStock("orange");
        System.out.println("Additional orange stock: " + orangeStock);
    }
}