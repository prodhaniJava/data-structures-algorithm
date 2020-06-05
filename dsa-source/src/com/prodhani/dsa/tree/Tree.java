package com.prodhani.dsa.tree;

import com.prodhani.dsa.linkedlist.Node;

public class Tree {

	static public int countingNode(Node root) {
		if (root == null) {
			return 0;
		} else {
			int leftCount = countingNode(root.left);
			int rightCount = countingNode(root.right);
			return leftCount + rightCount + 1;
		}

	}

	public static <T extends Comparable<?>> int maxLevel(Node node) {
		if (node == null)
			return 0;

		return Math.max(Tree.maxLevel(node.left), Tree.maxLevel(node.right)) + 1;
	}
}
