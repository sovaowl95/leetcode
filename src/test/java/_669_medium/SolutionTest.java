package _669_medium;

import lib.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

  @Test
  void trimBST() {
    final Solution solution = new Solution();
    final TreeNode treeNode = new TreeNode(1, new TreeNode(0), new TreeNode(2));

    final TreeNode result = solution.trimBST(treeNode, 1, 2);

    assertEquals("TreeNode(val=1, left=null, right=TreeNode(val=2, left=null, right=null))", result.toString());
  }

  @Test
  void trimBST2() {
    final Solution solution = new Solution();
    final TreeNode treeNode
        = new TreeNode(3,
                       new TreeNode(0, null, new TreeNode(2, new TreeNode(1), null)),
                       new TreeNode(4));

    final TreeNode result = solution.trimBST(treeNode, 1, 3);

    assertEquals("TreeNode(val=3, left=TreeNode(val=2, left=TreeNode(val=1, left=null, right=null), right=null), right=null)", result.toString());
  }


  @Test
  void trimBST3() {
    final Solution solution = new Solution();
    final TreeNode treeNode
        = new TreeNode(3,
                       new TreeNode(1, null, new TreeNode(2)),
                       new TreeNode(4));

    final TreeNode result = solution.trimBST(treeNode, 3, 4);

    assertEquals("TreeNode(val=3, left=null, right=TreeNode(val=4, left=null, right=null))", result.toString());
  }
}