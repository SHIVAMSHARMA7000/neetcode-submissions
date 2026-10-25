class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> a = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            a.put(arr[i],a.getOrDefault(arr[i],0)+1);
        }

        int x = -1;
        for(int i = 0;i<arr.length;i++){
            if(a.get(arr[i])==arr[i]){
                x = Math.max(arr[i],x);
            }
        }

        return x;
    }
}