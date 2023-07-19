import java.util.Stack;

public class InfixToPostfix {

    public static String convertInfixtoPostfix(String s) {
        Stack<Character> ops = new Stack<>();
        StringBuilder sb = new StringBuilder();
        char[] arr = s.replaceAll("\\s+", "").toCharArray();

        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            if (Character.isDigit(ch)) sb.append(ch);
            if (ch == '(') ops.push(ch);
            if (ch == ')') {
                while (ops.peek() != '(') {
                    sb.append(ops.pop());
                }
                ops.pop();
            }
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
//                while (!ops.isEmpty()) {
                if (operatorsPriority(ops.peek()) >= operatorsPriority(ch)) {
                    sb.append(ops.pop());
                }
//                }
                ops.push(ch);
            }
        }

        while (!ops.isEmpty()) {
            sb.append(ops.pop());
        }
        return sb.toString();
    }

    public static int operatorsPriority(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        String s = "((1 + (2 * 3)) + 4)";
        System.out.println(convertInfixtoPostfix(s));
    }
}
