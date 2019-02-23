
public class ReverseWordsinaStringIII {
	
	public static String reverseWords(String s) {
		StringBuilder builder = null;
		StringBuilder ans = new StringBuilder();
        for(String str : s.split(" ")) {
        	builder = new StringBuilder(str);
        	builder.reverse();
        	ans.append(builder).append(" ");
        }
        String answer = ans.toString();
        return answer.endsWith(" ") ? answer.substring(0,answer.length()-1) : answer;
    }
	
	public static void main(String[] args) {
		String str = "Let's take LeetCode contest";
		System.out.println(reverseWords(str));
	}

}
