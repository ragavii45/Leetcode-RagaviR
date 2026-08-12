// Last updated: 12/08/2026, 21:35:35
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
        return false;
        Map<Character,Integer> m = new HashMap<>();
        Map<Character,Integer> targetMap = new HashMap<>();
        for(Integer i=0;i<s.length();i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(m.get(a)==targetMap.get(b)){
                m.put(a,i);
                targetMap.put(b,i);
            }else{
                return false;
            }        
        }
        return true;
    }
}