import java.util.Stack;

public class ParenthesesBalance {
    private static final char LEFT_SQUARE = '[';
    private static final char LEFT_CURLY = '{';
    private static final char LEFT_BRACKET = '(';
    private static final char RIGHT_SQUARE = ']';
    private static final char RIGHT_CURLY = '}';
    private static final char RIGHT_BRACKET = ')';

    public static boolean getParenthesisBalance(String s) {
        Stack<Character> stack = new Stack<>();
        s = s.trim();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == LEFT_SQUARE ||
                    s.charAt(i) == LEFT_CURLY ||
                    s.charAt(i) == LEFT_BRACKET) stack.push(s.charAt(i));

            if (s.charAt(i) == RIGHT_SQUARE) {
                if (stack.isEmpty()) return false;
                if (stack.pop() != LEFT_SQUARE) return false;
            } else if (s.charAt(i) == RIGHT_CURLY) {
                if (stack.isEmpty()) return false;
                if (stack.pop() != LEFT_CURLY) return false;
            } else if (s.charAt(i) == RIGHT_BRACKET) {
                if (stack.isEmpty()) return false;
                if (stack.pop() != LEFT_BRACKET) return false;
            }
        }
        return stack.isEmpty();
    }
}
