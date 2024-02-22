package com.akhilesh.corejava.string;

public class SwapTwoNumber {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Before Swapping A = "+a+" and B = "+b);
        a = a + b; // a become 15
        b = a - b; // b become 5
        a = a - b; // a become 10
        System.out.println();
        System.out.println("After Swapping A = "+a+" and B = "+b);
    }
}
