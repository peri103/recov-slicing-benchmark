import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Initial"); 
        int conditionValue = (int) (Math.random() * 10) % 2;
        String unrelatedString = "Nothing here";
        int unrelatedComputation = conditionValue * 100 + 50;
        if (conditionValue == 1) {
            map.put(2, "FakeEntry");
            map.put(3, "Mislead");
        } else {
            map.put(4, "Diversion");
        }
        manipulateData(map);
        map.get(2);
        map.get(3);
        map.put(5, unrelatedString + unrelatedComputation);
        if (unrelatedString.length() > 5) {
            /* write */ map.put(1, "Value at 1");
        }
        System.out.println("Before Read");
        /* read */ String ret = map.get(1);
        System.out.println("Read value: " + ret);
    }
    private static void manipulateData(HashMap<Integer, String> map) {
        map.put(6, "ManipulateMe");
        map.put(7, "AnotherOne");
        String temp = map.get(7);
        if (temp != null) {
            map.put(8, "IgnoreMe");
        }
        map.remove(6);
    }
}