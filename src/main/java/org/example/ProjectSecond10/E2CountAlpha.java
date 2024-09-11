package org.example.ProjectSecond10;

public class E2CountAlpha {
    public static void main(String[] args) {
String str = "Hello123ABC@";
int count=0;
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                count++;
            }
        }
        System.out.println("Number of alphabetic characters: " + count);

    }
}
