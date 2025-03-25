import java.util.EnumMap;
import java.util.Map;
public class Main {
    enum Day { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY }
    public static void main(String[] args) {
        EnumMap<Day, Integer> map = new EnumMap<>(Day.class);
        for (Day day : Day.values()) {
            map.put(day, day.ordinal());
        }
        int control = (int)(Math.random() * 10);
        Day targetDay = Day.MONDAY; 
        if (control % 2 == 0) {
            targetDay = Day.WEDNESDAY;
        }

        map.put(Day.FRIDAY, 100);
        map.remove(Day.SATURDAY);
        map.put(Day.SUNDAY, -3);
        /* write */ map.put(Day.WEDNESDAY, 42);
        System.out.println(map.get(Day.THURSDAY));
        System.out.println(map.getOrDefault(Day.SATURDAY, -1));
        map.put(Day.MONDAY, map.get(Day.MONDAY) + 10);
        map.put(Day.TUESDAY, 999);
        /* read */ int ret = map.get(targetDay);
        System.out.println("Retrieved value: " + ret);
    }
}
