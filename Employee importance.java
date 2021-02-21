class Solution {
    public int getImportance(List<Employee> employees, int id) {
        HashMap<Integer,Employee> map=new HashMap<>();
        for(Employee e:employees)
            map.put(e.id,e);
        Queue<Integer> q=new ArrayDeque<>();
        q.add(id);
        int total=0;
        while(!q.isEmpty()){
            int i=q.remove();
            total+=map.get(i).importance;
            for(Integer so:map.get(i).subordinates){
                q.add(so);
            }
        }
        return total;
    }
}
