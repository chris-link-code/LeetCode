package com.demo.others;

import com.demo.bean.TreeNode;

/**
 * @author chris
 * @create 2022/10/2
 * <p>
 * 深度优先遍历(Depth First Search, 简称 DFS)
 */
public class DFS {
    public static void run() {
        TreeNode node3 = new TreeNode(3, null, null);
        TreeNode node4 = new TreeNode(4, null, null);
        TreeNode node2 = new TreeNode(2, node3, node4);
        TreeNode node6 = new TreeNode(6, null, null);
        TreeNode node5 = new TreeNode(5, null, node6);
        TreeNode root = new TreeNode(1, node2, node5);
        process(root);
    }

    public static void process(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.value);
        process(root.left);
        process(root.right);
    }
}
