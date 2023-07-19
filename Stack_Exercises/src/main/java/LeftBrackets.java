import java.util.Stack;

public class LeftBrackets {

    public static String setLeftBrackets(String s) {
        Stack<String> stack = new Stack<>();
        s = s.replaceAll("\\s+", "");

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != ')') {
                stack.push(String.valueOf(s.charAt(i)));
            } else {
                String param3 = stack.pop();
                String param2 = stack.pop();
                String param1 = stack.pop();

                stack.push("(" + param1 + param2 + param3 + ")");
            }
        }
        return stack.pop();
    }
}
