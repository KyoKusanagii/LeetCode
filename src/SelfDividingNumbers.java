import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
	
	/*
	A self-dividing number is a number that is divisible by every digit it contains.

	For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.

	Also, a self-dividing number is not allowed to contain the digit zero.

	Given a lower and upper number bound, 
	
	output a list of every possible self dividing number, including the bounds if possible.
	
	Input: 
	left = 1, right = 22
	Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
	
	*/
	public static List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> list = new ArrayList<>();
		for(int i = left;i<=right;i++) {
			String num = String.valueOf(i);
			if(num.contains("0")) {
				continue;
			}
			char [] cArray = num.toCharArray();
			for(int j=0;j<cArray.length;j++) {
				if(Character.getNumericValue(cArray[j]) == 0) {
					continue;
				}
				if(i % Character.getNumericValue(cArray[j]) != 0) {
					break;
				}
				if(j == cArray.length-1) {
					list.add(i);
				}
			}
			
		}
		return list;
    }
	
	public static void main(String[] args) {
		System.out.println(selfDividingNumbers(1,22));
	}

}
