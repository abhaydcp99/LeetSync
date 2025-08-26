class Solution {
    public Node connect(Node root) {
        if (root == null) return null;
        
        // If left and right exist, connect them
        if (root.left != null) {
            root.left.next = root.right;
            
            // Connect right child to the left child of root's next
            if (root.next != null) {
                root.right.next = root.next.left;
            }
        }
        
        // Recurse down the tree
        connect(root.left);
        connect(root.right);
        
        return root;
    }
}
