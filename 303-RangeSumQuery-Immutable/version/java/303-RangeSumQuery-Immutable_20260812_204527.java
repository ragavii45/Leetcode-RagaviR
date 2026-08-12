// Last updated: 12/08/2026, 20:45:27
1class NumArray {
2
3    private int[] prefix;
4
5    public NumArray(int[] nums) {
6
7        prefix = new int[nums.length + 1];
8
9        for (int i = 0; i < nums.length; i++) {
10            prefix[i + 1] =
11                prefix[i] + nums[i];
12        }
13    }
14
15    public int sumRange(int left, int right) {
16
17        return prefix[right + 1] - prefix[left];
18    }
19}