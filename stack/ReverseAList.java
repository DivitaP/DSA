package com.practice.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseAList {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the list");
        int length = sc.nextInt();
        List<Integer> inputList = new ArrayList<>();
        List<Integer> outputList = new ArrayList<>();

        System.out.println("Enter the elements in the list");


        Stack stack = new Stack();
        stack.setTop(-1);

        for (int i=0; i<length; i++) {
            inputList.add(sc.nextInt());
            StackOperations.push(stack, inputList.get(i));
        }
        System.out.println("Original list is: "+ inputList);

        for (int i=0; i<length; i++) {
            outputList.add(StackOperations.pop(stack));
        }

        System.out.println("Reverse list is: "+ outputList);

    }
}

/*
    Enter the number of elements in the list
    5
    Enter the elements in the list
    1
    2
    3
    4
    5
    Original list is: [1, 2, 3, 4, 5]
    Reverse list is: [5, 4, 3, 2, 1]

    Process finished with exit code 0

 */
