class Solution {
    public int maxAscendingSum(int[] nums) {
        
        int sum = nums[0];
        int max  = sum;

        for(int j = 1;j<nums.length;j++){
           
            if(nums[j]>nums[j-1]){
                sum += nums[j];
                max = Math.max(sum,max);
            }

            

            else{
                sum = nums[j];
                
            }
           

        }


        return max;
        
    }
}