class Solution {
    public int repeatedNTimes(int[] A) {
        HashSet<Integer> set=new HashSet<>();
        for(Integer i:A){
            if(set.contains(i))
                return i;
            set.add(i);
        }
        return -1;
    }
}
