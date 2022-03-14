package mortal.algorithm.com.node;

/**
 * @author mortal
 * @create 2021/8/16 18:06
 */
public class NodeTest2 {

//    public static void main(String[] args) {
//        ListNode listNode1 = create(new ListNode(0), 0);
//        ListNode listNode2 = create(new ListNode(0), 9);
//        System.err.println("start");
//        ListNode listNode = addTwoNumbers(listNode1, listNode2);//打印输出
//        while (listNode != null) {
//            System.err.println("节点:" + listNode.val);
//            listNode = listNode.next;
//        }
//        System.err.println("done");
//    }
//
//    public static ListNode create(ListNode nodeSta, int count) {
//        ListNode nextNode;                           //声明一个变量用来在移动过程中指向当前节点
//        nextNode = nodeSta;                            //指向首节点
//
//        //创建链表
//        for (int i = 1; i < count; i++) {
//            ListNode node = new ListNode(9);         //生成新的节点
//            nextNode.next = node;                      //把心节点连起来
//            nextNode = nextNode.next;                  //当前节点往后移动
//        } //当for循环完成之后 nextNode指向最后一个节点，
//        nextNode = nodeSta;
//        return nextNode;
//    }

//    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode head = l1;
//        ListNode head2 = l2;
//        int overTen = 0;
//        ListNode result = new ListNode(0);    //创建首节点
//        ListNode nextNode=result;                     //声明一个变量用来在移动过程中指向当前节点
//        while (null != head || null != head2 || overTen > 0) {
//            int val = head==null?0:head.val;
//            int val2 =head2==null?0 :head2.val;
//
//            int add = val + val2 + overTen;
//            overTen = (add / 10);
//            int divid = add % 10;
//
//            ListNode node = new ListNode(divid);  //生成新的节点
//            nextNode.next = node;               //把新节点连起来
//            nextNode = nextNode.next;           //当前节点往后移动
//
//            head = head==null?null:head.next;
//            head2 = head2==null?null:head2.next;
//
//        }
//        return result.next;
//    }
}
