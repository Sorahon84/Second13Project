package org.example.ProjectSecond10;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class E10RemoveDuplicate {
    public static void main(String[] args) {
        List<String> listWithDuplicates = new ArrayList<>();
        listWithDuplicates.add("Apple");
        listWithDuplicates.add("Banana");
        listWithDuplicates.add("Apple");
        listWithDuplicates.add("Orange");
        listWithDuplicates.add("Banana");

        List<String> listWithoutDuplicates = removeDuplicates(listWithDuplicates);
        System.out.println(listWithoutDuplicates);
    }

    public static List<String> removeDuplicates(List<String> list) {
        return new ArrayList<>(new LinkedHashSet<>(list));
    }
}
