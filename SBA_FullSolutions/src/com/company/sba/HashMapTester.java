package com.company.sba;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class HashMapTester {
	public static Map<String, Integer> mergeMaps(Map<String, Integer> map1, Map<String, Integer> map2){
		 Map<String, Integer> mergedMap = new HashMap<>();
		for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            if (map2.containsKey(key)) {
            	Integer value2 = map2.get(key);
                if (value.equals(value2)) {
                    mergedMap.put(key, value);  // Same key and value, copy to merged map
                } else {
                    String newKey = key + "_new";  // Different values, append "_new" to key
                    mergedMap.put(newKey, value2);
                    mergedMap.put(key, value);
                }
            } else {
                mergedMap.put(key, value);  // Only exists in map1, copy to merged map
            }
        
        }

        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            if (!map1.containsKey(key)) {
                mergedMap.put(key, value);  // Only exists in map2, copy to merged map
            }
        }

		return mergedMap;
	}

	public static void main(String args[]) {
	      Scanner sc = new Scanner(System.in);
	      int firstmap=sc.nextInt();
	      Map<String, Integer> map1 = new HashMap<>();
	        
	      for(int i=1;i<=firstmap;i++) {
	    	  map1.put(sc.next(),sc.nextInt());
	      }
	      int secondmap=sc.nextInt();
	      Map<String, Integer> map2 = new HashMap<>();
	        
	      for(int i=1;i<=secondmap;i++) {
	    	  map2.put(sc.next(),sc.nextInt());
	      }
		// create maptwo and read input key and value for maptwo
		Map<String, Integer> mergedMap = mergeMaps(map1, map2);

		// print mergedMap
		System.out.println(mergedMap);
	
	}
}
