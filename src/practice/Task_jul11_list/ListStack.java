package practice.Task_jul11_list;

import java.util.Stack;

public class ListStack {
    public static void main(String[] args) {
        Stack s= new Stack();
        s.add("python");
        s.add("Java");
        s.add("C#");

        System.out.println(s.peek());
        System.out.println(s.pop());

        s.push(".net");

        System.out.println(s);
    }
}
