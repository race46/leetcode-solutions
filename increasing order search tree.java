class Solution {
    public TreeNode increasingBST(TreeNode root) {
       Stack<TreeNode> s=new Stack<>();
        inOrder(root,s);
        TreeNode newRoot=s.pop();
        TreeNode temp=newRoot;
        while(!s.isEmpty()){
            temp.right=s.pop();
            temp.left=null;
            temp=temp.right;
        }
        temp.left=temp.right=null;
        return newRoot;
        
    }
    public void inOrder(TreeNode root, Stack<TreeNode> s){
        if(root==null)
            return;
        inOrder(root.right,s);
        s.push(root);
        inOrder(root.left,s);
    }
}
