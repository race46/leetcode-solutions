class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        int arr[]=new int[26];
        for(Character c:s.toCharArray())
            arr[(int)c-97]++;
        for(Character c:t.toCharArray()){
            arr[(int)c-97]--;
            if(arr[(int)c-97]<0)
                return false;
        }
        return true;
    }
}
