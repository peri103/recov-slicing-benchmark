import java.util.*;
class RobotWithString {

	public String robotWithString(String s) {
		int[] min = new int[s.length()];
		for (int i = s.length() - 1; i > 0; i--) {
			min[i - 1] = Math.min(s.charAt(i), i < s.length() - 1 ? min[i] : 'z');
		}
		StringBuilder sb = new StringBuilder();
		ArrayDeque<Character> deque = new ArrayDeque<>();
		for (int i = 0; i < s.length(); i++) {
			for (deque.push(s.charAt(i)); !deque.isEmpty() && deque.peek() <= min[i];) {
				sb.append(deque.pop());
			}
		}
		while (!deque.isEmpty()) {
			sb.append(deque.pop());
		}
		return sb.toString();
	}
	 public static void main(String[] args) {
        RobotWithString robotWithString = new RobotWithString();
        
        String s = "bac";
        
        String result = robotWithString.robotWithString(s);
        
        System.out.println("Resulting string: " + result);
    }
}