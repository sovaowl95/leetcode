package _669_medium;

import lib.TreeNode;

class Solution {
  public TreeNode trimBST(TreeNode root, int low, int high) {
    return recurs(root, low, high);
  }

  TreeNode recurs(TreeNode root, int low, int high) {
    if (root == null) {
      return null;
    }

    if (root.val > high) {
      return recurs(root.left, low, high);
    } else if (root.val < low) {
      return recurs(root.right, low, high);
    }

    root.right = recurs(root.right, low, high);
    root.left = recurs(root.left, low, high);

    return root;
  }
}