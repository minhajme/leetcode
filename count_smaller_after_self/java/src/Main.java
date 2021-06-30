import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums = {5, 4, 3, 2, 1, 0};
        List<Integer> counts = new Solution().countSmaller(nums);
        System.out.println(Arrays.toString(nums)+"-->");
        System.out.println(counts.toString());
    }
}
