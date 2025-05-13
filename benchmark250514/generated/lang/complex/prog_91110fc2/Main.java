import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import java.util.Calendar;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a Calendar instance and set a specific date
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.OCTOBER, 1); // October 1, 2023
        Date date = calendar.getTime();

        // Use DateUtils to set the day of the month
        /* write */ date = DateUtils.setDays(date, 15);

        // Additional unrelated code to increase complexity
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 3);
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);

        // Another Date operation
        calendar.set(2023, Calendar.NOVEMBER, 5);
        Date anotherDate = calendar.getTime();
        Date truncatedAnotherDate = DateUtils.truncate(anotherDate, Calendar.DAY_OF_MONTH);
        System.out.println("Truncated another date: " + truncatedAnotherDate);

        // Use DateUtils to truncate the date to the start of the day
        /* read */ Date truncatedDate = DateUtils.truncate(date, Calendar.DAY_OF_MONTH);

        // Print the truncated date
        System.out.println("Truncated date: " + truncatedDate);

        // Additional logic to further increase complexity
        ArrayList<String> words = new ArrayList<>();
        words.add("Hello");
        words.add("World");
        words.add("Complex");
        words.add("Program");

        StringBuilder builder = new StringBuilder();
        for (String word : words) {
            builder.append(word).append(" ");
        }
        System.out.println("Concatenated words: " + builder.toString().trim());
    }
}