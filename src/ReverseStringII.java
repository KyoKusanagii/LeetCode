public class ReverseStringII {
    public String reverseStr(String s, int k) { //k==3
        char[] c = s.toCharArray();
        boolean reverse = true;
        StringBuilder builder = new StringBuilder();
        String ans = "";
        int a = 0;
        for (int i = 1; i <= (c.length / (2*k)); i++) { //切幾段 0~5 是一段
            StringBuilder builder1 = new StringBuilder();
            for(int j = (i-1)*k ; j<=i*k-1;j++){  // 0~2、3~5
                builder1.append(c[j]);
                a = j;
            }
            if(reverse){
                builder1 = builder1.reverse();
                reverse = false;
            }
            builder.append(builder1);
        }
        if(c.length%(2*k)==0){
            ans = builder.toString();
        }else{
            int x = 1;
            boolean reverse2 = true;
            for(int j = a + 1;j<c.length;j++){
                StringBuilder builder1 = new StringBuilder();
                if(x<=k){
                    builder1.append(c[j]);
                    x++;
                }else if(x>k){
                    if(reverse2){
                        builder.append(builder1.reverse());
                        reverse2 = false;
                    }
                    builder.append(c[j]);
                }
            }
            ans = builder.toString();
        }
        return ans;
    }
}
