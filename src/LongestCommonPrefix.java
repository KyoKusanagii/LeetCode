
public class LongestCommonPrefix {
	
	public static String longestCommonPrefix(String[] strs) {
		   String commonStr = ""; 
		   boolean out = false;
		   int begin = 0; 
		  
		   if(strs == null || strs.length == 0) {
			   return "";
		   }else if(strs[0] == null ||  strs[0].isEmpty()) {
			   return "";
		   }else if(strs.length == 1) {
			   return strs[0];
		   }
		   
    	   for(int i=0;i<strs[0].length();i++) {
    		   
    		 
    		 
    		   commonStr += String.valueOf(strs[0].charAt(begin));
    		   
//    		   if(strs[i].startsWith(commonStr)) {
//				   continue;
//			   }else {
//				   return commonStr;
//			   }
    		   for(int j=1;j<strs.length;j++) {
    			   if(!strs[j].startsWith(commonStr)) {
    				   commonStr = commonStr.substring(0, commonStr.length()-1);
    				   out = true;
    				   break;
    			   }
    			   if(j == strs.length-1) {
    				   begin++;
    			   }
    			   
    		   }
    		   if(out) {
    			   break;
    		   }
    	   }
    	   return commonStr;
      }
	    
	
	
	public static void main(String[] args) {
		String [] a = {"flower","flow","floght"};
		String [] b = {"dog","racecar","car"};
		String [] c = {"c","c"};
		System.out.println(longestCommonPrefix(c));
	}

}
