class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> b = new HashSet<>();        
        HashSet<Integer> a = new HashSet<>();

        for(int i =0;i<nums1.length;i++){
            a.add(nums1[i]);
        }        
        for(int i =0;i<nums2.length;i++){
            b.add(nums2[i]);
        }  

        List<List<Integer>> c = new ArrayList<>();
         List<Integer> l1 = new ArrayList<>();
         List<Integer> l2 = new ArrayList<>();

         for(int x : a){
            if(!b.contains(x)){
                l1.add(x);
            }
         }
       

        c.add(l1);

        for(int x : b){
            if(!a.contains(x)){
                l2.add(x);
            }
         }

          
        

        c.add(l2);



        return c;

              
    }
}