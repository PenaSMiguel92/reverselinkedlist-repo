public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        ListNode list1 = generateListFromValues(new int[] { 1, 2, 3, 4, 5 });
        ListNode list2 = generateListFromValues(new int[] { 1, 2 });
        ListNode list3 = generateListFromValues(new int[] { 3, 5, 7, 10, 500, 2000 });

        printList(sol.reverseList(list1));
        printList(sol.reverseList(list2));
        printList(sol.reverseList(list3));

    }

    public static ListNode generateListFromValues(int[] values) {
        ListNode head = new ListNode(-1, null);
        ListNode ptr = head;
        for (int val : values) {
            ptr.next = new ListNode(val);
            ptr = ptr.next;
        }
        return head;
    }

    public static void printList(ListNode head) {
        String val = "[";
        while (head != null) {
            val += " " + head.val + " ";
            head = head.next;
        }
        System.out.println(val + "]");
    }
}
