package _832_easy;

class Solution {
  public int[][] flipAndInvertImage(int[][] image) {
    int n = image.length;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j * 2 < n; j++) {
        if (j == n - 1 - j) {
          reverse(image, i, j);
        } else {
          int temp = image[i][j];
          image[i][j] = image[i][n - 1 - j];
          image[i][n - 1 - j] = temp;

          reverse(image, i, j);
          reverse(image, i, n - 1 - j);
        }
      }
    }
    return image;
  }

  void reverse(int[][] image, int i, int j) {
    if (image[i][j] == 1) {
      image[i][j] = 0;
    } else {
      image[i][j] = 1;
    }
  }
}
