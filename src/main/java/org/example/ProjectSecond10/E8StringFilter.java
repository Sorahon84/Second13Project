package org.example.ProjectSecond10;

import java.util.ArrayList;
import java.util.List;

public class E8StringFilter {
    public static void main(String[] args) {
        List<String> filter = new ArrayList<>();
        filter.add("Apple");
        filter.add("Banana");
        filter.add("Avocado");
        filter.add("Apricot");
        filter.add("Mango");

        List<String> filteredStrings = filterAndLowercase(filter);
        System.out.println(filteredStrings);
    }
        public static List<String> filterAndLowercase (List < String > filter) {
            List<String> result = new ArrayList<>();
            for (String str : filter) {
                if (str.startsWith("A")) {
                    result.add(str.toLowerCase());
                }
            }
            return result;
        }
    }