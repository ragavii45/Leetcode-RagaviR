// Last updated: 12/08/2026, 21:37:09
class Solution {
    int calculate(int a,int b,String ch){
        int ans=0;
        switch(ch){
            case"+": ans=a+b; break;
            case"-": ans=b-a; break;
            case"*": ans=a*b; break;
            case"/": ans=b/a; break;
        }
        return ans;
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String ch:tokens){
            if(ch.equals("+") || ch.equals("*") || ch.equals("-") || ch.equals("/")){
            int a=st.pop();
            int b=st.pop();
            int ans = calculate(a,b,ch);
            st.push(ans);
        }
        else{
            st.push(Integer.parseInt(ch));
        }
    }
    return st.peek();
}
}