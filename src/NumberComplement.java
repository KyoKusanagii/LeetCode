public class NumberComplement {
    public int findComplement(int num) {

        String bin = Integer.toBinaryString(num);
        char [] ch = bin.toCharArray();
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<ch.length;i++) {

            if (ch[i] == '0') {
                builder.append('1');
            } else {
                builder.append('0');
            }

        }
        char [] ca = builder.toString().toCharArray();
        int a = 0;
        try{
            for(int i = ca.length-1;i>=0;i--){
                a += Character.getNumericValue(ca[i])*Math.pow(2,ca.length-1-i);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return a;
    }


    public static void main(String [] args){
        NumberComplement n = new NumberComplement();
        System.out.println(n.findComplement(2));
    }

}
