// Last updated: 11/08/2026, 14:15:06
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int d =0;
        while(mainTank >= 5){
            mainTank -=5;
            d +=50;
            if(additionalTank >0){
                mainTank +=1;
                additionalTank -=1;
            }
        }
        d+= mainTank *10;
        return d;
    }
}