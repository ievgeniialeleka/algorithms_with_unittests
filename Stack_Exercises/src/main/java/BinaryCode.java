import java.util.Stack;

public class BinaryCode {

    public static int decimalToBinary(int n) {
        Stack<Integer> stack = new Stack<>();
        String temp = "";

        while (n > 0) {
            stack.push(n % 2);
            n = n / 2;
        }

        while(!stack.isEmpty()) {
            //System.out.print(stack.pop());
            temp += stack.pop();
        }
        return Integer.parseInt(temp);
    }
    public static void main(String[] args) {
        System.out.println(decimalToBinary(0));
    }
}
