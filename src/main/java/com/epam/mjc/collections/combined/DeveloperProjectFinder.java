package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                String str1 = (String) o1;
                String str2 = (String) o2;
                int result = str2.length() - str1.length();
                if(result == 0){
                    return str2.compareTo(str1);
                }
                return result;
            }
        };
        TreeSet<String> treeSet = new TreeSet<>(comparator);

        for(Map.Entry entry : projects.entrySet()){
            Set<String> set = (Set<String>) entry.getValue();
            if(set.contains(developer)){
                treeSet.add((String) entry.getKey());
            }
        }
        List<String> list = new ArrayList<>(treeSet);
        return list;
    }
}
