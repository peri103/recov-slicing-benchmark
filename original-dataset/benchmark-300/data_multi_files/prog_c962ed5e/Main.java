import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user = new User("JohnDoe");
        user.addData("importantData");
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }
        /* read */ boolean dataExists = user.checkData("importantData");
        System.out.println("Data exists: " + dataExists);
    }
}