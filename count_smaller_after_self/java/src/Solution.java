import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Integer> countSmaller(int[] nums) {
        int lastIndex = nums.length - 1;
        ArrayList<Integer> counts = new ArrayList<>();
        for (int index = 0; index <= lastIndex; index++) {
            int currentElement = nums[index];
            int[] nextElements = index < lastIndex ? Arrays.copyOfRange(nums, index + 1, lastIndex + 1) : new int[0];
            //System.out.println("index " + index + ", nextElements " + Arrays.toString(nextElements));
            int nextSmallerCount = 0;
            for (int nxtElement : nextElements) {
                if (nxtElement < currentElement) {
                    ++nextSmallerCount;
                }
            }
            counts.add(nextSmallerCount);
        }
        return counts;
    }
}