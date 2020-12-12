package ro.fasttrackit.temaCurs11;

import java.util.HashMap;

public class RomanToInt {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'V' || s.charAt(i) == 'X') {
                if (i > 0 && s.charAt(i - 1) == 'I') result -= 2;
            }
            if (s.charAt(i) == 'L' || s.charAt(i) == 'C') {
                if (i > 0 && s.charAt(i - 1) == 'X') result -= 20;
            }
            if (s.charAt(i) == 'D' || s.charAt(i) == 'M') {
                if (i > 0 && s.charAt(i - 1) == 'C') result -= 200;
            }
            result += map.get(s.charAt(i));
        }
        return result;
    }
}
