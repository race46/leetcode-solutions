class Solution {
    public boolean wordPattern(String pattern, String s) {
        String words[]=s.split(" ");
        HashMap<Character,String> map=new HashMap<>();
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<words.length;i++){
            if(map.containsKey(pattern.charAt(i))){
                if(!map.get(pattern.charAt(i)).equals(words[i]))
                    return false;
            }else{
                if(set.contains(words[i]))
                    return false;
                map.put(pattern.charAt(i),words[i]);
                set.add(words[i]);
            }

        }
        return true;
    }
}
