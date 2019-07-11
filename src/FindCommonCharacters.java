import java.util.*;

public class FindCommonCharacters {
    public static List<String> commonChars(String[] A) {
        Map<Integer,Integer> strLength = new LinkedHashMap<>(); //長度,索引
        List<Integer> strLengthList = new ArrayList<>(); //長度
        List<String> finalAns = new ArrayList<>();
        Set<Character> commonSet = new TreeSet<>();
        for(int i=0;i<A.length;i++){
            strLength.put(A.length,i);
            strLengthList.add(A.length);
        }

        int index = strLength.get(Collections.min(strLengthList));
        for(char c : A[index].toCharArray()){
            int time = 0; //該字元有在自串的字數，次數要剛好在A的長度-1，才能算每個字串都有的字元
            for(int i=0;i<A.length;i++){
                if(i == index){
                    continue;
                }
                if(A[i].contains(String.valueOf(c))){
                    time++;
                }
            }
            if(time == A.length-1){
                commonSet.add(c);
            }
        }

        Iterator itr = commonSet.iterator();
        Map<Character,Integer> map = new TreeMap<>();
        while(itr.hasNext()){
            List<Integer> times1 = new ArrayList<>();
            char targetC = (Character) itr.next();
            for(int i=0;i<A.length;i++){
                int times = 0;
                char [] ch = A[i].toCharArray();
                for(int j=0;j<ch.length;j++){
                    if(targetC==ch[j]){
                        times++;
                    }
                }
                times1.add(times);
            }
            map.put(targetC,Collections.min(times1));
        }

        Iterator itrs = map.entrySet().iterator();
        while (itrs.hasNext()){
            Map.Entry<Character,Integer> map1 = (Map.Entry<Character, Integer>) itrs.next();
            Character v = map1.getKey();
            Integer s = map1.getValue();
            for(int i=0;i<s;i++){
                finalAns.add(String.valueOf(v));
            }
        }

        return finalAns;
    }

    public static void main(String [] args){
        String a [] = {"bella","label","roller"};
        System.out.println(commonChars(a));
    }
}
