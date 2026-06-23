class Solution {
    public void dfs(ArrayList<Integer> arr , TreeNode root){
        if(root == null) return;
        dfs(arr , root.left);
        arr.add(root.val);
        dfs(arr , root.right);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        dfs(arr , root);
        return arr;
    }
}