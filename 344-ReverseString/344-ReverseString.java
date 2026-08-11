// Last updated: 11/08/2026, 14:21:13
class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        int s1=0;
        int e=n-1;
        while(s1<e){
            char a=s[s1];
            s[s1]=s[e];
            s[e]=a;
            s1++;
            e--;
        }
    }
}