import java.util.Hashtable;
public class Main {
    public static void main(String[] args) {
        Hashtable<String, Integer> table = new Hashtable<>();
        table.put("one", 1);
        table.put("two", 2);
        table.put("three", 3);
        int someNumber = 5;
        table.put("four", 4 + someNumber); 
        someNumber *= 2; 
        if (someNumber % 2 == 0) {
            /* write */ table.put("readKey", 42); 
        } else {
            table.put("randomKey", 100); 
        }
        int anotherCalculation = (someNumber / 2) * 3; 
        table.put("five", 5);
        table.put("superfluous", someNumber + anotherCalculation);
        /* read */ int ret = table.get("readKey");
        System.out.println("Retrieved Value: " + ret);
    }
}
