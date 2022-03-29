package Stack;

import java.util.Stack;

public class backspaceStringCompare {
    public boolean backspaceCompare(String s, String t) {

        return build(s).equals(build(t));

    }

    public String build(String S) {
        Stack<Character> st = new Stack();
        for (char ch : S.toCharArray()) {
            if (ch != '#') {
                st.push(ch);
            } else if (!st.isEmpty()) {
                st.pop();
            }
        }
        return String.valueOf(st);
    }

    public static void main(String[] args) {
        String a = "a#bdc#e";
        backspaceStringCompare o = new backspaceStringCompare();
        System.out.println(o.backspaceCompare(a, "bde"));
    }
}
