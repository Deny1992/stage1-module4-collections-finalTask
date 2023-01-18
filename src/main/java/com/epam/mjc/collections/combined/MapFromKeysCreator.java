package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        HashMap<Integer, Set<String>> map = new HashMap<>();
        for(Map.Entry entry : sourceMap.entrySet()){
            String key = (String) entry.getKey();
            if(map.containsKey(key.length())){
                map.get(key.length()).add(key);
            }else {
                HashSet<String> set = new HashSet<>();
                set.add(key);
                map.put(key.length(), set);
            }

        }
        return map;
    }
}
