import java.util.LinkedHashSet;
public class Main {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        int t = 7676; 
        int flag = t % 3; 
        /* unrelated add operations */
        set.add(10);
        set.add(20);
        if (flag < 2) {
            set.add(30);
        }
        set.add(40);
        /* write */
        if (t % 2 == 0) { 
            set.add(50);
        } else {
            set.add(60);
        }
        set.add(70);
        set.add(80);
        set.remove(10); 
        set.add(90);
        /* read */ int ret = 0;
        int count = 0;
        for (int num : set) {
            if (count == 2) { 
                ret = num;
                break;
            }
            count++;
        }
        System.out.println("Retrieved value: " + ret);
    }
}
