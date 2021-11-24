package _20_easy;

import java.util.Stack;

class Solution {
  public boolean isValid(String s) {
    char[] arr = s.toCharArray();
    Stack<Character> stack = new Stack<>();

    for (char c : arr) {
      if (c == '(' || c == '{' || c == '[') {
        stack.push(c);
      } else if (stack.isEmpty()) {
        return false;
      } else {
        if (c == ')' && stack.pop() != '(') {
          return false;
        }
        if (c == '}' && stack.pop() != '{') {
          return false;
        }
        if (c == ']' && stack.pop() != '[') {
          return false;
        }
      }
    }

    return stack.isEmpty();
  }
}