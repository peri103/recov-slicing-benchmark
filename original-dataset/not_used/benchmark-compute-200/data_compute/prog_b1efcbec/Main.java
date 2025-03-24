import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        int complexVar = 987654321;
        /* other operations */
        complexVar = complexVar / 2 - list.size();
        list.add(complexVar % 100);
        if (complexVar % 5 == 0) {
            list.add(50);
        }
        /* Intermediate unrelated logic */
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.set(i, list.get(i) + 1);
            }
        }
        int misleadingIndex = (complexVar + 5) % 3;
        /* Modify but irrelevant to read */
        if (misleadingIndex < list.size()) {
            list.remove(misleadingIndex);
        }
        /* write */
        list.add(1, 99);
        String dummyString = "test";
        for (int i = 0; i < dummyString.length(); i++) {
            dummyString += i;
        }
        dummyString = dummyString.replace("e", "a");
        /* other operations */
        int m = 7;
        int n = 3;
        int p = m * n + misleadingIndex; 
        /* read */ int ret = list.get(1);
        System.out.println("Retrieved value: " + ret); 
    }
}
