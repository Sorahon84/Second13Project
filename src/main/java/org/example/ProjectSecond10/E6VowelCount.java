package org.example.ProjectSecond10;

public class E6VowelCount {
    public static void main(String[] args) {
        String str = "documentation";
        int vowelCount = countVowels(str);
        System.out.println("The number of vowels in \"" + str + "\" is: " + vowelCount);
    }
    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase(); // Convert the string to lowercase to handle both uppercase and lowercase vowels
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}
