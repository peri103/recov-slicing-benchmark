import com.google.common.collect.ImmutableBiMap;

public class Main {
    public static void main(String[] args) {
        BiMapBuilder biMapBuilder = new BiMapBuilder();
        biMapBuilder.addEntry("one", 1);

        DataStructures dataStructures = new DataStructures();
        dataStructures.manipulateData();
        dataStructures.printData();

        ImmutableBiMap<String, Integer> biMap = biMapBuilder.build();

        int sum = 0;
        for (Integer value : biMap.values()) {
            sum += value;
        }
        System.out.println("Sum of values in biMap: " + sum);

        /* read */ Integer value = biMap.get("one");
        System.out.println(value);
    }
}