import java.util.Stack;

public class StackQuestion {
    public static void main(String[] args)
    {
        Stack<String> J=new Stack<>();
        J.push("Narendra");
        J.push("Vishnu");
        J.push("Varma");
        J.push("Kamparaju");
        System.out.println(J);
        String narnedra = J.pop();
        System.out.println(J);
        J.remove(2);
        System.out.println(J);
    }
}
