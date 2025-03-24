import java.util.EnumMap;
import java.util.Map;
public class Main {
    enum Day { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY; }
    public static void main(String[] args) {
        EnumMap<Day, Integer> map = new EnumMap<>(Day.class);
        map.put(Day.MONDAY, 0);
        map.put(Day.TUESDAY, 2);
        map.put(Day.WEDNESDAY, 4);
        map.put(Day.THURSDAY, 6);
        int randomFactor = 1234 * 4321 + 777 + 888 + 999;
        Day selectedDay = (randomFactor % 2 == 0) ? Day.FRIDAY : Day.SUNDAY;
        if (randomFactor % 2 == 0) {
            map.put(Day.FRIDAY, 10);
        }
        map.put(Day.WEDNESDAY, 0);  
        map.put(Day.THURSDAY, 0);   
        /* write */ map.put(selectedDay, 20);
        if (map.containsKey(Day.MONDAY)) {
            map.put(Day.MONDAY, 100);
        }
        map.put(Day.SATURDAY, 30);
        /* read */ int ret = map.get(selectedDay);
        System.out.println("Value read: " + ret);
    }
}