class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int total=0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                total+=map.get(nums[i]);
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        return total;
        
    }
}
