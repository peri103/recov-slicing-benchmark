public class Main {
    public static void main(String[] args) {
        FruitTokenizer fruitTokenizer = new FruitTokenizer("apple,banana,orange");
        FruitInventory fruitInventory = new FruitInventory();

        fruitInventory.printFruitCount();

        fruitTokenizer.setDelimiter(",");

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i * i;
        }
        System.out.println("Sum of squares from 0 to 9: " + sum);

        StringBuilder sb = new StringBuilder();
        for (String fruit : fruitInventory.fruitsList) {
            sb.append(fruit.toUpperCase()).append(" ");
        }
        System.out.println("Uppercase fruits: " + sb.toString().trim());

        /* read */ String token = fruitTokenizer.getNextToken();
        System.out.println("First token: " + token);

        fruitInventory.updateFruits();
        fruitInventory.printFruitsList();
    }
}