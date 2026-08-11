// Last updated: 11/08/2026, 14:17:51
class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            int len = sb.length();
            if (len > 0 && sb.charAt(len - 1) == c) {
                sb.deleteCharAt(len - 1); 
            } else {
                sb.append(c); 
            }
        }
        return sb.toString();
    }
}
