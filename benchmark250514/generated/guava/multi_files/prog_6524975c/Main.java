public class Main {
    public static void main(String[] args) {
        DataManager dataManager = new DataManager();

        // Adding string entries
        dataManager.addStringEntry("hello", "world");
        dataManager.addStringEntry("foo", "bar");

        // Printing string entries
        System.out.println("String Entries:");
        System.out.println("hello = " + dataManager.getStringEntry("hello"));
        System.out.println("foo = " + dataManager.getStringEntry("foo"));

        // Adding integer entries
        dataManager.addIntegerEntry("key", 42);

        // Getting and printing integer entry
        Integer value = dataManager.getIntegerEntry("key");
        System.out.println("Integer Entry:");
        System.out.println("key = " + value);

        // Additional computations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 natural numbers: " + sum);
    }
}