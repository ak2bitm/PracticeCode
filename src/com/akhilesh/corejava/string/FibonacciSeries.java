package com.akhilesh.corejava.string;

public class FibonacciSeries {
    static void printFibonacciSeries(int input){
        int a = 0;
        int b = 1;
        int c = 1;
        for (int i=1; i<=input; i++){
            System.out.print(a+" ");
            a = b;
            b = c;
            c = a + b;
        }
    }
    public static void main(String[] args) {
        int input =10;
        printFibonacciSeries(input);
    }
}
