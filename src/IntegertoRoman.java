import java.util.HashMap;
import java.util.Map;

public class IntegertoRoman {
    public String intToRoman(int num) {
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

        StringBuilder builder = new StringBuilder(String.valueOf(num));
        while (builder.length() < 4) {      //不足位補0
            builder.insert(0,0);
        }

        char thousand = builder.charAt(0);
        char hundread = builder.charAt(1);
        char ten = builder.charAt(2);
        char one = builder.charAt(3);
        boolean over5 = false;
        builder.setLength(0);
        if (thousand != '0') {   //千位
            for (int i = 1; i <= Character.getNumericValue(thousand); i++) {
                builder.append("M");
            }
        }

        if (hundread != '0') {   //百位
            if (hundread == '9') {
                builder.append("CM");
            }else if(hundread == '5'){
                builder.append("D");
            }else if (hundread == '4') {
                builder.append("CD");
            } else {
                over5 = hundread > '5';
                if(over5){
                    builder.append("D");
                }
                for (int i = 1; i <= Character.getNumericValue(over5 ? hundread - 5 : hundread); i++) {
                    builder.append("C");
                }
            }
        }

        if (ten != '0') {   //十位
            if (ten == '9') {
                builder.append("XC");
            }else if(ten == '5'){
                builder.append("L");
            } else if(ten == '4') {
                builder.append("XL");
            }else{
                over5 = ten > '5';
                if(over5){
                    builder.append("L");
                }
                for (int i = 1; i <= Character.getNumericValue(over5 ? ten - 5 : ten); i++) {
                    builder.append("X");
                }
            }
        }

        if (one != '0') {   //個位
            if(one == '9'){
                builder.append("IX");
            }else if(one == '5'){
                builder.append("V");
            }else if(one == '4'){
                builder.append("IV");
            }else{
                over5 = one > '5';
                if(over5){
                    builder.append("V");
                }
                for (int i = 1; i <= Character.getNumericValue(over5 ? one - 5 : one); i++) {
                    builder.append("I");
                }
            }
        }

        return builder.toString();
    }

    public static void main(String[] args) {
        IntegertoRoman i = new IntegertoRoman();
        System.out.println(i.intToRoman(58));
    }
}
