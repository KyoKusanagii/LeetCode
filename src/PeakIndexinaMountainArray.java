import java.util.Arrays;

public class PeakIndexinaMountainArray {
	/*
	 * Let's call an array A a mountain if the following properties hold:
	   A.length >= 3
	   There exists some 0 < i < A.length - 1 such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
	   Given an array that is definitely a mountain, return any i such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1].
	 * 
	 * */
	static int peakIndex = 0;
	
	public static int peakIndexInMountainArray(int[] A) {
        int [] copy = A.clone(); //先复制阵列
        int peakIndex = 0 ;
        Arrays.sort(copy); //把复制的阵列排序
        for(int i=0;i<copy.length;i++) {
        	int index = Arrays.binarySearch(A, copy[i]); //找出最大值的位置在哪
        	peakIndex = biggerThanMe(A,index);
        }
        
        return peakIndex;
    }
	
	public static int leftStart(int [] a,int startIndex) {
		boolean doNext = false;
		for(int i=0;i<a.length-1;i++) {
			if(a[i+1]>a[i]) {
				doNext = true;
				break;
			}
		}
		if(doNext) {
			peakIndex = leftStart(a,startIndex-1);
			
		}
		return peakIndex;
	}
	public static int rightStart(int [] a,int startIndex) {
		boolean doNext = false;
		for(int i=a.length;i>1;i++) {
			if(a[i]<a[i-1]) {
				doNext = true;
				break;
			}
		}
		if(doNext) {
			peakIndex = leftStart(a,startIndex-1);
			
		}
		return peakIndex;
	}
	
	public static int biggerThanMe(int [] a,int startIndex) {	//阵列，起始位置
		if(startIndex == 0) {
			leftStart(a,startIndex);
		}else if(startIndex == a.length-1) {
			rightStart(a,startIndex);
		}else {
			leftStart(a, startIndex);
			new Thread() {
				@Override
				public void run() {
					rightStart(a, startIndex);
				}
			};
		}
		
		return peakIndex;
	}
	
	public static void main(String[] args) {
		int a [] = {0,2,1,0};
		System.out.println(peakIndexInMountainArray(a));
	}

}
