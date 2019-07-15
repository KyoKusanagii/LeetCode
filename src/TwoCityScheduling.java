import java.util.Arrays;
import java.util.Collections;

public class TwoCityScheduling {
    public int twoCitySchedCost(int[][] costs) {
        int ans = 0;
        for(int i=0;i<costs.length;i++){
            Arrays.sort(costs[i]);
            ans += costs[i][0];
        }
        return ans;
    }
}
