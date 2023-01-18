package com.epam.mjc.collections.combined;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        HashSet<String> set = new HashSet<>();
        for(Map.Entry entry : timetable.entrySet()){
            for(String str : (List<String>) entry.getValue()){
                set.add(str);
            }
        }
        return set;
    }
}
