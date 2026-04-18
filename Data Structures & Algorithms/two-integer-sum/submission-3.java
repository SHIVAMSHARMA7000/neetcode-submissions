class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> a = new HashMap<>();
        int b[] = new int[2];
        for(int i = 0;i<nums.length;i++){
            if(a.containsKey(target-nums[i])){
                b[0] = a.get(target-nums[i]);
                b[1] = i;
            }
            a.put(nums[i],i);
        }
        

        return b;
    }
}
