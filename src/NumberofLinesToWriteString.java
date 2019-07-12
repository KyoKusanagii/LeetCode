import java.util.LinkedHashMap;
import java.util.Map;

public class NumberofLinesToWriteString {

    public int[] numberOfLines(int[] widths, String S) {
        int line = 1;
        int plus = 0;
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<widths.length;i++){
            map.put((char)(i+97),widths[i]);
        }

        char [] ch = S.toCharArray();
        int lineLength = 100;
        boolean isLessThan100 = false;
        int firstTimeLessThan100 = 0;
        for(int j = 0 ;j<ch.length;j++){
            int num = map.get(ch[j]);
            if (num > lineLength || plus == 100){
                if(lineLength != 0 && j == ch.length-1){
                    plus = num;
                }else{
                    int sum = 0;
                    if(!isLessThan100){
                        for(int k=j;k<ch.length;k++){
                            sum += map.get(ch[k]);
                        }
                    }
                    if(sum<100){
                        isLessThan100 = true;
                        firstTimeLessThan100 ++;
                        if(isLessThan100){
                            if(firstTimeLessThan100 == 1){
                                plus = 0;
                            }
                            plus += num;
                        }
                    }else{
                        plus = num;
                    }
                }
                line++;
                lineLength = 100;
            }else if(lineLength >= num){
                lineLength -= num;
                plus += num;
            }
        }

        return new int[]{line,plus};
    }

    public static void main(String [] args){
        NumberofLinesToWriteString n = new NumberofLinesToWriteString();
//        n.numberOfLines(new int[]{7,5,4,7,10,7,9,4,8,9,6,5,4,2,3,10,9,9,3,7,5,2,9,4,8,9},
//                "zlrovckbgjqofmdzqetflraziyvkvcxzahzuuveypqxmjbwrjvmpdxjuhqyktuwjvmbeswxuznumazgxvitdrzxmqzhaaudztgie");
        n.numberOfLines(new int[]{10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10},
                "abcdefghijklmnopqrstuvwxyz");
    }


}
