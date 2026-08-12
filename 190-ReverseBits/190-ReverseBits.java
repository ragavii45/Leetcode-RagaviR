// Last updated: 12/08/2026, 21:36:06
class Solution {
    public int reverseBits(int n) {
        int mask;
        int temp=0;
        for(int i=0;i<32;i++){
            mask=n&1;
      temp=(temp<<1)|mask;
      n=n>>1;}
      return temp;
    }
}