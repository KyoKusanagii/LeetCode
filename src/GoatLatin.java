public class GoatLatin {
    public String toGoatLatin(String S) {
        String [] arr = S.split(" ");
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            if(arr[i].toUpperCase().startsWith("A") || arr[i].toUpperCase().startsWith("E") ||
             arr[i].toUpperCase().startsWith("I") || arr[i].toUpperCase().startsWith("O") || arr[i].toUpperCase().startsWith("U")){
                builder.append(arr[i]);
            }else {
                StringBuilder builder1 = new StringBuilder(arr[i]);
                char c = builder1.charAt(0);
                builder.append(builder1.deleteCharAt(0)).append(c);
            }
            builder.append("ma");
            for(int j=1;j<=i+1;j++){
                builder.append("a");
            }
            builder.append(" ");
        }


        return builder.deleteCharAt(builder.length()-1).toString();
    }
}
