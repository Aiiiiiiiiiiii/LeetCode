import java.util.List;

public class Test01 {
    public static Day01 day01 = new Day01();
    public static void main(String[] args) {
//        testLc1431();
//        reverseLeftWords();
        game();
    }
    public static void testLc1431(){
        int[] candies = {4,2,1,1,2};
        int extraCandies = 1;
        List<Boolean> booleans = day01.lc1431(candies, extraCandies);
        for (Boolean aBoolean : booleans) {
            System.out.println(aBoolean);
        }
    }
    public static void reverseLeftWords(){
        String s = "abcdefg";
        int n = 2;
        String s1 = day01.reverseLeftWords(s, n);
        System.out.println(s1);
    }
    public static void game(){
        int[] guess = {2,2,3};
        int[] answer = {3,2,1};
        int game = day01.game(guess, answer);
        System.out.println("答对了"+game+"次");
    }
}
