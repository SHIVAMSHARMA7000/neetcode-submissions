class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> a = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            a.put(s.charAt(i),a.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i = 0;i<t.length();i++){
            a.put(t.charAt(i),a.getOrDefault(t.charAt(i),0)-1);
        }

        for(int x : a.values()){
            if(x!=0){
                return false;
            }
        }
        return true;
    }
}
