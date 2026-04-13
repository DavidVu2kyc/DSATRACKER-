import java.util.HashSet;
import java.util.Set;

public class Problem01_ContainsDuplicate {

    public class CheckContainingDuplicate {
        public boolean containsDuplicate(int[] nums) {
            Set<Integer> set = new HashSet<>();
            for (int num : nums) {
                if (set.contains(num)) {
                    return true;
                }
                set.add(num);
            }
            return false;
        }
    }
    public static void main(String[] args) {
        /*
         * Hint:
         * Keep a set of values you have seen.
         * If a number already exists in the set, there is a duplicate.
         *
         * Pseudocode:
         * create empty set
         * for each number in nums:
         *     if set already contains number:
         *         return true
         *     add number to set
         * return false
         */
    }
}
