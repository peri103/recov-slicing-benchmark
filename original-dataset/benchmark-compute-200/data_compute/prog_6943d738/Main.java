import java.util.concurrent.CopyOnWriteArraySet;
public class Main {
    public static void main(String[] args) {
        CopyOnWriteArraySet<Integer> dataSet = new CopyOnWriteArraySet<>();
        dataSet.add(10); 
        int x = 10;
        int y = 20;
        for (int i = 0; i < 5; i++) {
            dataSet.add(i); 
        }
        x = (x + y) % 3;
        for (int i = 3; i < 8; i++) {
            if (i % 2 == 0) 
                dataSet.add(i * (y % 2));
            else
                dataSet.add(i / x);
        }
        dataSet.add(100);
        if (dataSet.contains(1)) {
            x *= 2;
        } else {
            y *= 2;
        }
        int complexValue = x * y + 100;
        for (int element : dataSet) {
            if (element % complexValue == 0) {
                dataSet.add(element / y);
            }
        }
        if (complexValue % 3 == 0) {
            /* write */ dataSet.add(999);
        } else {
            dataSet.add(888);
        }
        dataSet.add(dataSet.size());
        int check = complexValue % 5;
        Integer[] array = dataSet.toArray(new Integer[0]);
        /* read */ int ret = array[array.length - 2];
        System.out.println("Read value: " + ret);
    }
}