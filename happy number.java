class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<>();
        while(n!=1){
            if(set.contains(n))
                return false;
            set.add(n);
            n=next(n);
        }
        return true;
    }
    int next(int n){
        int r=0;
        while(n>0){
            r+=(n%10)*(n%10);
            n/=10;
        }
        return r;
    }
}
