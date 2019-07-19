import java.util.*;

public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        List<PriceOnDay> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();


        for (int i = 0; i < prices.length; i++) {
            PriceOnDay priceOnDay = new PriceOnDay();
            priceOnDay.index = i;
            priceOnDay.price = prices[i];
            list.add(priceOnDay);
        }
        Collections.sort(list);
        for (int i = list.size() - 1; i >= 1; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (list.get(i).index > list.get(j).index) {
                    set.add(list.get(i).price - list.get(j).price);
                }
            }
        }

        return set.size() == 0 ? 0 : Collections.max(set);

    }

    private class PriceOnDay implements Comparable<PriceOnDay> {
        int price;
        int index;

        @Override
        public int compareTo(PriceOnDay o) {
            return this.price - o.price;
        }
    }

    public static void main(String[] args) {
        BestTimetoBuyandSellStock b = new BestTimetoBuyandSellStock();
        System.out.println(b.maxProfit(new int[]{7,6,4,3,1}));
    }
}
