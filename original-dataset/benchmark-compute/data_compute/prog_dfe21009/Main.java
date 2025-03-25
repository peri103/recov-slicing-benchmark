import java.util.concurrent.CopyOnWriteArrayList;
public class Main {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> cowList = new CopyOnWriteArrayList<>();
        int initialCapacity = 5;
        for (int i = 0; i < initialCapacity; i++) {
            cowList.add(i * 10);
        }
        /* Complex block that obfuscates write */
        boolean toggle = true;
        if (toggle) {
            cowList.add(55); 
        }
        toggle = !toggle;
        cowList.remove((Integer) 10); 
        if (!toggle) {
            /* write */ cowList.add(42);
        }
        int dummyValue = 1000; 
        for (int i = 0; i < cowList.size(); i++) {
            if (i == 2) {
                dummyValue = cowList.get(i);
            }
        }
        cowList.addFirst(17); 
        cowList.addLast(33);  
        int index = 1;
        cowList.add(index, 12); 
        /* Several operations that do not affect the read point */
        cowList.clear(); 
        cowList.add(100);
        cowList.add(200);
        cowList.add(300);
        /* Ensure the read point executes after all potential changes */
        cowList.add(index, 25); 
        cowList.add(index + 2, 15); 
        /* read */ int ret = cowList.get(1);
        System.out.println("Retrieved value: " + ret);
    }
}