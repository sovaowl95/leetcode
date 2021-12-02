package _872_easy;

import lib.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
  public boolean leafSimilar(TreeNode root1, TreeNode root2) {
    List<Integer> l1 = new ArrayList<>();
    List<Integer> l2 = new ArrayList<>();
    toList(root1, l1);
    toList(root2, l2);

    if (l1.size() != l2.size()) {
      return false;
    }

    for (int i = 0; i < l1.size(); i++) {
      if (!l1.get(i).equals(l2.get(i))) {
        return false;
      }
    }

    return true;
  }

  void toList(TreeNode root, List<Integer> list) {
    if (root == null) {
      return;
    }

    if (root.left == null && root.right == null) {
      list.add(root.val);
    }

    toList(root.left, list);
    toList(root.right, list);
  }
}
