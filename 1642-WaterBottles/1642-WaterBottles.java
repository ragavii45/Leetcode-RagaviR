// Last updated: 11/08/2026, 14:16:47
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totaldrank = numBottles;
        int empty = numBottles;
        while (empty >= numExchange) { 
            int newFull = empty / numExchange;
            totaldrank += newFull;
            empty = empty % numExchange + newFull;
        }
        return totaldrank;
    }
}