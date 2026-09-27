// Last updated: 27/09/2026, 08:26:01
1class Solution {
2    public int[] rearrangeArray(int[] nums) {
3        int[] c = new int[101];
4        for(int num:nums){
5            c[num]++;
6        }
7        int[] a = new int[nums.length];
8        int in =0;
9        while(in<nums.length){
10            for(int i=1;i<=100;i++){
11                if(c[i]>0){
12                    a[in]=i;
13                    in++;
14                     c[i]--;      
15                }
16            }
17        }
18        return a;
19    }
20}