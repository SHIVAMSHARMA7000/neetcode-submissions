class Solution {
    public int maxArea(int[] heights) {
        int water = 0;
        int max = 0;
        for(int i = 0;i<heights.length-1;i++){
            water = 0;
            for(int j = i+1;j<heights.length;j++){
                water = Math.min(heights[i],heights[j])*(j-i);
                max = Math.max(water,max);
            }

        }

        return max;
        
    }
}
