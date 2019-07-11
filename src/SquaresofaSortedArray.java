import java.util.Arrays;

public class SquaresofaSortedArray {

    public int[] sortedSquares(int[] A) {
        int [] newArray = new int[A.length];
        for(int i=0;i<newArray.length;i++){
            newArray[i] = (int)Math.pow(A[i],2);
        }
        Arrays.sort(newArray);
        return newArray;
    }

//    public static void main(String [] args){
//        this.sortedSquares()
//    }
}
