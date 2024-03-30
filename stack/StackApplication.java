package com.practice.stack;

import java.util.Scanner;

public class StackApplication {

    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner sc = new Scanner(System.in);

        stack.setTop(-1);

        while(true) {

            System.out.println("Select the operation that you need to carry: \n" +
                    "1: PUSH \n" +
                    "2: POP \n" +
                    "3: DISPLAY \n" +
                    "4: END \n"

            );

            int query = sc.nextInt();
            switch (query) {
                case 1:
                    System.out.println("Enter the element that needs to be pushed to the stack: ");
                    int element = sc.nextInt();
                    StackOperations.push(stack, element);
                    break;

                case 2:
                    int poppedElement = StackOperations.pop(stack);
                    System.out.println("Popped element from stack " + poppedElement);
                    break;

                case 3:
                    StackOperations.display(stack);
                    break;

                case 4:
                    System.exit(1);
            }
        }
    }
}

/*

    Select the operation that you need to carry:
    1: PUSH
    2: POP
    3: DISPLAY
    4: END

    1
    Enter the element that needs to be pushed to the stack:
    10
    Select the operation that you need to carry:
    1: PUSH
    2: POP
    3: DISPLAY
    4: END

    1
    Enter the element that needs to be pushed to the stack:
    20
    Select the operation that you need to carry:
    1: PUSH
    2: POP
    3: DISPLAY
    4: END

    1
    Enter the element that needs to be pushed to the stack:
    30
    Select the operation that you need to carry:
    1: PUSH
    2: POP
    3: DISPLAY
    4: END

    3
    Elements in the stack are
    10 20 30
    Select the operation that you need to carry:
    1: PUSH
    2: POP
    3: DISPLAY
    4: END

    1
    Enter the element that needs to be pushed to the stack:
    50
    Select the operation that you need to carry:
    1: PUSH
    2: POP
    3: DISPLAY
    4: END

    3
    Elements in the stack are
    10 20 30 50
    Select the operation that you need to carry:
    1: PUSH
    2: POP
    3: DISPLAY
    4: END

    2
    Popped element from stack 50
    Select the operation that you need to carry:
    1: PUSH
    2: POP
    3: DISPLAY
    4: END

    3
    Elements in the stack are
    10 20 30
    Select the operation that you need to carry:
    1: PUSH
    2: POP
    3: DISPLAY
    4: END

    4

    Process finished with exit code 1
 */