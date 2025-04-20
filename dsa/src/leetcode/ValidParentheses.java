package leetcode;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(int i = 0; i<s.length(); i++) {
            char bracket = s.charAt(i);
            if(bracket == '(' || bracket == '{' || bracket == '[') {
                st.push(bracket);
            } else {
                if(st.empty()) return false;

                char top = st.peek();

                if((top == '(' && bracket == ')') ||
                        (top == '{' && bracket == '}') ||
                        (top == '[' && bracket == ']') ) {
                    st.pop();
                } else {
                    return false;
                }

            }
        }

        return st.empty();
    }
}
