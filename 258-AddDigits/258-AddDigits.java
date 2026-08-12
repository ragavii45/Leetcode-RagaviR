// Last updated: 12/08/2026, 21:34:30
class Solution {
    public int addDigits(int num) {
        int d;
        int sum=0;
        while(num>9){
            sum=0;
        while(num!=0){
            d=num%10;
            sum+=d;
            num=num/10;
        }
        num=sum;
        }
        return num;
    }
}