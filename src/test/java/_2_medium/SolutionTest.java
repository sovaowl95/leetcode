package _2_medium;

import lib.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {
  Solution solution;

  @BeforeEach
  void init() {
    solution = new Solution();
  }

  @Test
  void addTwoNumbers() {
    ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
    ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
    final ListNode result = solution.addTwoNumbers(l1, l2);

    Assertions.assertEquals("7_0_8", result.toFlat());
  }

  @Test
  void addTwoNumbers2() {
    ListNode l1 = new ListNode(0);
    ListNode l2 = new ListNode(0);
    final ListNode result = solution.addTwoNumbers(l1, l2);

    Assertions.assertEquals("0", result.toFlat());
  }

  @Test
  void addTwoNumbers3() {
    ListNode l1
        = new ListNode(9,
                       new ListNode(9,
                                    new ListNode(9,
                                                 new ListNode(9,
                                                              new ListNode(9,
                                                                           new ListNode(9,
                                                                                        new ListNode(9)
                                                                           )
                                                              )
                                                 )
                                    )
                       )
    );
    ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
    final ListNode result = solution.addTwoNumbers(l1, l2);

    Assertions.assertEquals("8_9_9_9_0_0_0_1", result.toFlat());
  }
}