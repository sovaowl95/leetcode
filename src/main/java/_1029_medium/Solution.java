package _1029_medium;

class Solution {
  public int twoCitySchedCost(int[][] costs) {
    int n = costs.length;
    int[][] memo = new int[n][n];
    final int helper = helper(costs, 0, 0, n, memo);
    return helper;
  }

  private int helper(int[][] costs, int a, int b, int n, int[][] memo) {
    if (a + b == n) return 0;
    if (memo[a][b] != 0) return memo[a][b];

    int take = Integer.MAX_VALUE;
    int skip = Integer.MAX_VALUE;
    if (a < n / 2) take = costs[a + b][0] + helper(costs, a + 1, b, n, memo);
    if (b < n / 2) skip = costs[a + b][1] + helper(costs, a, b + 1, n, memo);
    memo[a][b] = Math.min(take, skip);

    return memo[a][b];
  }
//  public int twoCitySchedCost(int[][] costs) {
//    int N = costs.length / 2;
//    int[][] dp = new int[N + 1][N + 1];
//    for (int i = 1; i <= N; i++) {
//      dp[i][0] = dp[i - 1][0] + costs[i - 1][0];
//    }
//
//    print(dp);
//
//    for (int j = 1; j <= N; j++) {
//      dp[0][j] = dp[0][j - 1] + costs[j - 1][1];
//    }
//
//    print(dp);
//
//    for (int i = 1; i <= N; i++) {
//      for (int j = 1; j <= N; j++) {
//        dp[i][j] = Math.min(dp[i - 1][j] + costs[i + j - 1][0], dp[i][j - 1] + costs[i + j - 1][1]);
//      }
//    }
//
//    print(dp);
//
//    return dp[N][N];
//  }

  private void print(int[][] dp) {
    System.out.println();
    for (int i = 0; i < dp.length; i++) {
      for (int j = 0; j < dp[i].length; j++) {
        System.out.print(dp[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();
  }
}