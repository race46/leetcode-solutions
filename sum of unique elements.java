class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
        HashMap<Integer,Boolean> map=new HashMap<>();
        for(Integer i:nums){
            if(!map.containsKey(i)){
                map.put(i,true);
            }else{
                map.put(i,false);
            }
        }
        for(Integer i:map.keySet()){
            if(map.get(i))
                sum+=i;
        }
        
        return sum;
    }
}
