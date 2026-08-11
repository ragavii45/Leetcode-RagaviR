// Last updated: 11/08/2026, 14:21:01
class Solution {
    public String decodeString(String str) {
        Stack<Integer> numst =new Stack<>();
        Stack<String> st= new Stack<>();
        int n=0;
        String s="";
        for(char c:str.toCharArray()){
            if(Character.isDigit(c))
            n=n*10+c-'0';
            else if(Character.isAlphabetic(c))
            s+=c;
            else if (c=='['){
                numst.push(n);
                st.push(s);
                n=0;
                s="";
            }
            else{
                StringBuilder temp =new StringBuilder();
                int t=numst.pop();
                for(int i=0;i<t;i++)
                temp.append(s);
                s=st.pop()+ temp.toString();
            }

        }
        return s;
    }
}