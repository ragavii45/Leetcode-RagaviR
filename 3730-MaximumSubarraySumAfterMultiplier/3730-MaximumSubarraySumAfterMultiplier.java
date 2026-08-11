// Last updated: 11/08/2026, 14:14:28
class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        return Math.max(solveMultiply(nums,k),solveDivide(nums,k));
    }
    private long solveMultiply(int[] nums,int k){
        long NEG = Long.MIN_VALUE/4;
        long noOp = NEG;
        long inOp = NEG;
        long done = NEG;
        long ans = NEG;
        for(int x:nums){
            long v =1L*x*k;
            long newNoOp=Math.max(noOp+x,(long)x);
            long newInOp=Math.max(Math.max(inOp+v,noOp+v),v);
            long newDone=Math.max(Math.max(done+x,inOp+x),x);
            noOp=newNoOp;
            inOp=newInOp;
            done=newDone;
            ans=Math.max(ans,Math.max(inOp,done));
        }
        return ans;
    }
    private long solveDivide(int[] nums,int k){
        long NEG = Long.MIN_VALUE/4;
        long noOp = NEG;
        long inOp = NEG;
        long done = NEG;
        long ans = NEG;
        for(int x:nums){
            long v = (x>=0)?x/k:-((-x)/k);
            long newNoOp=Math.max(noOp+x,(long)x);
            long newInOp=Math.max(Math.max(inOp+v,noOp+v),v);
            long newDone=Math.max(Math.max(done+x,inOp+x),x);
            noOp=newNoOp;
            inOp=newInOp;
            done=newDone;
            ans=Math.max(ans,Math.max(inOp,done));
        }
        return ans;
    }
}