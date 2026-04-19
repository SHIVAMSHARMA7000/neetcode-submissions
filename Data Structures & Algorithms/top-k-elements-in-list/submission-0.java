class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> a = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            a.put(nums[i],a.getOrDefault(nums[i],0)+1);

        }
        int b[][] =  new int[a.size()][2];
        int l = 0;
        for(Map.Entry<Integer,Integer> p :  a.entrySet()){
            b[l][0] = p.getKey();
            b[l][1] = p.getValue();
            l++;

        }

       Arrays.sort(b, (x, y) -> Integer.compare(y[1], x[1]));
        int c[] = new int[k];
        int count = 0;
        for(int i = 0;i<k;i++){
           c[i] = b[i][0];

        }

        return c;
        
        
    }
}
