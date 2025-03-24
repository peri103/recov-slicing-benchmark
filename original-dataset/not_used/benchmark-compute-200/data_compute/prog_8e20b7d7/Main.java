import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        /* other operations */
        int misleadingIndex = 999 % 3; 
        list.remove(misleadingIndex); 
        int k = list.size(); 
        if ((k * 3) % 5 == 1) {
            /* write */ list.add(3);
        } else {
            list.add(4);
        }
        list.add(5); 
        /* other operations */
        for (int i = 0; i < 2; i++) {
            list.add(i + 6);
        }
        /* other operations */
        boolean shouldDoMoreAdditions = list.get(3) > 5; 
        if (shouldDoMoreAdditions) {
            list.add(15);
            list.add(20);
        }
        /* read */ int ret = list.get(2); 
        System.out.println("Retrieved value: " + ret); 
    }
}