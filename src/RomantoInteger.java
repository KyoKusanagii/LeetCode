import java.util.HashMap;
import java.util.Map;

public class RomantoInteger {
    public int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put("M", 1000);
        map.put("CM", 900);
        map.put("D", 500);
        map.put("CD", 400);
        map.put("C", 100);
        map.put("XC", 90);
        map.put("L", 50);
        map.put("XL", 40);
        map.put("X", 10);
        map.put("IX", 9);
        map.put("V", 5);
        map.put("IV", 4);
        map.put("I", 1);
        int sum = 0;
        int i = 0;
        char[] c = s.toCharArray();
        while (i < c.length) {
            if (c[i] == 'M') {
                if (i - 1 != -1 && c[i - 1] == 'C') {
                    sum += map.get("CM");
                    i += 2;
                } else {
                    sum += map.get("M");
                    i += 1;
                }
            } else if (c[i] == 'D') {
                if (i - 1 != -1 && c[i - 1] == 'C') {
                    sum += map.get("CD");
                    i += 2;
                } else {
                    sum += map.get("D");
                    i += 1;
                }
            } else if (c[i] == 'C') {
                if (i - 1 != -1 && c[i - 1] == 'X') {
                    sum += map.get("XC");
                    i += 2;
                } else if (i + 1 != c.length && c[i + 1] == 'M') {
                    sum += map.get("CM");
                    i += 2;
                } else if (i + 1 != c.length && c[i + 1] == 'D') {
                    sum += map.get("CD");
                    i += 2;
                } else {
                    sum += map.get("C");
                    i += 1;
                }
            } else if (c[i] == 'L') {
                if (i - 1 != -1 && c[i - 1] == 'X') {
                    sum += map.get("XL");
                    i += 2;
                } else {
                    sum += map.get("L");
                    i += 1;
                }
            } else if (c[i] == 'X') {
                if (i - 1 != -1 && c[i - 1] == 'I') {
                    sum += map.get("IX");
                    i += 2;
                } else if (i + 1 != c.length && c[i + 1] == 'C') {
                    sum += map.get("XC");
                    i += 2;
                } else if (i + 1 != c.length && c[i + 1] == 'L') {
                    sum += map.get("XL");
                    i += 2;
                } else {
                    sum += map.get("X");
                    i += 1;
                }
            } else if (c[i] == 'V') {
                if (i - 1 != -1 && c[i - 1] == 'I') {
                    sum += map.get("IV");
                    i += 2;
                } else {
                    sum += map.get("V");
                    i += 1;
                }
            } else if (c[i] == 'I') {
                if (i + 1 != c.length && c[i + 1] == 'X') {
                    sum += map.get("IX");
                    i += 2;
                }else if (i + 1 != c.length && c[i + 1] == 'V') {
                    sum += map.get("IV");
                    i += 2;
                }else{
                    sum += map.get("I");
                    i++;
                }
            }
        }
        return sum;
    }
}
