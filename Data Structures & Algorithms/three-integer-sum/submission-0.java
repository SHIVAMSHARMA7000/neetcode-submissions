class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> a = new HashSet<>();
       
        
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                for(int k = j+1;k<nums.length;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> c = new ArrayList<>();
                        c.add(nums[i]);
                        c.add(nums[j]);
                        c.add(nums[k]);
                    Collections.sort(c);
            a.add(c);
                    }
                }

            }
            
        }        

        return new ArrayList<>(a);
    }

}
