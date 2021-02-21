class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        HashMap<Integer,TreeNode> map1=new HashMap<>();
        HashMap<Integer,TreeNode> map2=new HashMap<>();
        map1.put(root.val,root);
        while(!map1.isEmpty()){
            for(Integer i:map1.keySet()){
                TreeNode n=map1.get(i);
                if(n.left!=null&&n.right!=null)
                    if((n.left.val==x&&n.right.val==y)||(n.left.val==y&&n.right.val==x))
                        return false;
                if(n.left!=null)
                    map2.put(n.left.val,n.left);
                if(n.right!=null)
                    map2.put(n.right.val,n.right);
            }
            if(map2.get(x)!=null&&map2.get(y)!=null)
                return true;
            map1=map2;
            map2=new HashMap<>();
        }
        return false;
        
    }
}
