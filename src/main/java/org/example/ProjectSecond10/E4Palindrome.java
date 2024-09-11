package org.example.ProjectSecond10;

public class E4Palindrome {
    public static void main(String[] args) {
        String str = "madam";
        boolean isPalindrome = isPalindrome(str);
        if (isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
    public static boolean isPalindrome(String str){
        String reversed = new
                StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }

}
