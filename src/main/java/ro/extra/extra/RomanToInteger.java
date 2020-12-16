package ro.extra.extra;

import java.util.HashMap;

public class RomanToInteger {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        if (s == null || s.length() == 0) {
            return 0;
        }
        int result = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (map.get(s.charAt(i)) >= map.get(s.charAt(i))) {
                result = result + map.get(s.charAt(i));
            } else {
                result = result - map.get(s.charAt(i));
            }
        }
        result = result + map.get(s.charAt(s.length()-1));
        return result;
    }

}
