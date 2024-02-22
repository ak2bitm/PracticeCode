package com.akhilesh.corejava.string;

public class StringPalindrome {
    static void isPalindrome(String input){
        if (input.length() == 0 || input.length() == -1){
            return;
        }
        String st1 = input.toLowerCase();
        String st2 = "";
        for (int i=st1.length()-1; i>=0; i--){
            st2 = st2 + st1.charAt(i);
        }
        if (st1.equals(st2)){
            System.out.printf("Input String is Palindrome");
        }else {
            System.out.printf("Input String is not Palindrome");
        }
    }
    public static void main(String[] args) {
        String input = "Radar";
        isPalindrome(input);
    }
}
