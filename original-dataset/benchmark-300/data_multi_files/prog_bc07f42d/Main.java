public class Main {
    public static void main(String[] args) {
        NumberSet numberSet = new NumberSet();
        int randomNumber = RandomNumberGenerator.generateRandomNumber(100);
        numberSet.addNumber(randomNumber);
        System.out.println("Added random number: " + randomNumber);

        /* write */ numberSet.addNumber(42);
        System.out.println("Added number 42 to the set");

        for (int i = 0; i < 10; i++) {
            int num = RandomNumberGenerator.generateRandomNumber(100);
            numberSet.addNumber(num);
            System.out.println("Added number " + num + " to the set");
        }

        /* read */ boolean containsValue = numberSet.containsNumber(42);
        System.out.println("Set contains 42: " + containsValue);

        System.out.println("All elements in the set:");
        numberSet.printSet();

        int searchNumber = RandomNumberGenerator.generateRandomNumber(100);
        boolean containsSearchNumber = numberSet.containsNumber(searchNumber);
        System.out.println("Set contains " + searchNumber + ": " + containsSearchNumber);
    }
}