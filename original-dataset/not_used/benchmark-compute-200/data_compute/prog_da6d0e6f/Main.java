import java.util.EnumMap;
import java.util.Map;
public class Main {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
    public static void main(String[] args) {
        Map<Day, Integer> weekMap = new EnumMap<>(Day.class);
        for (Day day : Day.values()) {
            weekMap.put(day, 0);
        }
        int misleadingVal = complexCalculation();
        if (misleadingVal % 2 == 0) {
            /* other write */ weekMap.put(Day.MONDAY, 100);
        } else {
            /* write */ weekMap.put(Day.WEDNESDAY, 25);
        }
        misleadingModifications(weekMap);
        weekMap.put(Day.FRIDAY, 1000); 
        /* read */ int ret = weekMap.get(Day.WEDNESDAY);
        System.out.println("The value retrieved is: " + ret);
    }
    private static int complexCalculation() {
        int result = 0;
        for (int i = 0; i < 100; i++) {
            result += (i * i - i) % 7; 
        }
        return result;
    }
    private static void misleadingModifications(Map<Day, Integer> map) {
        map.put(Day.TUESDAY, 200); 
        map.put(Day.THURSDAY, 300); 
        map.remove(Day.SATURDAY); 
        map.put(Day.SUNDAY, 500);
        map.remove(Day.SUNDAY);
    }
}