class Solution {
    public int singleNumber(int[] nums) {
        int res=0;
        for(Integer i:nums)
            res^=i;//xor operation
        return res;
    }
}
