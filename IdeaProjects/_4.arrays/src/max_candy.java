import java.util.ArrayList;
import java.util.List;
public class max_candy {
    //to return if the children will have max candies among all  if they will have extra candies
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> list = new ArrayList<>();
        for (int candy : candies) {
            max = Math.max(candy, max);
        }
        for (int candy : candies) {
            list.add(candy + extraCandies >= max);
        }
        return list;
    }
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        List<Boolean> result = kidsWithCandies(candies, extraCandies);
        System.out.println(result);
    }
}








