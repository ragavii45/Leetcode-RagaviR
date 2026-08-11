// Last updated: 11/08/2026, 14:14:11
class Solution {
    public int maxDistance(String moves) {
        int x=0,y=0,e=0;
        for(char ch:moves.toCharArray()){
            if(ch == 'R') x++;
            else if(ch == 'L') x--;
            else if(ch == 'U') y++;
            else if(ch == 'D') y--;
            else e++;
        }
        return Math.abs(x)+Math.abs(y)+e;
    }
}