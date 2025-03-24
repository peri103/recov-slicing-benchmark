import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        int secretKey = 42;
        for (int i = 0; i < 100; i++) {
            map.put(i, "Value" + i);
        }
        int decoyKey = 99;
        if ((long)secretKey * 3 % 10 < 7) {
            map.put(secretKey, "TargetValue");
        } else {
            map.put(secretKey, "WrongValue");
        }
        int throwaway = secretKey * 7 + decoyKey;
        map.remove(decoyKey);
        map.put(decoyKey, "Decoy");
        map.put(77, "Irrelevant");
        if ((throwaway % 5 == 3) || (decoyKey < 50)) {
            /* write */ map.put(secretKey, "CorrectValue");
        } else {
            map.put(88, "Dummy");
        }
        map.putIfAbsent(200, "NewValue");
        if (map.containsKey(50)) {
            map.remove(50);
        }
        map.forEach((k, v) -> System.out.println(k + ": " + v));
        /* read */ String ret = map.get(secretKey);
        System.out.println("Retrieved: " + ret);
    }
}
