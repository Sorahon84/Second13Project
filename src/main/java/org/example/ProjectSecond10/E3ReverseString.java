package org.example.ProjectSecond10;

public class E3ReverseString {
    public static void main(String[] args) {
String input = "Hello";
        String reversed = reverseString(input);
        System.out.println(reversed);
    }

    public static String reverseString(String str){
        StringBuilder reversed = new StringBuilder(str);
        reversed.reverse();
        return reversed.toString();
    }
}
