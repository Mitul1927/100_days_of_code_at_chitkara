class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        if (n == 1) return new int[]{-1};   // would still be handled without this check

        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int minStart = Integer.MAX_VALUE;
            int finalIdx = -1;
            int END = intervals[i][1];

            for (int j = 0; j < n; j++) {
                int currStart = intervals[j][0];

                if (currStart >= END && currStart < minStart) {
                    minStart = currStart;
                    finalIdx = j;
                }
            }

            ans[i] = finalIdx;
        }

        return ans;
    }
}

// TC: O(n ^ 2), SC: O(n)
