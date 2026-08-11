// Last updated: 11/08/2026, 14:14:08
class Solution {
    public boolean canMakeSubsequence(String s, String t) {
        // int i=0,j=0;
        // boolean u=false;
        // while(i<s.length()&&j<t.length()){
        //     if(s.charAt(i)==t.charAt(j)){
        //         i++;
        //         j++;
        //     }else{
        //         if(!u){
        //             u=true;
        //             i++;
        //             j++;
        //         }else{
        //             j++;
        //         }
        //     }
        // }
        // if(i==s.length()-1 && !u)
        //     return true;
        // return i==s.length();
        int n=s.length(),m=t.length();
        if(n>m)
            return false;
        int[] pre=new int[n+1];
        int j=0;
        pre[0]=-1;
        for(int i=0;i<n;i++){
            while(j<m && s.charAt(i)!=t.charAt(j))
                j++;
            if(j==m){
                pre[i+1]=m;
            }else{
                pre[i+1]=j++;
            }
        }
        int [] suf=new int[n+1];
        j=m-1;
        suf[n]=m;
        for(int i=n-1;i>=0;i--){
            while(j>=0 && s.charAt(i)!=t.charAt(j))
                j--;
            if(j<0){
                suf[i]=-1;
            }else{
                suf[i]=j--;
            }
        }
        if(pre[n]!=m)
            return true;
        for(int i=0;i<n;i++){
            int l=pre[i];
            int r=suf[i+1];
            if(l<r-1)
                return true;
        }
        return false;
    }
}