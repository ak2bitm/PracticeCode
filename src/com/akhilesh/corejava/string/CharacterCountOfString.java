package com.akhilesh.corejava.string;

public class CharacterCountOfString {
    static void characterCount(String str){
        int count = 0;
        for (int i=0; i<=str.length()-1; i++){
            if (str.charAt(i)== 'a' || str.charAt(i)=='A'){
                count++;
            }
        }
        System.out.println("Number of Character a or A is present in string are :"+count);
    }
    public static void main(String[] args) {
        String str = "Akhilesh kumar patel";
        characterCount(str);
    }
}
