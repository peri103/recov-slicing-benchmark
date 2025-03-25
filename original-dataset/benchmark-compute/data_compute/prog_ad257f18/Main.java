import java.util.EnumMap;
public class Main {
    enum TrafficLight {
        RED, GREEN, YELLOW
    }
    public static void main(String[] args) {
        EnumMap<TrafficLight, String> map = new EnumMap<>(TrafficLight.class);
        map.put(TrafficLight.RED, "Stop");
        map.put(TrafficLight.GREEN, "Go");
        map.put(TrafficLight.YELLOW, "Caution");
        int computation = 42 * 19 + 7; 
        boolean condition = computation % 5 == 0; 
        if (condition) {
            map.remove(TrafficLight.RED);
            map.put(TrafficLight.RED, "Halt");
        } else {
            map.remove(TrafficLight.GREEN);
            map.put(TrafficLight.GREEN, "GoSteady");
        }
        String temp = map.get(TrafficLight.YELLOW);
        map.put(TrafficLight.YELLOW, temp + "!");
        if (map.containsKey(TrafficLight.RED)) {
            /* write */ map.put(TrafficLight.YELLOW, "SlowDown");
        }
        for (TrafficLight light : TrafficLight.values()) {
            map.put(light, map.get(light) + " Alert");
        }
        /* read */ String ret = map.get(TrafficLight.YELLOW);
        System.out.println("Output: " + ret);
    }
}
