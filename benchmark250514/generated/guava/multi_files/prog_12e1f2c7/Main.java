public class Main {
    public static void main(String[] args) {
        // Create a ColorCounter instance
        ColorCounter colorCounter = new ColorCounter();
        
        // Add a color to the ColorCounter
        colorCounter.addColor(ColorCounter.Color.RED);

        // Create a FruitBasket instance
        FruitBasket fruitBasket = new FruitBasket();
        
        // Add fruits to the FruitBasket
        fruitBasket.addFruit("apple");
        fruitBasket.addFruit("banana");
        fruitBasket.addFruit("apple");
        fruitBasket.addFruit("orange");

        // Perform operations on the FruitBasket
        int appleCount = fruitBasket.getFruitCount("apple");
        System.out.println("Apple count: " + appleCount);

        // Read the count of the color added to the ColorCounter
        /* read */ int redCount = colorCounter.getColorCount(ColorCounter.Color.RED);

        // Print the count of the color
        System.out.println("Count of RED: " + redCount);

        // Print all fruits in the FruitBasket
        fruitBasket.printAllFruits();
    }
}