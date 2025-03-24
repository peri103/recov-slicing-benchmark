import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        User user = new User("John");
        user.storeData("example");

        HashSet<String> storedData = user.getStoredData();
        /* read */ boolean containsExample = storedData.contains("example");
        System.out.println("Does the stored data contain 'example'? " + containsExample);

        // Additional unrelated operations
        HashSet<Integer> numberSet = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            numberSet.add(i);
        }

        System.out.println("Number set size: " + numberSet.size());
    }
}