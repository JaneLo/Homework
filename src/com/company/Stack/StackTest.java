package com.company.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack mStack = new Stack(10);

        mStack.push(5);
        mStack.push(4);
        mStack.push(3);
        mStack.push(2);
        mStack.push(1);

        mStack.pop();

        System.out.print("Стек: ");
        while (!mStack.isEmpty()) {
            int value = mStack.pop();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println("");
    }
}
