class Solution {
    public int findJudge(int N, int[][] trust) {
        int arr[]=new int[N];
        for(int i[]:trust){
            arr[i[0]-1]++;arr[i[1]-1]--;
        }
        for(int i=0;i<arr.length;i++)
            if(arr[i]==1-N)
                return i+1;
        return -1;
    }
}
