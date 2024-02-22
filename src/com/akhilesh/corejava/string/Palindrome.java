package com.akhilesh.corejava.string;

public class Palindrome {
    static void isPalindrome(int num){
        int remainder;
        int reverseNumber = 0;
        int originalNumber = num;
        while (num !=0){
            remainder = num%10;
            reverseNumber = reverseNumber * 10 + remainder;
            num = num/10;
        }
        if (reverseNumber == originalNumber){
            System.out.printf("Input number is Palindrome");
        }else {
            System.out.printf("Input number is not Palindrome");
        }
    }
    public static void main(String[] args) {
        int num = 151;
        isPalindrome(num);
    }
}
