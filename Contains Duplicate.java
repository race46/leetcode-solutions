class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(Integer i:nums){
            if(map.containsKey(i))
                return true;
            map.put(i,i);
        }
        return false;        
    }
}
