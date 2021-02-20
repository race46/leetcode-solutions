class Solution {
    public int countPrimes(int n) {
        boolean table[]=new boolean[n];
        int total=1;
        for(int i=3;i<n;i+=2){
            if(!table[i]){
                for(int j=3*i;j<n;j+=i)
                    table[j]=true;
                total++;
            }
        }
        return n>2?total:0;
    }
}
