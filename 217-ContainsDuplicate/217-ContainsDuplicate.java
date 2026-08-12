// Last updated: 12/08/2026, 21:35:22
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> s = new HashSet<>();
        for (int num : nums) {
            if (!s.add(num)) {
                return true; 
            }
        }
        return false; 
    }
}
