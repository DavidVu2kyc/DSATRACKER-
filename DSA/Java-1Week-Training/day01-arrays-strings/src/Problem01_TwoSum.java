import java.util.HashMap;
import java.util.Map;

public class Problem01_TwoSum {

    public class caculateTwoSum {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for( int i=0; i<nums.length; i++) {
                int need = target - nums[i];
                if(map.containsKey(need)) {
                    return new int[] {map.get(need), i};
                }
                map.put(nums[i], i);
            }
            return new int[] {-1, -1};
    }


    public static void main(String[] args) {
        /*
         * Hint:
         * Use a map to store number -> index while scanning once.
         * For each number:
         * 1. Compute the needed value: target - current
         * 2. Check whether that value was seen before
         * 3. If yes, return the previous index and current index
         * 4. Otherwise store the current number and index
         *
         * Pseudocode:
         * create empty map
         * for i from 0 to nums.length - 1:
         *     need = target - nums[i]
         *     if map contains need:
         *         answer found
         *     put nums[i] with index i into map
         */
    }
}
