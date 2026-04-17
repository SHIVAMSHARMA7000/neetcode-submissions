class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> a = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            a.put(nums[i],a.getOrDefault(nums[i],0)+1);

                    }
        for(int k : a.keySet()){
            if(a.get(k)>1){
                return true;
            }
        }

        return false;
        
    }
}