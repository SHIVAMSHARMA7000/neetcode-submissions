class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer> a = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            a.put(s.charAt(i),a.getOrDefault(s.charAt(i),0)+1);
        }

        
        int emin = Integer.MAX_VALUE;
        int omax = 0;
        

        for(int x : a.values()){
            if(x%2==0){
               
                emin = Math.min(x,emin);

            }
            else{
                omax = Math.max(omax,x);
            }
        }


      
      return omax-emin;
        
    }
}