import java.util.Stack;
class one{
    public static void main(String[] args) {
        String str = "hello";
        Stack<Character> stack = new Stack<>();
        for(char ch : str.toCharArray()){
            stack.push(ch);

        }
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }

    }
}
