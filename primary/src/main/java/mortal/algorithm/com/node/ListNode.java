package mortal.algorithm.com.node;

/**
 * 单向链表
 * @author mortal
 * @create 2021/8/16 18:06
 */
public class ListNode {
    Object val;
    ListNode next;

    ListNode() {
    }

    ListNode(Object val) {
        this.val = val;
    }

    ListNode(Object val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
