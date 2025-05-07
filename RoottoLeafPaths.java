class Solution {
    public static void getPaths(Node root, ArrayList<Integer>path, ArrayList<ArrayList<Integer>>ans) {
        if(root.left == null && root.right == null) {
            path.add(root.data);
            ans.add(new ArrayList<>(path));
            path.remove(path.size() - 1);
            return;
        }
        path.add(root.data);
        if(root.left != null) {
            getPaths(root.left, path, ans);
        }
        if(root.right != null) {
            getPaths(root.right, path, ans);
        }
        path.remove(path.size() - 1);
    }
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        // code here
        ArrayList<ArrayList<Integer>>ans = new ArrayList<>();
        getPaths(root, new ArrayList<>(), ans);
        return ans;
        
    }
}