public class Main {
    public static void main(String[] args) {
        FruitInventory inventory = new FruitInventory();
        FruitMarket market = new FruitMarket();

        // Add fruits to inventory
        inventory.addFruit("apple");
        inventory.addFruit("banana");
        
        // Add fruits to market
        market.addFruitToMarket("banana", 2);
        market.addFruitToMarket("orange", 3);

        // Perform some operations
        int bananaMarketCount = market.getMarketFruitCount("banana");
        System.out.println("Market Banana count: " + bananaMarketCount);

        // Calculate total fruits
        int totalBananas = bananaMarketCount + inventory.getFruitCount("banana");
        System.out.println("Total Banana count: " + totalBananas);

        // Read apple count from inventory
        /* read */ int appleCount = inventory.getFruitCount("apple");
        System.out.println("Inventory Apple count: " + appleCount);
    }
}