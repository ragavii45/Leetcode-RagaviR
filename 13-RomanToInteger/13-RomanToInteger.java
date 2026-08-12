// Last updated: 12/08/2026, 21:41:08
class Solution {
    int value(char c){
        switch(c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }
    public int romanToInt(String s) {
        int r = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(i+1<s.length()){
              char n = s.charAt(i+1);
            if(value(c)>=value(n))
              r+=value(c);
            else{
                r+=value(n)-value(c);
                i++;
            }
            }
            else{
                r+=value(c);
            }
        }
        return r;
    }
}