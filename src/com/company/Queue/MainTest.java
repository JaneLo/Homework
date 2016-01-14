package com.company.Queue;

public class MainTest {
    public static void main(String[] args) {

        Queue q = new Queue();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);

        System.out.println(q.get(5));
        q.pop();
        System.out.println(q.get(0));
        q.pop();
        System.out.println(q.get(2));
    }
}

