package _21_easy;

import lib.ListNode;

class Solution {
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    if (l1 == null) {
      return l2;
    }
    if (l2 == null) {
      return l1;
    }

    ListNode current;
    ListNode result;


    if (l1.val < l2.val) {
      result = l1;
      l1 = l1.next;
    } else {
      result = l2;
      l2 = l2.next;
    }

    current = result;


    while (true) {
      if (l1 == null) {
        result.next = l2;
        break;
      }
      if (l2 == null) {
        result.next = l1;
        break;
      }


      if (l1.val < l2.val) {
        result.next = l1;
        l1 = l1.next;
      } else {
        result.next = l2;
        l2 = l2.next;
      }
      result = result.next;

    }

    return current;
  }
}