import java.util.ArrayList;
import java.util.List;

public class Day01 {
    //给你一个数组 candies 和一个整数 extraCandies ，其中 candies[i] 代表第 i 个孩子拥有的糖果数目。
    //对每一个孩子，检查是否存在一种方案，将额外的 extraCandies 个糖果分配给孩子们之后，此孩子有 最多 的糖果。注意，允许有多个孩子同时拥有 最多 的糖果数目。
    //来源：力扣（LeetCode）
    //tips:找出最大的，让其他的加extraCandies依次和最大的比较
    public List<Boolean> lc1431(int[] candies, int extraCandies){
        List<Boolean> booleans = new ArrayList<>();
        //找出最大的
        int max = 0;
        for(int i = 0; i < candies.length;i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }


        for (int i = 0; i < candies.length; i++){
                if(candies[i]+extraCandies>=max){
                    booleans.add(true);
                }else {
                    booleans.add(false);
                }

        }
        return booleans;
    }
}
