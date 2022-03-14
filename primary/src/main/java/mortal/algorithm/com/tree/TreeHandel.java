package mortal.algorithm.com.tree;


import java.util.Stack;

/**
 * 二叉树处理类
 * 先序、中序、后续分别代表读取自己值的顺序
 * 按照方法又分为递归和非递归
 *
 * @author mortal
 * @create 2021/8/17 17:01
 */
public class TreeHandel {

    public static void main(String[] args) {
        TreeNode simpleTree = createSimpleTree();
        System.err.println("递归先序开始");
        recursiveBefore(simpleTree);

        System.err.println("");
        System.err.println("递归中序开始");
        recursiveIn(simpleTree);

        System.err.println("");
        System.err.println("递归后序开始");
        recursiveAfter(simpleTree);

        System.err.println("");
        System.err.println("遍历排序先序开始");
        traversalBefore(simpleTree);

        System.err.println("");
        System.err.println("遍历排序中序开始");
        traversalIn(simpleTree);

        System.err.println("");
        System.err.println("遍历排序后序开始");
        traversalAfter(simpleTree);

    }

    public static TreeNode createSimpleTree() {
        TreeNode node0 = new TreeNode(0);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        node3.left = node1;
        node1.left = node0;
        node1.right = node2;
        node3.right = node4;
        node4.right = node6;
        node6.left = node5;
        return node3;
    }

    /**
     * 递归先序
     *
     * @param treeNode
     */
    private static void recursiveBefore(TreeNode treeNode) {
        if (null == treeNode) return;
        visit(treeNode);
        recursiveBefore(treeNode.left);
        recursiveBefore(treeNode.right);
    }

    /**
     * 递归中序
     *
     * @param treeNode
     */
    private static void recursiveIn(TreeNode treeNode) {
        if (null == treeNode) return;
        recursiveIn(treeNode.left);
        visit(treeNode);
        recursiveIn(treeNode.right);
    }


    /**
     * 递归后续
     *
     * @param treeNode
     */
    private static void recursiveAfter(TreeNode treeNode) {
        if (null == treeNode) return;
        recursiveAfter(treeNode.left);
        recursiveAfter(treeNode.right);
        visit(treeNode);
    }


    private static void traversalBefore(TreeNode treeNode) {
        Stack<TreeNode> treeNodeStack = new Stack<TreeNode>();
        TreeNode currentNode = treeNode;

        while (null != currentNode || !treeNodeStack.empty()) {
            while (null != currentNode) {
                visit(currentNode);
                treeNodeStack.push(currentNode);
                currentNode = currentNode.left;
            }
            if (!treeNodeStack.empty()) {
                TreeNode pop = treeNodeStack.pop();
                currentNode = pop.right;
            }
        }
    }

    private static void traversalIn(TreeNode treeNode) {
        Stack<TreeNode> treeNodeStack = new Stack<TreeNode>();
        TreeNode currentNode = treeNode;

        while (null != currentNode || !treeNodeStack.empty()) {
            while (null != currentNode) {
                treeNodeStack.push(currentNode);
                currentNode = currentNode.left;
            }
            if (!treeNodeStack.empty()) {
                TreeNode pop = treeNodeStack.pop();
                visit(pop);
                currentNode = pop.right;
            }
        }
    }

    private static void traversalAfter(TreeNode treeNode) {
        Stack<TreeNode> treeNodeStack = new Stack<TreeNode>();
        TreeNode currentNode = treeNode;
        TreeNode lastNode = treeNode;
        while (null != currentNode || !treeNodeStack.empty()) {
            while (null != currentNode) {
                treeNodeStack.push(currentNode);
                currentNode = currentNode.left;
            }
            currentNode = treeNodeStack.peek();
            if (currentNode.right == null || lastNode == currentNode.right) {
                visit(currentNode);
                treeNodeStack.pop();
                lastNode = currentNode;
                currentNode = null;
            }else {
                currentNode = currentNode.right;
            }
        }
    }

    private static void visit(TreeNode node) {
        System.err.print(node.val);
    }
}
