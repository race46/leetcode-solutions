class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set=new HashSet<>();
        int total=0;
        for(Character c:jewels.toCharArray())
            set.add(c);
        for(Character c:stones.toCharArray())
            if(set.contains(c))
                total++;
        return total;
    }
}
