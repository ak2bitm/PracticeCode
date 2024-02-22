package com.akhilesh.corejava.string;

public class FibonacciSeriesUsingRecursive {
    static int printFibonacciSeries(int input){
        if (input <= 1){
            return input;
        }
        return printFibonacciSeries(input -1) + printFibonacciSeries(input -2);
    }
    public static void main(String[] args) {
        int input = 10;
        for (int i=0; i<=input; i++){
            System.out.print(printFibonacciSeries(i)+" ");
        }
    }
}
