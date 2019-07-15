public class MonotonicArray {
    public boolean isMonotonic(int[] A) {
        boolean ans = true;
        boolean isUp = false;
        boolean knowUpOrDown = false;
        for(int i=0;i<A.length-1;i++){
            if(!knowUpOrDown){
                if(A[i+1]-A[i]==0){
                    continue;
                }else if(A[i+1]-A[i] > 0){
                    isUp = true;
                    knowUpOrDown = true;
                }else if(A[i+1]-A[i] < 0){
                    isUp = false;
                    knowUpOrDown = true;
                }
            }

            if((isUp && A[i+1] - A[i]<0) || (!isUp && A[i+1] - A[i]>0)){
                ans = false;
                break;
            }
        }
        return ans;
    }
}
