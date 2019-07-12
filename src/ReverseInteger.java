public class ReverseInteger {

    public int reverse(int x) {
        StringBuilder builder = new StringBuilder();
        builder.append(x);
        if(x<0){
            builder.deleteCharAt(0);
        }
        builder.reverse();
        char[] c = builder.toString().toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (builder.charAt(0) == '0') {
                builder.deleteCharAt(0);
            } else {
                break;
            }
        }
        String num = builder.toString();
        int ans = 0;
        try{
            ans = Integer.parseInt(num);
        }catch (Exception e){
            e.printStackTrace();
        }
        return x < 0 ? (-1) * ans : ans;
    }


    public static void main(String[] args) {
        ReverseInteger r = new ReverseInteger();
        System.out.println(r.reverse(120));
    }
}
