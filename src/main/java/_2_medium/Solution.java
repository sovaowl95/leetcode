package _2_medium;

import lib.ListNode;

class Solution {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode result = null;
    ListNode save = null;
    int left = 0;

    while (l1 != null || l2 != null || left != 0) {
      int sum = left;

      if (l1 != null) {
        sum += l1.val;
        l1 = l1.next;
      }
      if (l2 != null) {
        sum += l2.val;
        l2 = l2.next;
      }

      left = sum > 10 ? 1 : 0;
      ListNode listNode = new ListNode(sum);

      if (save == null) {
        save = result = listNode;
      } else {
        result.next = listNode;
        result = result.next;
      }
    }

    return save;
  }
}

