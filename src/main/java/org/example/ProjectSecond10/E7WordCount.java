package org.example.ProjectSecond10;

public class E7WordCount {
    public static int countWords(String str) {
        return str.trim().split("\\s+").length;
    }

    public static void main(String[] args) {
        String input = "Hello, world!";
        System.out.println("Word count: " + countWords(input));
    }
}