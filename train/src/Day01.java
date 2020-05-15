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
    //面试题58-II。左旋转转字符串：将前面n个字符串放到后面 abcdefg  2
    //示例 1：
    //输入: s = "abcdefg", k = 2
    //输出: "cdefgab"
    //示例 2：
    //输入: s = "lrloseumgh", k = 6
    //输出: "umghlrlose"
    public String reverseLeftWords(String s, int n) {
//        char[]   c = s.toCharArray();
//        char[]  a = new char[n];
//        for (int i = 0; i < n; i++){
//            a[i] = c[i];
//        }
//        char[] b = new char[c.length-n];
//        for (int i = 0; i < c.length-n; i++){
//            b[i] = c[i+n];
//        }
//        StringBuffer s1 = new StringBuffer();
//        s1.append(String.valueOf(b));
//        s1.append(String.valueOf(a));
//        return s1.toString();
//    }
        String sub = s.substring(n);
        String sub2 = s.substring(0,n);
        return new StringBuilder(sub+sub2).toString();
    }
    //LCP01猜数字
    // 示例 1：
    //输入：guess = [1,2,3], answer = [1,2,3]
    //输出：3
    //解释：小A 每次都猜对了。
    //示例 2：
    //输入：guess = [2,2,3], answer = [3,2,1]
    //输出：1
    //解释：小A 只猜对了第二次。
    public int game(int[] guess, int[] answer) {
        int count = 0;
        for(int i = 0 ; i < guess.length; i ++){
            if(guess[i]==answer[i]){
                count++;
            }
        }
        return count;
    }
}
