package com.akhilesh.corejava.string;

public class ReverseString {

    /*
    static void reverseString(String str){
        String st1 = "";
        for(int i=str.length()-1; i>=0; i--){
            st1 = st1 + str.charAt(i);
        }
        System.out.printf("Reverse String is :"+ st1);
    }
    */
    static void reverseString(String str){
        char[] ch1 = str.toCharArray();
        for (int i=ch1.length-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
    }
    static void reverseCharArray(char[] ch){
        int start = 0;
        int end = ch.length-1;
        while (start < end){
            char tmp = ch[start];
            ch[start++] = ch[end];
            ch[end--] = tmp;
        }
        for (int i=0; i<=ch.length-1; i++){
            System.out.print(ch[i]);
        }
    }
    public static void main(String[] args) {
        String str = "akhilesh kumar patel";
        char[] s = {'h','e','l','l','o'};//output ==> {'o','l','l','e','h'}
        //reverseString(str);
        reverseCharArray(s);
    }
}
