package com.practice.stack;

import java.util.Stack;
import java.util.List;
import java.util.Scanner;

public class Parenthesis {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any expressions of your choice:");

        while (sc.hasNext()) {
            String input=sc.next();
            boolean isBalanced = true;

            // System.out.println(input);
            Stack<Character> stack = new Stack<>();

            char[] charArray = input.toCharArray();
            if(charArray.length%2 != 0) {
                // System.out.println(charArray.length%2);
                isBalanced = false;
            } else {
                for(int i=0; i<charArray.length; i++) {

                    if(charArray[i] == '{' || charArray[i] == '[' || charArray[i] == '(') {
                        stack.push(charArray[i]);
                    } else if(charArray[i] == '}' || charArray[i] == ']' || charArray[i] == ')') {
                        if(stack.isEmpty()) {
                            isBalanced = false;
                            stack.push(charArray[i]);
                            // System.out.println(charArray[i]);
                        } else {
                            isBalanced = matchFunction(stack.pop(), charArray[i]);
                            if(isBalanced == false) {
                                stack.push(charArray[i]);
                            }
                        }

                    }

                }
                // System.out.println(isBalanced);


            }
            if(stack.isEmpty() && isBalanced) {
                System.out.println("Parenthesis is balanced.");
            } else {
                System.out.println("Parenthesis is not balanced. Mismatch found.");
            }


        }
    }

    private static boolean matchFunction(char popped, char input) {
        if(input == ']' && popped == '[') {
            return true;
        } else if(input == '}' && popped == '{') {
            return true;
        } else if(input == ')' && popped == '(') {
            return true;
        } else {
            return false;
        }
    }
}

/*
Enter any expressions of your choice:
{}
Parenthesis is balanced.
]]
Parenthesis is not balanced. Mismatch found.
{{[[]]))
Parenthesis is not balanced. Mismatch found.
{{{{}}}}[[]]()
Parenthesis is balanced.
[
Parenthesis is not balanced. Mismatch found.
]
Parenthesis is not balanced. Mismatch found.
[]
Parenthesis is balanced.
()]
Parenthesis is not balanced. Mismatch found.
 */
