package org.example.ProjectSecond10;

import java.util.Arrays;

public class E5AnagramCheck {
    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        char[] arr1 = str1.toLowerCase().toCharArray();
        char[] arr2 = str2.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);

    }

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        System.out.println("Are anagrams: " + areAnagrams(s1, s2));
    }
}
