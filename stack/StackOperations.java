package com.practice.stack;

public class StackOperations {

    private static final int MAX_NUMBER_OF_ELEMENTS = 10;

    public static void push(Stack stack, int element) {

        if(stack.getTop() == MAX_NUMBER_OF_ELEMENTS - 1) {
            throw new RuntimeException("Stack overflow exception");
        } else {
            stack.setTop(stack.getTop() + 1);

            if(stack.getStack() == null ) {
                int[] array = new int[MAX_NUMBER_OF_ELEMENTS];
                stack.setStack(array);
            }

            stack.getStack()[stack.getTop()] = element;
        }
    }

    public static int pop(Stack stack) {
        if (stack.getTop() == -1) {
            throw new RuntimeException("Stack empty exception nothing to pop");
        } else {
            int poppedElement = stack.getStack()[stack.getTop()];
            stack.setTop(stack.getTop() - 1);
            return poppedElement;
        }
    }

    public static void display(Stack stack) {
        if(stack.getTop() == -1) {
            throw new RuntimeException("Stack empty exception nothing to display");
        } else {
            System.out.println("Elements in the stack are");
            for (int i=0; i <= stack.getTop(); i++) {
                System.out.print(stack.getStack()[i] + " ");
            }
            System.out.println();
        }

    }
}
