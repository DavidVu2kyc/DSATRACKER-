public class Problem01_ReverseLinkedList {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public 

    public static void main (String[] args) {
        /*
         * Example:
         * Input: head = [1,2,3,4,5]
         * Output: [5,4,3,2,1]
         */
    }

    /*
     * Hint:
     * Use three pointers:
     * - previous
     * - current
     * - next
     *
     * Pseudocode:
     * previous = null
     * current = head
     * while current is not null:
     *     save current.next in next
     *     reverse current.next to previous
     *     move previous to current
     *     move current to next
     * return previous
     */
}
