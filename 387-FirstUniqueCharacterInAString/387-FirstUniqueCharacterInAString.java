// Last updated: 11/08/2026, 14:21:06
class Solution {
    public int firstUniqChar(String s) {
        int f[]=new int[256];
        for(char ch : s.toCharArray())
            f[ch]++;
        int i=0;
        for(i =0;i<s.length();i++){
            if(f[s.charAt(i)]==1){
               return i;   
            } 
        }
        return -1;
    }
}