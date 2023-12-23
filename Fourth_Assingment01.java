package Assingment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fourth_Assingment01 {

    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> anagramGroups = new HashMap<>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            anagramGroups.computeIfAbsent(sortedStr, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(anagramGroups.values());
    }

    public static void main(String[] args) {
        String[] strs1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result1 = groupAnagrams(strs1);
        System.out.println(result1);

        String[] strs2 = {""};
        List<List<String>> result2 = groupAnagrams(strs2);
        System.out.println(result2);

        String[] strs3 = {"a"};
        List<List<String>> result3 = groupAnagrams(strs3);
        System.out.println(result3);
    }
}
